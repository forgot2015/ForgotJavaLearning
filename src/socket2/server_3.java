package socket2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by forgot on 2017/6/27.
 */
public class server_3 {
    public static final int PORT = 9999;//监听的端口号

    public static void main(String[] args) {
        System.out.println("sever begins");
        server_3 server = new server_3();
        server.init();
    }

    public void init() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket client = serverSocket.accept();
                //一个客户端连接就开两个线程分别处理读和写
                new Thread(new ReadHandlerThread(client)).start();
                new Thread(new WriteHandlerThread(client)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

