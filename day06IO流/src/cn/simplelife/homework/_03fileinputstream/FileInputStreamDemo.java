package cn.simplelife.homework._03fileinputstream;

import java.io.*;

/**
 * @ClassName FileInputStreamDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 15:42
 * @Version 1.0
 */

public class FileInputStreamDemo {
    public static void main(String[] args) {
        // 需求：给定一个UTF-8编码的文本型文件(a.txt),读取文件的内容到程序中。
        // 1、确定数据源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\a.txt");
        InputStream inputStream = null;
        try {
            // 2、建立管道
            inputStream = new FileInputStream(file);
            // 3、调用方法获取文件
            int input;
            StringBuilder stringBuilder = new StringBuilder();
            while ((input = inputStream.read()) != -1) {
                stringBuilder.append((char) input);
            }
            System.out.println("stringBuilder = " + stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
