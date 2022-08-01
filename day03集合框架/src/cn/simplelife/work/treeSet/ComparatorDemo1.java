package cn.simplelife.work.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName ComparatorDemo
 * @Description treeSet比较器
 * @Author simplelife
 * @Date 2022/8/1 10:42
 * @Version 1.0
 */

public class ComparatorDemo1 {
    public static void main(String[] args) {
        /**
         * 直接指定自定义比较器
         */
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
        User user0 = new User("errfd", 22);
        User user3 = new User("qrqwerar", 23);
        User user1 = new User("asdsa", 21);
        User user2 = new User("gjjfgfg", 12);

        treeSet.add(user0);
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        System.out.println("treeSet = " + treeSet);
    }
}
