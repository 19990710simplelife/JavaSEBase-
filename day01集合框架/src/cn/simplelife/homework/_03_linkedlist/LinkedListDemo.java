package cn.simplelife.homework._03_linkedlist;

import jdk.nashorn.internal.ir.CallNode;

import java.util.LinkedList;

/**
 * @ClassName LinkedListDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 14:51
 * @Version 1.0
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        /**
         * 普通的线性结构演示
         */
        LinkedList linkedList = new LinkedList();
        /**
         * 添加元素
         */
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("王麻子");
        linkedList.add(1, "tom");
        System.out.println("linkedList = " + linkedList);
        System.out.println("-------------------------------");
        /**
         * 删除元素
         */
        linkedList.remove();
        linkedList.remove(1);
        linkedList.remove("tom");
        System.out.println("linkedList = " + linkedList);
        System.out.println("-------------------------------");
        /**
         * 修改元素
         */
        linkedList.set(0, "赵六");
        System.out.println("linkedList = " + linkedList);
        System.out.println("-------------------------------");

        /**
         * 获取元素
         */
        System.out.println(linkedList.get(0));
        System.out.println("-------------------------------");

        /**
         * 作为栈结构使用
         */
        LinkedList linkedList1 = new LinkedList();
        linkedList1.push("111");
        linkedList1.push("222");
        linkedList1.push("333");
        linkedList1.push("444");
        System.out.println("linkedList1 = " + linkedList1);
        Object pop = linkedList1.pop();
        System.out.println("pop = " + pop);
        System.out.println("linkedList1 = " + linkedList1);
        System.out.println("-------------------------------");
        Object peek = linkedList1.peek();
        System.out.println("peek = " + peek);
        System.out.println("linkedList1 = " + linkedList1);
        System.out.println("-------------------------------");

        /**
         * 作为双向队列使用
         */
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addFirst("111");
        linkedList2.addFirst("222");
        linkedList2.addLast("333");
        linkedList2.addLast("444");
        System.out.println("linkedList2 = " + linkedList2);
        System.out.println("-------------------------------");
        linkedList2.removeFirst();
        linkedList2.removeLast();
        System.out.println("linkedList2 = " + linkedList2);
        System.out.println("-------------------------------");
        System.out.println(linkedList2.getFirst());
        System.out.println(linkedList2.getLast());
    }
}
