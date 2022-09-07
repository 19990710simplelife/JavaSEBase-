package cn.simplelife.work._03fileinputstrem;

import javax.annotation.processing.Filer;
import java.io.*;

/**
 * @ClassName FileInputStreamDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 9:08
 * @Version 1.0
 */

public class FileInputStreamDemo {
    public static void main(String[] args) {
        // 需求1：使用文件字节输入流，读取a.txt文件中的数据
        // 1、确定流向、输入流
        // 2、以字节流操作
        // 3、确定数据源

        // 1、确定数据源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\a.txt");

        try {
            // 2、建立管道
            InputStream fileInputStream = new FileInputStream(file);
            // 3、读取数据
            int b;
            while ((b = fileInputStream.read()) != -1) {
                System.out.print((char) b);
            }
            // 4、关闭资源
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
