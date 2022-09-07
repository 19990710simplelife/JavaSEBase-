package cn.simplelife.work._05filereader;

import java.io.*;

/**
 * @ClassName FileReaderDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 9:56
 * @Version 1.0
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        // 1、 确定数据源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\a.txt");
        try {
            // 2、建立管道
            Reader fileReader = new FileReader(file);
            // 3、读取数据
            char[] chars = new char[3];
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = fileReader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            System.out.print(stringBuilder.toString());

            // 4、关闭资源
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
