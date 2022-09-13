package cn.simplelife.homework._04fileoutputstrean;

import java.io.*;

/**
 * @ClassName OutputStreamDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 16:34
 * @Version 1.0
 */

public class OutputStreamDemo {
    public static void main(String[] args) {
        // 使用文件字节输出流，把程序中数据保存到b.txt文件，操作英文
        // 1、确定目标源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\b.txt");
        OutputStream fileOutputStream = null;
        try {
            // 2、建立管道
            fileOutputStream = new FileOutputStream(file);
            // 3、写入内容
            fileOutputStream.write('a');
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4、关闭资源
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
