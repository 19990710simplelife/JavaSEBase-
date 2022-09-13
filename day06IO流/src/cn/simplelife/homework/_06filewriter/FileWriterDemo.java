package cn.simplelife.homework._06filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @ClassName FileWriterDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 17:15
 * @Version 1.0
 */

public class FileWriterDemo {
    public static void main(String[] args) {
        // 确定目标源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\d.txt");
        Writer writer = null;
        try {
            // 建立管道
            writer = new FileWriter(file);
            writer.write("你好啊！");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
