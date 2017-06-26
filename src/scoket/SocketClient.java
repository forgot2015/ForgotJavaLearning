package scoket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by forgot on 2017/6/26.
 */
public class SocketClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("localhost",SocketServer.PORT);
        if (socket.isConnected()){
            OutputStream os =null;
            InputStream is = null;
            while (true) {
                try {
                    //输入消息发送
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String in = br.readLine();
                    os = socket.getOutputStream();
                    os.write(in.getBytes());//"hello".getBytes());
                    os.flush();

                    //收到返回消息
                    is = socket.getInputStream();
                    byte[] resp = new byte[100];
                    is.read(resp);
                    System.out.println("response:" + new String(resp));
                } catch (Exception e) {
                    e.printStackTrace();
                    if(os != null)
                        os.close(); //由于是长连接，抛异常时要关闭os，否则会broken pipe
                    if(is != null)
                        is.close();
                } finally {
                    //最后执行的步骤
                    System.out.println("do nothing");
                    System.out.println("执行操作");
                }

            }
        }

    }
}
