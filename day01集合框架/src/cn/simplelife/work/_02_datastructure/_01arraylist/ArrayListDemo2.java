package cn.simplelife.work._02_datastructure._01arraylist;

import org.omg.CORBA.ARG_IN;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ArrayListDemo
 * @Description 数组集合之存对象
 * @Author simplelife
 * @Date 2022/7/29 9:18
 * @Version 1.0
 */

public class ArrayListDemo2 {
    public static void main(String[] args) {
        User user0 = new User("貂蝉",20);
        User user1 = new User("西施",19);
        User user2 = new User("张飞",19);

        ArrayList arrayList = new ArrayList();
        arrayList.add(user0);
        arrayList.add(user1);
        arrayList.add(user2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        /**
         * 自定义对象在集合中存储的是对象的引用
         */
    }
}
