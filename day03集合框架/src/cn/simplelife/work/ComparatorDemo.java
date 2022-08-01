package cn.simplelife.work;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName ComparatorDemo
 * @Description treeSet比较器
 * @Author simplelife
 * @Date 2022/8/1 10:42
 * @Version 1.0
 */

public class ComparatorDemo {
    public static void main(String[] args) {
        User user0 = new User("errfd", 22);
        User user3 = new User("qrqwerar", 23);
        User user1 = new User("asdsad", 21);
        User user2 = new User("gjjfgfg", 12);

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        treeSet.add(user0.getName());
        treeSet.add(user1.getName());
        treeSet.add(user2.getName());
        treeSet.add(user3.getName());
        System.out.println("treeSet = " + treeSet);
    }

}

//class LengthCompartor implements Comparator<String> {
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//}
