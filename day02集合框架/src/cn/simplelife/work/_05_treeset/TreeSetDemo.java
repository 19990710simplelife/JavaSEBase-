package cn.simplelife.work._05_treeset;

import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 15:17
 * @Version 1.0
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        /**
         * TreeSet
         * 底层数据结构是红黑树，实现了set接口
         */
        TreeSet<String> stringTreeSet = new TreeSet<>();

        /**
         * 添加方法,不记录添加顺序，不能添加重复元素
         */
        stringTreeSet.add("111");
        stringTreeSet.add("444");
        stringTreeSet.add("222");
        stringTreeSet.add("333");
        System.out.println("stringTreeSet = " + stringTreeSet);
        System.out.println("--------------------------------");

        /**
         * 删除元素
         */
        stringTreeSet.remove("111");
        System.out.println("stringTreeSet = " + stringTreeSet);
        System.out.println("--------------------------------");

        System.out.println("集合中元素个数是 = " + stringTreeSet.size());
        System.out.println("集合中是否包含111：" + stringTreeSet.contains("111"));
        System.out.println("--------------------------------");
        /**
         * 遍历集合
         */
        for (String item : stringTreeSet) {
            System.out.println(item);
        }
    }
}
