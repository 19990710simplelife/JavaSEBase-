package cn.simplelife.work._07copydemo;

import java.io.*;

/**
 * @ClassName CopyDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 10:34
 * @Version 1.0
 */

public class CopyDemo {
    public static void main(String[] args) {
        // 创建数据源
        File in = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\copy_before.txt");
        File out = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\copy_after.txt");
        // 建立管道
        try {
            Reader reader = new FileReader(in);
            Writer writer = new FileWriter(out);
            // 2、读取数据
            int len;
            char[] cbuf = new char[1024];
            while ((len = reader.read(cbuf)) != -1) {
                writer.write(cbuf, 0, len);
                writer.flush();
            }
            // 关闭资源
            reader.close();
            writer.close();
            System.out.println("复制完成!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
