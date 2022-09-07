package cn.simplelife.work._04fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName FileOutputStream
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 9:33
 * @Version 1.0
 */

public class FileOutputStream {
    public static void main(String[] args) {
        // 需求：把程序中的数据写入到指定的文件中
        // 分析：
        // 1、确定流向、输出流
        // 2、以字节的形式写出去
        // 3、确定文件的目的地 文件

        // 1、确定目的地
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\a.txt");
        try {
            // 2、建立管道
            OutputStream outputStream = new java.io.FileOutputStream(file);
            // 3、写入文件
            String s = "你好世界！";
            outputStream.write(s.getBytes("UTF-8"));
            // 4、关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
