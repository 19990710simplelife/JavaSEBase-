package cn.simplelife.work._02_datastructure._01arraylist;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ArrayListDemo
 * @Description 数组列表的集合
 * @Author simplelife
 * @Date 2022/7/29 9:18
 * @Version 1.0
 */

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("ddd");
        arrayList1.add("eee");
        arrayList1.add("fff");

        /**
         * 将集合arrayList1添加到arrayList集合
         */
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        /**
         * 从集合arrayList移除集合arrayList1中所有元素
         */
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);

        /**
         * 判断集合是否为空
         */
        System.out.println(arrayList.isEmpty());

        /**
         * 判断该集合中是否有指定的元素
         */
        System.out.println(arrayList.contains("eee"));
        /**
         * 将集合转为对象类型的数组
         */
        Object[] objects = arrayList.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
