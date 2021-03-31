package base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by forgot on 2017/7/26.
 */
public class HttpSample {
    public static void main(String[] args) {
        readContentFromPost();
    }

    public static void readContentFromPost() {
        try {
            // Post请求的url，与get不同的是不需要带参数
            URL postUrl = new URL("http://quan.suning.com/getSysTime.do");
            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
            //打开读写属性，默认均为false
            connection.setDoOutput(true);
            connection.setDoInput(true);
            // 设置请求方式，默认为GET
            connection.setRequestMethod("GET");
            connection.connect();

            // 定义 BufferedReader输入流来读取URL的响应
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
