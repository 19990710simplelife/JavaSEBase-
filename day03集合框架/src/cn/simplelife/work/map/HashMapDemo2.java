package cn.simplelife.work.map;

import java.util.*;

/**
 * @ClassName HashMapDemo
 * @Description map的基本使用
 * @Author simplelife
 * @Date 2022/8/1 11:40
 * @Version 1.0
 */

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("girl1", "西施");
        stringHashMap.put("girl2", "王昭君");
        stringHashMap.put("girl3", "貂蝉");
        stringHashMap.put("girl4", "杨玉环");
        /**
         * 通过key来获取value
         */
        // 1、先获取key集合
        Set<String> keys = stringHashMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = stringHashMap.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("----------------------------");
        // 2、方式二
        /**
         * 通过获取键值对
         */
        Set<Map.Entry<String, String>> entries = stringHashMap.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, String> next = entryIterator.next();
            System.out.println(next);
        }
    }
}
