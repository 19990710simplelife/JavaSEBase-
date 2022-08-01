package cn.simplelife.homework._02_map;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName HashMapDemo2
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:43
 * @Version 1.0
 */

public class HashMapDemo2 {
    public static void main(String[] args) {
        String str = "SDFDGFGNSUDFGBSDKGNBSDBGSDBGFSDHVFSATGCFDH";
        HashMap<Character, Integer> map = new HashMap<>();
        //1、首先将字符串转为字符数组
        char[] chars = str.toCharArray();
        //2、遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            // 判断字符是否是map集合的key
            char key = chars[i];
            if (!(map.containsKey(key))) {
                map.put(key, 1);
            } else {
                int integer = map.get(key);
                integer++;
                map.put(key, integer);
            }
        }
        System.out.println("map = " + map);
    }
}
