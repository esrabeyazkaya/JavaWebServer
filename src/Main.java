
public class Main {

    public static void main(String[] args) {

        HtmlProvider htmlProvider = new HtmlGenerator();

        HttpResponseFormatter responseFormatter = new HttpResponse();

        RequestHandler requestHandler =
                new ClientHandler(htmlProvider, responseFormatter);

        WebServer server = new WebServer(1989, requestHandler);

        server.start();
    }
}
