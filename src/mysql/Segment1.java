package mysql;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Segment1 {
    public static void main(String[] args) {
//        for (int i = 10000; i < 100000; i++) {
////            System.out.println("insert into permission values ("+i+","+i+","+"\"putong\","+"\"普通\","+"0,\""+System.currentTimeMillis()+"\",\""+System.currentTimeMillis()+"\");");
//            String str = "insert into permission values (" + i + "," + i + "," + "\"putong\"," + "\"普通\"," + "0,\"" + System.currentTimeMillis() + "\",\"" + System.currentTimeMillis() + "\");";
//            System.out.println("正在拷贝："+str);
//            TextToFile("SqlStr.txt", str);
//        }
//        System.out.println("finish");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(System.currentTimeMillis());
    }

    /**
     * 传入文件名以及字符串, 将字符串信息保存到文件中
     *
     * @param strFilename
     * @param strBuffer
     */
    public static void TextToFile(final String strFilename, final String strBuffer) {
        try {
      // 创建文件对象
      File fileText = new File(strFilename);
      // 向文件写入对象写入信息
      FileWriter fileWriter = new FileWriter(fileText);
      // 写文件
      fileWriter.write(strBuffer);
      // 关闭
      fileWriter.close();
        } catch (IOException e) {
            //
            e.printStackTrace();
        }
    }
}
