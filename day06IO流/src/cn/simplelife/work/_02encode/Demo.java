package cn.simplelife.work._02encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName Demo
 * @Description
 * @Author simplelife
 * @Date 2022/9/5 9:59
 * @Version 1.0
 */

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "张三";
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println("bytes = " + Arrays.toString(bytes));
        String s = new String(bytes, "UTF-8");
        System.out.println("s = " + s);
    }
}
