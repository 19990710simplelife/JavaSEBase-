package cn.simplelife.homework._03_treeset;

import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:09
 * @Version 1.0
 */

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(5);
        treeSet.add(115);
        treeSet.add(55);
        treeSet.add(75);
        System.out.println("treeSet = " + treeSet);
        System.out.println("------------------------------");
        treeSet.remove(5);
//        treeSet.clear();
        System.out.println("treeSet = " + treeSet);
        System.out.println("------------------------------");
    }
}
