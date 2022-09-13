package cn.simplelife.homework._03fileinputstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName FileInputStreamDemo1
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 16:04
 * @Version 1.0
 */

public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        // 需求：给定一个UTF-8编码的文本型文件(a.txt),读取文件的内容到程序中。
        // 1、确定目标源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\a.txt");
        InputStream fileInputStream = null;
        try {
            // 2、建立管道
            fileInputStream = new FileInputStream(file);
            // 一次读取1k的数据
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = fileInputStream.read(bytes)) != -1) {
                String s = new String(bytes, 0, len, StandardCharsets.UTF_8);
                stringBuilder.append(s);
            }
            System.out.println("stringBuilder = " + stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
