package cn.simplelife.homework._02encode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @ClassName Demo
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 15:16
 * @Version 1.0
 */

public class Demo {
    public static void main(String[] args) {
        String input = "zhangsan中";
        // 根据字符编码获取、字节数组
        byte[] data = input.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(data));// [122, 104, 97, 110, 103, 115, 97, 110, -28, -72, -83]

        // 出现乱码
        String ret = new String(data, StandardCharsets.ISO_8859_1);
        System.out.println("s = " + ret);// s = zhangsanä¸­

        // 解决乱码
        // 1、获取ISO_8859_1的字符编码数组
        data = ret.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println(Arrays.toString(data));// [122, 104, 97, 110, 103, 115, 97, 110, -28, -72, -83]
        // 利用UTF-8解码
        ret = new String(data, StandardCharsets.UTF_8);
        System.out.println(ret);
    }
}
