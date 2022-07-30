package cn.simplelife.work._03_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName IteratorDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 10:28
 * @Version 1.0
 */

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        /**
         * 使用for循环进行普通遍历集合
         */
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------------------------------");
        /**
         * 使用迭代器遍历
         */
        Iterator<String> iterator = arrayList.iterator();
        /**
         * 询问迭代器对象是否有下一个元素
         */
        while (iterator.hasNext()) {
            /**
             * 取出下一个元素
             */
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");

        /**
         * 使用for-each遍历集合,底层通过迭代器对象完成的
         */
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
