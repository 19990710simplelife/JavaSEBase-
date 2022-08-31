package cn.simplelife.work._01file;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/31 16:18
 * @Version 1.0
 */

public class FileDemo {
    public static void main(String[] args) {
        /**
         * File表示文件或文件夹
         */
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\a.txt");
        System.out.println("file = " + file);
        File file1 = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test");
        System.out.println("file1 = " + file1);
    }
}
