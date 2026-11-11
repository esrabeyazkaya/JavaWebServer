import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private int port;
    private RequestHandler requestHandler;

    public WebServer(int port, RequestHandler requestHandler) {
        this.port = port;
        this.requestHandler = requestHandler;
    }

    public void start() {

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Web sunucusu baslatildi!");
            System.out.println("Sunucu adresi: http://localhost:" + port);

            while (true) {

                Socket clientSocket = serverSocket.accept();

                System.out.println("Yeni bir istemci baglandi.");

                requestHandler.handle(clientSocket);

            }

        } catch (IOException e) {

            System.out.println("Sunucu hatasi: " + e.getMessage());

        }
    }
}
