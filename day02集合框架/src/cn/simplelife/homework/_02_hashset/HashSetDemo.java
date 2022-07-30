package cn.simplelife.homework._02_hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName HashSetDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 16:47
 * @Version 1.0
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        /**
         * 添加元素,没有添加顺序
         */
        integerHashSet.add(55);
        integerHashSet.add(18);
        integerHashSet.add(25);
        integerHashSet.add(37);
        integerHashSet.add(14);
        System.out.println("integerHashSet = " + integerHashSet);
        System.out.println("----------------------------------");
        /**
         * 删除元素
         */
        integerHashSet.remove(18);
//        integerHashSet.clear();//清空
        System.out.println("integerHashSet = " + integerHashSet);
        System.out.println("----------------------------------");

        /**
         * 查询
         */
        System.out.println("集合中元素个数= " + integerHashSet.size());
        System.out.println("---------------------------------");

        /**
         * 遍历
         */
        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }
        System.out.println("--------------------------------");
        Iterator<Integer> integerIterator = integerHashSet.iterator();
        Integer integer;
        while (integerIterator.hasNext()) {
            integer = integerIterator.next();
            System.out.println(integer);
        }
    }
}
