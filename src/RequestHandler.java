
import java.net.Socket;

public interface RequestHandler {

    void handle(Socket clientSocket);

}
