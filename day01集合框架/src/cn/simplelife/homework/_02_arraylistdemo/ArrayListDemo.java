package cn.simplelife.homework._02_arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ArrayListDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 14:35
 * @Version 1.0
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();

        /**
         * 添加元素
         */
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList1.add("王五");
        arrayList1.add("赵六");
        arrayList1.add("王麻子");
        arrayList.add(1, "tom");
        arrayList.addAll(arrayList1);
        System.out.println("arrayList = " + arrayList);
        System.out.println("--------------------------");
        /**
         * 删除元素
         */
        arrayList.remove("张三");
        arrayList.remove(0);
        arrayList.removeAll(arrayList1);
        System.out.println("arrayList = " + arrayList);
        System.out.println("--------------------------");
        /**
         * 修改元素
         */
        arrayList.set(0, "lisi");
        System.out.println("arrayList = " + arrayList);
        System.out.println("--------------------------");
        /**
         * 获取元素
         */
        System.out.println(arrayList1.get(1));
        System.out.println("--------------------------");
        /**
         * 判断是否为空
         */
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList1.isEmpty());
        System.out.println("--------------------------");
        /**
         * 获取元素个数
         */
        System.out.println(arrayList.size());
        System.out.println(arrayList1.size());
        System.out.println("--------------------------");
        /**
         * 将集合转为数组
         */
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println(Arrays.toString(arrayList1.toArray()));
        System.out.println("--------------------------");
        /**
         * 判断集合中是否包含给定的对象
         */
        System.out.println(arrayList.contains("zhangsan"));
        System.out.println(arrayList1.contains("王五"));

    }
}
