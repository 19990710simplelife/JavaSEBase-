package cn.simplelife.homework._02_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName HashMapDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:31
 * @Version 1.0
 */

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("ok", 200);
        stringIntegerHashMap.put("not", 404);
        stringIntegerHashMap.put("error", 500);

        // 根据key的集合进行遍历
        Set<String> strings = stringIntegerHashMap.keySet();
        // 获取key的迭代器
        Iterator<String> iterator = strings.iterator();
        // 开始遍历
        while (iterator.hasNext()) {
            String next = iterator.next();
            int integer = stringIntegerHashMap.get(next);
            System.out.println(" key: " + next + " value: " + integer);
        }
        System.out.println("---------------------------");
        // 根据所有的键值对进行遍历
        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next);
        }
    }
}
