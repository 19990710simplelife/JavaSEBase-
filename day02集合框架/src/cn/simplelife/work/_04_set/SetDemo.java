package cn.simplelife.work._04_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 11:29
 * @Version 1.0
 */

public class SetDemo {
    public static void main(String[] args) {
        /**
         * 特点：
         * 1、没有顺序
         * 2、元素不能重复
         */
        Set<String> strings = new HashSet<>();
        /**
         * 添加元素,添加顺序是无序的，且不允许重复添加
         */
        strings.add("王五");
        strings.add("李四");
        strings.add("张三");
        strings.add("赵六");
        System.out.println(strings);
        System.out.println("------------------------------");
        /**
         * 删除操作
         */
        strings.remove("张三");
//        strings.clear();//清空集合
        System.out.println(strings);
        System.out.println("------------------------------");

        /**
         * 查询
         */
        System.out.println("集合中元素个数 = " + strings.size());
        System.out.println("集合中是否包含张三：" + strings.contains("张三"));
        System.out.println("------------------------------");
        /**
         * 遍历
         */
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
