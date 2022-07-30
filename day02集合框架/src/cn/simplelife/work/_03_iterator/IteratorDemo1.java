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

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("张三");
        arrayList1.add("李四");
        arrayList1.add("王五");
        arrayList1.add("赵六");
        System.out.println(arrayList1);
        /**
         * 使用for循环进行普通遍历集合
         */
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("-------------------------------");
        /**
         * 使用迭代器遍历
         */
        Iterator<String> iterator = arrayList1.iterator();
        /**
         * 询问迭代器对象是否有下一个元素
         */
        String item;
        while (iterator.hasNext()) {
            /**
             * 取出下一个元素
             */
            item = iterator.next();
            if (item.equals("张三")) {
                // 使用迭代器对象来删除
                iterator.remove();
            } else {
                System.out.println(item);
            }
        }
        System.out.println("-------------------------------");

        /**
         * 使用for-each遍历集合,底层通过迭代器对象完成的
         */
        for (String item1 : arrayList1) {
            System.out.println(item1);
        }
    }
}
