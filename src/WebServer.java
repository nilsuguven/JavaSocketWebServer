import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private static final int PORT = 1989;

    public void start() {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            System.out.println("Sunucu baslatildi!");
            System.out.println("Port: " + PORT);

            while (true) {

                Socket clientSocket = serverSocket.accept();

                PageProvider pageProvider = new HtmlPageBuilder();

                ClientHandler handler = new ClientHandler(clientSocket, pageProvider);

                handler.handle();
            }

        } catch (IOException e) {
            System.out.println("Sunucu hatasi: " + e.getMessage());
        }
    }
}