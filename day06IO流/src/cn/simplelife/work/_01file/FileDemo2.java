package cn.simplelife.work._01file;

import java.io.File;
import java.util.Date;

/**
 * @ClassName FileDemo2
 * @Description
 * @Author simplelife
 * @Date 2022/8/31 16:21
 * @Version 1.0
 */

public class FileDemo2 {
    public static void main(String[] args) {
        /**
         * 通过file操作文件
         */
        File file = new File("test/a.txt");
        System.out.println("file = " + file);

        // 1、获取文件的名称
        System.out.println("文件名= " + file.getName());
        // 2、获取文件路径（与创建是给的路径有关）
        System.out.println("文件路径 = " + file.getPath());
        // 3、获取绝对路径
        System.out.println("绝对路径 = " + file.getAbsolutePath());
        // 4、获取文件的上级目录
        System.out.println("上级目录 = " + file.getParent());
    }
}
