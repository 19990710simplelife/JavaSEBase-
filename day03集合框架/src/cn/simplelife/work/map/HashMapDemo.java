package cn.simplelife.work.map;

import java.util.HashMap;

/**
 * @ClassName HashMapDemo
 * @Description map的基本使用
 * @Author simplelife
 * @Date 2022/8/1 11:40
 * @Version 1.0
 */

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * hashMap的底层结构是哈希表
         */
        HashMap<String, String> stringHashMap = new HashMap<>();

        /**
         * 增加元素，不记录添加顺序
         */
        stringHashMap.put("girl1", "西施");
        stringHashMap.put("girl2", "王昭君");
        stringHashMap.put("girl3", "貂蝉");
        stringHashMap.put("girl4", "杨玉环");
        System.out.println("集合中元素个数 = " + stringHashMap.size());
        System.out.println("stringHashMap = " + stringHashMap);
        System.out.println("---------------------------------------");

        /**
         * 删除元素
         */
        stringHashMap.remove("girl1");
        // stringHashMap.clear();//清空所有元素
        System.out.println("集合中元素个数 = " + stringHashMap.size());
        System.out.println("stringHashMap = " + stringHashMap);
        System.out.println("---------------------------------------");

        /**
         * 修改元素
         */
        stringHashMap.put("girl4","zhangsan");
        System.out.println("集合中元素个数 = " + stringHashMap.size());
        System.out.println("stringHashMap = " + stringHashMap);
        System.out.println("---------------------------------------");
        /**
         * 查找元素
         */
        System.out.println(stringHashMap.get("girl2"));
        System.out.println(stringHashMap.containsKey("girl1"));
        System.out.println(stringHashMap.containsValue("zhangsan"));
    }
}
