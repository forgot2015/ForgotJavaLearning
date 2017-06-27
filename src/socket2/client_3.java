package socket2;

import java.net.Socket;

/**
 * Created by forgot on 2017/6/27.
 */
public class client_3 {

    public static final String IP = "localhost";//服务器地址
    public static final int PORT = 9999;//服务器端口号

    public static void main(String[] args) {

        handler();
    }

    private static void handler(){
        try {
            //实例化一个Socket，并指定服务器地址和端口
            Socket client = new Socket(IP, PORT);
            System.out.println("I am a client");
            //开启两个线程，一个负责读，一个负责写
            new Thread(new ReadHandlerThread(client)).start();
            new Thread(new WriteHandlerThread(client)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

