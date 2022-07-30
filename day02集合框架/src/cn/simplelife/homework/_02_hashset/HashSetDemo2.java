package cn.simplelife.homework._02_hashset;

import java.util.HashSet;

/**
 * @ClassName HashSetDemo2
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:04
 * @Version 1.0
 */

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();

        User user0 = new User("001", 18);
        User user1 = new User("002", 19);
        User user2 = new User("003", 3);
        User user3 = new User("004", 30);
        User user4 = new User("005", 15);
        User user5 = new User("005", 13);
        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        System.out.println("users = " + users);
    }
}
