package cn.simplelife.work._01file;

import java.io.File;

/**
 * @ClassName FileDemo5
 * @Description
 * @Author simplelife
 * @Date 2022/8/31 16:49
 * @Version 1.0
 */

public class FileDemo5 {
    /**
     * 遍历单个目录
     *
     * @param dir 目录
     */
    public static void printDir(File dir) {
        // 返回file数组
        File[] list = dir.listFiles();
        // 输出当前目录
        System.out.println(dir.getPath());
        // 判断数组是否为空
        if (list != null) {
            for (File file : list) {
                // 判断file是文件还是目录
                if (file.isDirectory()) {
                    //是目录
                    printDir(file);
                } else {
                    System.out.println(file.getPath());
                }
            }
        }
    }

    public static void main(String[] args) {
        /**
         * File遍历目录下的子目录和文件
         */
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test");
//        String[] list = file.list();
//        if (list != null) {
//            for (String s : list) {
//                System.out.println(s);
//            }
//        }
//
//        File[] files = file.listFiles();
//        if (files != null) {
//            for (File file1 : files) {
//                System.out.println(file1.getPath());
//            }
//        }
        printDir(file);
    }
}
