package cn.simplelife.work._02encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName EncodeDemo
 * @Description
 * @Author simplelife
 * @Date 2022/9/5 9:34
 * @Version 1.0
 */

public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 编码：把字符或着字符串转为指定的字符集转成对于的字符序列的过程
        String str = "中";
        System.out.println(Arrays.toString(str.getBytes("GBK")));
    }
}
