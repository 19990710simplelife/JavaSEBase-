package cn.simplelife.homework._07copydemo;

import java.io.*;

/**
 * @ClassName CopyUtil
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 19:56
 * @Version 1.0
 */

public class CopyUtil {
    public static void copy(File src, File dest, Reader reader, Writer writer) {
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
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

