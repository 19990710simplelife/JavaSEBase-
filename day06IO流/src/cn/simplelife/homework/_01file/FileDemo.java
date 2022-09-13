package cn.simplelife.homework._01file;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 14:51
 * @Version 1.0
 */

public class FileDemo {
    public static void main(String[] args) {
        // 1、File类文件目录类、可以创建文件、创建目录只能获取和设置文件本身得信息、不能操作文件得内容
        // 1、创建文件或目录
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\file1\\1.txt");
        // 2、获取文件名称
        System.out.println("file.getName() = " + file.getName());
        // 3、获取文件路径(默认获取得是绝对路径)
        System.out.println("file.getPath() = " + file.getPath());
        // 4、获取文件得绝对路径
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        // 5、获取文件上级目录
        System.out.println("file.getParentFile() = " + file.getParentFile());
        // 6、判断是否是文件
        System.out.println("file.isFile() = " + file.isFile());
        // 7、判断是否是目录
        System.out.println("file.isDirectory() = " + file.isDirectory());
        // 8、判断文件是否存在
        System.out.println("file.exists() = " + file.exists());
        // 9、创建当前目录和上级目录
        if (!file.getParentFile().exists()) {
            boolean mkdir = file.getParentFile().mkdir();
        }
        // 10、删除文件
        System.out.println("file.delete() = " + file.delete());
        // 11、列出所有的文件对象
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
        }
    }
}
