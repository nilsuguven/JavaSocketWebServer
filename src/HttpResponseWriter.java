import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpResponseWriter {

    public void sendResponse(Socket clientSocket, String html)
            throws IOException {

        byte[] body = html.getBytes(StandardCharsets.UTF_8);

        String response =
                "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: text/html; charset=UTF-8\r\n" +
                        "Content-Length: " + body.length + "\r\n" +
                        "Connection: close\r\n" +
                        "\r\n";

        OutputStream output = clientSocket.getOutputStream();

        output.write(response.getBytes(StandardCharsets.UTF_8));
        output.write(body);
        output.flush();
    }
}