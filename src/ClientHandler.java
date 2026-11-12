
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
                    new InputStreamReader(
                            socket.getInputStream(),
                            StandardCharsets.UTF_8
                    )
            );

            String requestLine = reader.readLine();

            if (requestLine == null) {
                return;
            }

            String header;

            while ((header = reader.readLine()) != null
                    && !header.isEmpty()) {
                System.out.println(header);
            }

            System.out.println("Tarayicidan gelen istek:");
            System.out.println(requestLine);

            if (requestLine.startsWith("GET /favicon.ico")) {
                return;
            }

            String html = pageProvider.buildPage();

            HttpResponseWriter responseWriter =
                    new HttpResponseWriter();

            responseWriter.sendResponse(socket, html);

        } catch (IOException e) {
            System.out.println("Istemci hatasi: " + e.getMessage());
        }
    }
}
