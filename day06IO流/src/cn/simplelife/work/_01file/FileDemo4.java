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

public class FileDemo4 {
    public static void main(String[] args) {
        /**
         * File操作目录
         */
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\test02\\test01");
        // 判断该目录是否存在
        if (file.exists()) {
            System.out.println("该目录已存在");
        } else {
            // mkdir()表示创建一层目录
            // mkdirs()表示创建多层目录
            boolean mkdir = file.mkdirs();
            if (mkdir) {
                System.out.println("目录创建成功！");
            } else {
                System.out.println("目录创建失败");
            }
        }
    }
}
