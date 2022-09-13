package cn.simplelife.homework._07copydemo;

import java.io.*;

/**
 * @ClassName CopyDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 19:24
 * @Version 1.0
 */

public class CopyDemo {
    public static void main(String[] args) {
        // 确定输入输出源
        File src = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\copydemo\\copy_before.txt");
        File dest = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\copydemo\\copy_after.txt");
        // 创建管道
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(src);
            writer = new FileWriter(dest);
            int len;
            char[] chars = new char[1024];
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = reader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            writer.write(stringBuilder.toString());
            writer.flush();
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
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * 调用工具类
         */
        CopyUtil.copy(src, dest, reader, writer);
    }
}
