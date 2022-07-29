package cn.simplelife.work._02_datastructure._02linkedlist;

import java.util.LinkedList;

/**
 * @ClassName QueueLinkedList
 * @Description 队列使用
 * @Author simplelife
 * @Date 2022/7/29 10:55
 * @Version 1.0
 */

public class QueueLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        /**
         * 入队操作
         */
        linkedList.add("111");
        linkedList.add("222");
        linkedList.add("333");
        /**
         * 从头部入队
         */
        linkedList.addFirst("aaa");
        /**
         * 从尾部入队
         */
        linkedList.addLast("bbb");

        System.out.println("linkedList = " + linkedList); //[aaa,111,222,333,bbb]
        /**
         * 获取头部和尾部元素
         */
        Object last = linkedList.getLast();
        Object first = linkedList.getFirst();
        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
