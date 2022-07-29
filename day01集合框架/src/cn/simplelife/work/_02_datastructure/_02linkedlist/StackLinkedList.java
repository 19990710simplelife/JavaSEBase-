package cn.simplelife.work._02_datastructure._02linkedlist;

import java.util.LinkedList;

/**
 * @ClassName StackLinkedList
 * @Description 栈结构
 * @Author simplelife
 * @Date 2022/7/29 10:48
 * @Version 1.0
 */

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        /**
         * 入栈的操作
         */
        linkedList.push("111");
        linkedList.push("222");
        linkedList.push("333");
        linkedList.push("444");
        /**
         * 出栈操作
         */
        Object pop = linkedList.pop();
        System.out.println("pop = " + pop); // 444

        /**
         * 获取栈顶元素操作
         */
        Object peek = linkedList.peek(); // 333
        System.out.println("peek = " + peek);

        System.out.println(linkedList);
    }
}
