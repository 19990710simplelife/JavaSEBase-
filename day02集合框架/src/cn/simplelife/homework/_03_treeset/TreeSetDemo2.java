package cn.simplelife.homework._03_treeset;

import java.util.TreeSet;

/**
 * @ClassName TreeSetDemo
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:09
 * @Version 1.0
 */

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>();
        User user0 = new User("001", 18);
        User user1 = new User("002", 17);
        User user2 = new User("003", 48);
        User user3 = new User("004", 28);
        User user4 = new User("005", 38);
        User user5 = new User("005", 19);
        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        System.out.println(users);
    }
}
