import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientHandler {

    private final Socket clientSocket;
    private final PageProvider pageProvider;

    public ClientHandler(Socket clientSocket, PageProvider pageProvider) {
        this.clientSocket = clientSocket;
        this.pageProvider = pageProvider;
    }
    public void handle() {

        try (Socket socket = clientSocket) {

            System.out.println("Yeni baglanti alindi!");
            System.out.println("IP: " +
                    socket.getInetAddress().getHostAddress());

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),
                            StandardCharsets.UTF_8)
            );

            String requestLine = reader.readLine();

            if (requestLine == null) {
                return;
            }

            String header;

            while ((header = reader.readLine()) != null && !header.isEmpty()) {
                System.out.println(header);
                if (requestLine.startsWith("GET /favicon.ico")) {
                    return;
                }
            }

            System.out.println("Tarayicidan gelen istek:");
            System.out.println(requestLine);

            String html = pageProvider.buildPage();

            byte[] body = html.getBytes(StandardCharsets.UTF_8);

            String response =
                    "HTTP/1.1 200 OK\r\n" +
                            "Content-Type: text/html; charset=UTF-8\r\n" +
                            "Content-Length: " + body.length + "\r\n" +
                            "Connection: close\r\n" +
                            "\r\n";

            OutputStream output = socket.getOutputStream();

            output.write(response.getBytes(StandardCharsets.UTF_8));
            output.write(body);
            output.flush();

        } catch (IOException e) {
            System.out.println("Istemci hatasi: " + e.getMessage());
        }
    }
}