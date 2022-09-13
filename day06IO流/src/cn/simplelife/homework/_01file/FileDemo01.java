package cn.simplelife.homework._01file;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 15:13
 * @Version 1.0
 */

public class FileDemo01 {
    public static void main(String[] args) {
        // 需求：给定一个目录(test),遍历其下的所有目录(包含子目录)和文件
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file2");
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    System.out.println(file1.getName());
                } else {
                    System.out.println(file1);
                }
            }
        }

    }
}
