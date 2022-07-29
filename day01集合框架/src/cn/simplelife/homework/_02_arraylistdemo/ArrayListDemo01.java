package cn.simplelife.homework._02_arraylistdemo;

import java.util.ArrayList;

/**
 * @ClassName ArrayListDemo01
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 14:47
 * @Version 1.0
 */

public class ArrayListDemo01 {
    public static void main(String[] args) {
        User user0 = new User("张三", 18);
        User user1 = new User("张三", 18);
        User user2 = new User("张三", 18);
        User user3 = new User("张三", 18);
        ArrayList arrayList = new ArrayList();
        arrayList.add(user0);
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);

        System.out.println("arrayList = " + arrayList);
    }
}
