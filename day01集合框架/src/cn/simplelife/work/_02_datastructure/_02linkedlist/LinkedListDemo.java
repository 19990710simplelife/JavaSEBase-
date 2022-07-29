package cn.simplelife.work._02_datastructure._02linkedlist;

import java.util.LinkedList;

/**
 * @ClassName LinkedListDemo
 * @Description 作为链表使用
 * @Author simplelife
 * @Date 2022/7/29 10:26
 * @Version 1.0
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        /**
         * 添加元素
         */
        linkedList.add("aaa");
        linkedList.add("eee");
        linkedList.add("fff");
        /**
         * 在指定位置添加指定元素
         */
        linkedList.add(1, "bbb");
        /**
         * 在头部添加元素
         */
        linkedList.addFirst("ccc");
        /**
         * 在尾部添加元素
         */
        linkedList.addLast("ddd");

        /**
         * 默认移除最后一个元素
         */
        linkedList.remove();

        /**
         * 移除指定元素
         */
        linkedList.remove("bbb");
        /**
         * 移除指定索引的元素
         */
        linkedList.remove(1);

        /**
         * 移除头部元素
         */
        linkedList.removeFirst();

        /**
         * 移除尾部元素
         */
        linkedList.removeLast();

        /**
         * 修改指定索引位置的元素
         */
        linkedList.set(0, "ggg");
        linkedList.add("hhh");
        linkedList.add("iii");
        linkedList.add("jjj");

        /**
         * 按照索引获取指定位置的元素
         */
        System.out.println(linkedList.get(1));
        /**
         * 获取第一位元素
         */
        System.out.println(linkedList.getFirst());
        /**
         * 获取最后一位元素
         */
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
    }
}
