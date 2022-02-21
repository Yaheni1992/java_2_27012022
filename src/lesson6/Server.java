package lesson6;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        new Server();
    }
    public Server(){
        ServerSocket serv = null;
        Socket socket = null;
        try {
            serv = new ServerSocket(3120);
            System.out.println("Сервер  подключен");
            socket  = serv.accept();
            System.out.println("Клиент подключился");
            new Client(socket , "Сервер");
            while(true){
                if(socket .isClosed()){
                    break;
                }
            }
            serv.close();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Ошибка сервера");
        } finally {
            try {
                serv.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
