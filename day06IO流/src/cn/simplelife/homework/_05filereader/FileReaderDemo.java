package cn.simplelife.homework._05filereader;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;

/**
 * @ClassName FileReaderDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 16:53
 * @Version 1.0
 */

public class FileReaderDemo {
    public static void main(String[] args) {
        // 确定数据源
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\a.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        readerOne(reader, file);
        getMore(reader, file);
    }

    /**
     * 使用字符流读取文件内容
     *
     * @param reader
     * @param file
     */
    public static void readerOne(Reader reader, File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            // 判断reader是否为空
            if (reader == null) {
                reader = new FileReader(file);
            }
            int len;
            while ((len = reader.read()) != -1) {
                stringBuilder.append((char) len);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getMore(Reader reader, File file) {
        try {
            if (reader == null) {
                reader = new FileReader(file);
            }
            char[] chars = new char[1024];
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = reader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}