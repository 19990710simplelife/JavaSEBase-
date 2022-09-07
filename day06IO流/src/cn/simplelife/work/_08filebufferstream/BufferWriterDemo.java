package cn.simplelife.work._08filebufferstream;

import java.io.*;
import java.util.Scanner;
import java.util.WeakHashMap;

/**
 * @ClassName BufferWriterDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 16:01
 * @Version 1.0
 */

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        // 目标源
        File targetFile = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\shi.txt");
        Scanner scanner = new Scanner(System.in);
        // 创建管道
        Writer writer = new FileWriter(targetFile);
        // 包装管道
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        while (true) {
            String next = scanner.next();
            if (next.equals("bye")) {
                break;
            }
            bufferedWriter.write(next);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
