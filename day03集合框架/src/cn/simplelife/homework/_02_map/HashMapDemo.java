package cn.simplelife.homework._02_map;

import java.util.HashMap;

/**
 * @ClassName HashMapDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:31
 * @Version 1.0
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("ok", 200);
        stringIntegerHashMap.put("not", 404);
        stringIntegerHashMap.put("error", 500);

        System.out.println(stringIntegerHashMap);
        System.out.println("---------------------------");

        stringIntegerHashMap.remove("error");
        System.out.println(stringIntegerHashMap);
        System.out.println("---------------------------");

        stringIntegerHashMap.put("ok", 201);
        System.out.println(stringIntegerHashMap);
        System.out.println("---------------------------");
        System.out.println("元素个数 = " + stringIntegerHashMap.size());
        System.out.println("集合是否为空 = " + stringIntegerHashMap.isEmpty());
        System.out.println("获取not = " + stringIntegerHashMap.get("not"));
    }
}
