package cn.simplelife.work._06filewriter;

import java.io.*;

/**
 * @ClassName FileWriterDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 10:05
 * @Version 1.0
 */

public class FileWriterDemo {
    public static void main(String[] args) {
        // 1、确定目标源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\a.txt");
        try {
            // 2、建立管道
            Writer writer = new FileWriter(file);
            // 3、确定数据源
            String s = "Nice to meet you! 见到你很高兴！";
            // 4、写入目标源
            writer.write(s);
            writer.flush();
            // 5、关闭资源
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
