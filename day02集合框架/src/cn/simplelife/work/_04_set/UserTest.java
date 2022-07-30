package cn.simplelife.work._04_set;

import java.util.HashSet;

/**
 * @ClassName UserTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 14:44
 * @Version 1.0
 */

public class UserTest {
    public static void main(String[] args) {
        HashSet<User> userHashSet = new HashSet<>();
        User user0 = new User("1001", "张三", 11);
        User user1 = new User("1002", "李四", 21);
        User user2 = new User("1003", "王五", 16);
        User user3 = new User("1004", "赵六", 18);
        User user4 = new User("1004", "赵六", 18);
        userHashSet.add(user0);
        userHashSet.add(user1);
        userHashSet.add(user2);
        userHashSet.add(user3);
        userHashSet.add(user4);
        System.out.println(userHashSet);
    }
}
