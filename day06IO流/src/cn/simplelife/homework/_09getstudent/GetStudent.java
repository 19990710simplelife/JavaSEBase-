package cn.simplelife.homework._09getstudent;

import cn.simplelife.work._09serializable.User;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName GetStudent
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 20:33
 * @Version 1.0
 */

public class GetStudent {
    public static void main(String[] args) {
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\Student.txt");
        try {
            Reader reader = new FileReader(file);
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = new char[1024];
            if ((len = reader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            String[] split = stringBuilder.toString().split(";");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
