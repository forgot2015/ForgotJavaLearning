package base;

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
            URL postUrl = new URL("http://app-buy-api.zjxfyb.com/api/order/del?order_sn=31707262131036268478");
            // 打开连接
            HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
            //打开读写属性，默认均为false
            connection.setDoOutput(true);
            connection.setDoInput(true);
            // 设置请求方式，默认为GET
            connection.setRequestMethod("POST");
            // Post 请求不能使用缓存
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.connect();
//            DataOutputStream out = new DataOutputStream(connection
//                    .getOutputStream());
//            //正文内容其实跟get的URL中'?'后的参数字符串一致
//            String content = " firstname= " + URLEncoder.encode(" 一个大肥人 ", "utf-8");
//            out.writeBytes(content);
//            out.flush();
//            out.close(); // flush and close
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            System.out.println(" ============================= ");
//            System.out.println(" Contents of post request ");
//            System.out.println(" ============================= ");
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            System.out.println(" ============================= ");
//            System.out.println(" Contents of post request ends ");
//            System.out.println(" ============================= ");
//            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
