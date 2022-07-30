package cn.simplelife.homework._01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 16:18
 * @Version 1.0
 */

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> stringArrayList1 = new ArrayList<>();

        /**
         * 添加元素
         */
        stringArrayList1.add("111");
        stringArrayList1.add("222");
        stringArrayList1.add("333");
        stringArrayList1.add("444");
        stringArrayList1.add("555");
        System.out.println("stringArrayList = " + stringArrayList1);
        System.out.println("---------------------------");


        /**
         * 遍历的三种方式
         */
        for (int i = 0; i < stringArrayList1.size(); i++) {
            if (stringArrayList1.get(i).equals("111")) {
                stringArrayList1.remove(stringArrayList1.get(i));
            }
            System.out.println(stringArrayList1.get(i));
        }
        System.out.println("---------------------------");


        /**
         * 增强for循环遍历
         */

        for (String items : stringArrayList1) {
//            if ("222".equals(items)) {
//                stringArrayList1.remove(items);//java.util.ConcurrentModificationException
//            }
            System.out.println(items + " ");
        }
        System.out.println("---------------------------");

        /**
         * 迭代器遍历
         */
        Iterator<String> iterator = stringArrayList1.iterator();
        String item;
        while (iterator.hasNext()) {
            item = iterator.next();
            if ("222".equals(item)) {
                iterator.remove();
            }
            System.out.println(item + " ");
        }
        System.out.println("---------------------------");
        System.out.println("stringArrayList1 = " + stringArrayList1);
    }
}
