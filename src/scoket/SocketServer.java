package scoket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by forgot on 2017/6/26.
 */
public class SocketServer {
    public static final int PORT = 3333;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        Socket socket = serverSocket.accept();
        boolean keepAlive = true;
        while (keepAlive) {//保持长连接
            try {
                Thread.sleep(3000);//等待时间
                System.out.println("服务器等待3秒");
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            if (socket != null) {
                InputStream is = null;
                OutputStream os = null;
                try {
                    String ip = socket.getInetAddress().toString().replace("/", "");
                    System.out.println("====socket.getInetAddress()=====" + ip + ":" + PORT);
                    //设置Socket是否长连接
//                    socket.setKeepAlive(false); //关闭长连接
                    socket.setKeepAlive(true);
                    //获取输入流
                    is = socket.getInputStream();
                    //获取输出流
                    os = socket.getOutputStream();
                    System.out.println("服务器端接受请求");
                    byte[] buff = new byte[100];
                    is.read(buff);
                    String tempdata = new String(buff);  // StreamEazyUse.getContent(is);
                    System.out.println("接收到的数据为：" + tempdata);
                    String response;
                    if (tempdata.equals("forgot")) {
                        response = "欢迎forgot大人";
                    } else if (tempdata.equals("quit")) {
                        System.out.println("正在退出服务端");
                        is.close();
                        response = "已经退出服务了";
                    } else {
                        response = "welcome: " + tempdata;
                    }
                    os.write(response.getBytes());
                    os.flush();  //发送响应
//	                is.close();
//	                os.close();
                } catch (Exception e) {
                    System.out.println("出现了错误,关闭连接");
                    if (is != null)
                        is.close();
                    if (os != null)
                        os.close();
                    e.printStackTrace();

                }
            }
        }

    }
}
