package cn.simplelife.work._08filebufferstream;

import java.io.*;

/**
 * @ClassName BuffereadDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 15:34
 * @Version 1.0
 */

public class BufferReadDemo {
    public static void main(String[] args) throws Exception {
        // 需求：使用缓存流复制一个文件
        // 创建目标源和源文件
        File srcFile = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\1.png");
        File targetFile = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file\\copyimg\\b.png");

        // 创建管道
        InputStream in = new FileInputStream(srcFile);
        OutputStream out = new FileOutputStream(targetFile);

        // 创建缓冲区
        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(out);

        //读取文件
        int read;
        byte[] bytes = new byte[1024];
        while ((read = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, read);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
