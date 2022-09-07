package cn.simplelife.work._08filebufferstream;

import java.io.*;

/**
 * @ClassName BufferReaderDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 15:49
 * @Version 1.0
 */

public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {
        // 创建源文件
        File srcFile = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\shi.txt");
        // 创建管道
        Reader reader = new FileReader(srcFile);
        // 包装字符流
        BufferedReader bufferedReader = new BufferedReader(reader);
        // 读取文件数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
