package cn.simplelife.work._01_gener;

import java.util.ArrayList;

/**
 * @ClassName GenerDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 9:19
 * @Version 1.0
 */

public class GenerDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        User user0 = new User("张翰", 18);
        User user1 = new User("li翰", 18);
        User user2 = new User("wang翰", 18);
        arrayList.add(user0);
        arrayList.add(user1);
        arrayList.add(user2);
        System.out.println("arrayList = " + arrayList);
        Object o = arrayList.get(0);
        User user = (User) o;
        System.out.println(user.getName());
    }
}
