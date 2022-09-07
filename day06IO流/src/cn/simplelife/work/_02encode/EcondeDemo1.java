package cn.simplelife.work._02encode;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName EcondeDemo1
 * @Description
 * @Author simplelife
 * @Date 2022/9/5 9:49
 * @Version 1.0
 */

public class EcondeDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {-42, -48};
        String s =new String(bytes,"GBK");
        System.out.println("s = " + s);
    }
}
