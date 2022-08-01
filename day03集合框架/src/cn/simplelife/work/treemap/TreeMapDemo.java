package cn.simplelife.work.treemap;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @ClassName TreeMapDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 15:34
 * @Version 1.0
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("0001", "张三");
        treeMap.put("0004", "赵六");
        treeMap.put("0002", "李四");
        treeMap.put("0003", "王五");
        System.out.println(treeMap);
    }
}
