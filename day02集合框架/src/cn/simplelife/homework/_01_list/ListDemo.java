package cn.simplelife.homework._01_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ListDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 16:18
 * @Version 1.0
 */

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        /**
         * 添加元素
         */
        stringArrayList.add("111");
        stringArrayList.add("222");
        stringArrayList.add("333");
        stringArrayList.add("444");
        stringArrayList.add("555");
        System.out.println("stringArrayList = " + stringArrayList);
        System.out.println("---------------------------");

        /**
         * 删除元素
         */
        stringArrayList.remove("555");
        System.out.println("stringArrayList = " + stringArrayList);
        System.out.println("---------------------------");

        /**
         * 修改元素
         */
        stringArrayList.set(3, "666");
        System.out.println("stringArrayList = " + stringArrayList);
        System.out.println("---------------------------");

        /**
         * 获取元素
         */
        System.out.println(stringArrayList.get(0));
        System.out.println("stringArrayList = " + stringArrayList);
        System.out.println("---------------------------");
        /**
         * 遍历的三种方式
         */
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.print(stringArrayList.get(i) + " ");
        }

        /**
         * 增强for循环遍历
         */
        for (String item : stringArrayList) {
            System.out.print(item + " ");
        }

        /**
         * 迭代器遍历
         */
        Iterator<String> iterator = stringArrayList.iterator();
        String item;
        while (iterator.hasNext()) {
            item = iterator.next();
            System.out.print(item + " ");
        }
    }
}
