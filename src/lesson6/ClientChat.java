package lesson6;
import java.io.IOException;
import java.net.Socket;

public class ClientChat {
    public static void main(String[] args) {
        new ClientChat();
    }
    private final String SERVER_ADDRESS = "localhost";
    private final int SERVER_PORT = 3120;

    public ClientChat() {
        try {
            Socket sock = new Socket(SERVER_ADDRESS, SERVER_PORT);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

