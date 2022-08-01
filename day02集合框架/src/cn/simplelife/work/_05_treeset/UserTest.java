package cn.simplelife.work._05_treeset;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @ClassName UserTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 14:44
 * @Version 1.0
 */

public class UserTest {
    public static void main(String[] args) {
        TreeSet<User> userHashSet = new TreeSet<>();
        User user0 = new User("1001", "张三", 11);
        User user1 = new User("1002", "李四", 21);
        User user2 = new User("1003", "王五", 16);
        User user3 = new User("1004", "赵六", 18);
        User user4 = new User("1005", "哈哈", 18);
        userHashSet.add(user0);
        userHashSet.add(user1);
        userHashSet.add(user2);
        userHashSet.add(user3);
        userHashSet.add(user4);
        System.out.println(userHashSet);
    }
}
