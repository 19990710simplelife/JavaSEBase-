package cn.simplelife.work.map;

import java.util.HashMap;

/**
 * @ClassName HashMapDemo4
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 15:17
 * @Version 1.0
 */

public class HashMapDemo4 {
    public static void main(String[] args) {
        // 统计一个字符串中每个字符的出现次数
        String str = "ASDFGFSFRHGSHTDEHJGJNGBJSKGHSDIGHNDFKIGN";
        // 1、依次取出每个字符
        String key;
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            key = str.charAt(i) + "";
            // 2、判断容器是否存在该字符，
            // 如果不存在，以该字符为key，以1作为value存入该容器，
            if (!stringIntegerHashMap.containsKey(key)) {
                stringIntegerHashMap.put(key, 1);
            } else {
                // 如果存在，获取对应的value将其加一，操作后再存入
                Integer integer = stringIntegerHashMap.get(key);
                integer += 1;
                stringIntegerHashMap.put(key, integer);
            }
        }
        // 3、输出容器
        System.out.println(stringIntegerHashMap);
    }
}
