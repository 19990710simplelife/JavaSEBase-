package cn.simplelife.work._01file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo3
 * @Description
 * @Author simplelife
 * @Date 2022/8/31 16:28
 * @Version 1.0
 */

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //创建文件b.txt
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\b.txt");
        // 判断文件是否存在
        boolean exists = file.exists();
        if (exists) {
            System.out.println("文件存在");
            // 删除文件
            boolean delete = file.delete();
            if (delete) {
                System.out.println("原文件已删除！");
            }
        } else {
            System.out.println("文件不存在");
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("文件创建成功");
            }
        }
        // 判断file是否为文件
        System.out.println("file是否为文件 = " + file.isFile());
        // 判断file是否为目录
        System.out.println("file是否为目录 = " + file.isDirectory());

    }
}
