package cn.simplelife.homework._01_comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName ComparatorDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:24
 * @Version 1.0
 */

public class ComparatorDemo {
    public static void main(String[] args) {
        User user0 = new User("akdfhkahvas", 78);
        User user1 = new User("bkdfhkash", 58);
        User user2 = new User("dkdfdash", 8);
        User user3 = new User("tkdfczx", 28);
        User user4 = new User("tkdfczx", 18);

        TreeSet<User> treeSet = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getName().length() == o2.getName().length()) {
                    return o1.getAge() - o2.getAge();
                } else {
                    return o1.getName().length() - o2.getName().length();
                }
            }
        });

        treeSet.add(user0);
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        System.out.println(treeSet);
    }
}
