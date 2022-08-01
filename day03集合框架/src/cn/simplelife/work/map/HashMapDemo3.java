package cn.simplelife.work.map;

import java.util.HashMap;

/**
 * @ClassName HashMapDemo3
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 15:07
 * @Version 1.0
 */

public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<User, String> map = new HashMap<User, String>();
        User user0 = new User("001", 11);
        User user1 = new User("002", 12);
        User user2 = new User("003", 13);
        User user3 = new User("004", 14);
        map.put(user0, "001");
        map.put(user1, "002");
        map.put(user2, "003");
        map.put(user3, "004");
        System.out.println("map = " + map);
        User user4 = new User("004", 14);
        map.put(user4, "005");
        System.out.println("map = " + map);
    }
}
