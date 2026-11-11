import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientHandler implements RequestHandler {

    private HtmlProvider htmlProvider;
    private HttpResponseFormatter responseFormatter;

    public ClientHandler(HtmlProvider htmlProvider,
                         HttpResponseFormatter responseFormatter) {

        this.htmlProvider = htmlProvider;
        this.responseFormatter = responseFormatter;
    }

    @Override
    public void handle(Socket clientSocket) {

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
            );
            OutputStream output = clientSocket.getOutputStream()
        ) {

            String requestLine = reader.readLine();

            System.out.println("Gelen istek: " + requestLine);

            String line;

            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                // HTTP basliklari okunur.
            }

            String html = htmlProvider.generate();

            byte[] response = responseFormatter.create(html);

            output.write(response);
            output.flush();

        } catch (IOException e) {

            System.out.println("Istemci hatasi: " + e.getMessage());

        } finally {

            try {
                clientSocket.close();
            } catch (IOException e) {
                System.out.println("Baglanti kapatilamadi.");
            }

        }
    }
}
