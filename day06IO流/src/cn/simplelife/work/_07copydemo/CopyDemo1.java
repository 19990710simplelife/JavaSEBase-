package cn.simplelife.work._07copydemo;

import java.io.*;

/**
 * @ClassName CopyDemo1
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 14:25
 * @Version 1.0
 */

public class CopyDemo1 {
    public static void main(String[] args) {
        // 1、创建数据源和目标源
        File in = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\1.jpg");
        File out = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\copyimg\\b.png");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            // 2、创建管道
            inputStream = new FileInputStream(in);
            outputStream = new FileOutputStream(out);
            // 3、读取文件数据
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                // 4、写入数据
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5、关闭资源
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("复制完成！");
    }
}
