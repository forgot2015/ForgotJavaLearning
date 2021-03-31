package mysql;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Segment1 {
    public static void main(String[] args) {
//        若文件不存在,则新建一个
        File fileText = new File("SqlStr.txt");
        if (!fileText.exists()) {
            try {
                fileText.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < 100; i++) {
//            System.out.println("insert into permission values ("+i+","+i+","+"\"putong\","+"\"普通\","+"0,\""+System.currentTimeMillis()+"\",\""+System.currentTimeMillis()+"\");");
            String str = "insert into permission values (" + i + "," + i + "," + "\"putong\"," + "\"普通\"," + "0,\"" + System.currentTimeMillis() + "\",\"" + System.currentTimeMillis() + "\");\n";
            System.out.println("正在拷贝：" + str);
            TextToFile("SqlStr.txt", str);
        }
        System.out.println("finish");
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
            // 追加写模式
            Files.write(
                    Paths.get(strFilename),
                    strBuffer.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
