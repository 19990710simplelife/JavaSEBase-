package cn.simplelife.work.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName HashMapDemo
 * @Description map的基本使用
 * @Author simplelife
 * @Date 2022/8/1 11:40
 * @Version 1.0
 */

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        HashMap<String, List<String>> stringHashMap1 = new HashMap<>();
        List<String> strings = new ArrayList<>();
        strings.add("张飞");
        strings.add("刘备");
        strings.add("关羽");
        stringHashMap.put("girl1", "西施");
        stringHashMap.put("girl2", "王昭君");
        stringHashMap.put("girl3", "貂蝉");
        stringHashMap.put("girl4", "杨玉环");
        stringHashMap1.put("三国", strings);
        System.out.println("集合中元素个数 = " + stringHashMap.size());
        System.out.println("stringHashMap = " + stringHashMap);
        System.out.println("---------------------------------------");
        System.out.println("集合中元素个数 = " + stringHashMap1.size());
        System.out.println("stringHashMap = " + stringHashMap1);
        System.out.println("---------------------------------------");
    }
}
