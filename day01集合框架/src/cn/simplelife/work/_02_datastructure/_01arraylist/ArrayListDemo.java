package cn.simplelife.work._02_datastructure._01arraylist;

import java.util.ArrayList;

/**
 * @ClassName ArrayListDemo
 * @Description 数组列表的集合
 * @Author simplelife
 * @Date 2022/7/29 9:18
 * @Version 1.0
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * ArrayList底层数据结构是数组，实现了List接口
         * ArrayList由于底层数据结构是数组，实际开发中特别适合查询比较多的场景
         * ArrayList可以看成一个可变数组，线程不安全
         */
        ArrayList arrayList = new ArrayList();
        /**
         * 末尾增加元素 允许元素重复，并且记录了元素添加的顺序
         */
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("coco");
        arrayList.add("coco");
        /**
         * 指定位置增加元素
         */
        arrayList.add(2, "zhangsan");

        /**
         * 删除指定的元素
         */
        arrayList.remove("zhangsan");

        /**
         * 删除指定索引的元素
         */
        arrayList.remove(0);

        /**
         * 修改指定索引位置的元素
         */
        arrayList.set(0, "zhangsan");

        /**
         * 获取指定位置的元素
         */
        Object o = arrayList.get(1);
        System.out.println(o);

        System.out.println(arrayList);
        /**
         * 获取元素个数
         */
        System.out.println("元素个数"+arrayList.size());
    }
}
