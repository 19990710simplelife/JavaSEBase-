package cn.simplelife.homework.demo01;

import jdk.nashorn.internal.ir.CallNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 20:01
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Teacher stef = new Teacher("stef", new Course("p2p"));
        Teacher will = new Teacher("will", new Course("javaWeb"));
        Teacher neld = new Teacher("neld", new Course("springmvc"));
        Teacher hesj = new Teacher("hesj", new Course("wms"));
        Teacher bunny = new Teacher("bunny", new Course("javaWeb"));
        Teacher hhaiy = new Teacher("hhaiy", new Course("javaSe"));
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put(stef.getName(), stef.getCourse().getName());
        stringHashMap.put(will.getName(), will.getCourse().getName());
        stringHashMap.put(neld.getName(), neld.getCourse().getName());
        stringHashMap.put(hesj.getName(), hesj.getCourse().getName());
        stringHashMap.put(bunny.getName(), bunny.getCourse().getName());
        stringHashMap.put(hhaiy.getName(), hhaiy.getCourse().getName());
        System.out.println(stringHashMap);
        System.out.println("------------------------------------------");
        Teacher dafei = new Teacher("dafei ", new Course("jdbc"));
        stringHashMap.put(dafei.getName(), dafei.getCourse().getName());
        System.out.println(stringHashMap);
        System.out.println("------------------------------------------");
        stringHashMap.put(hhaiy.getName(), "javaWeb");
        System.out.println(stringHashMap);
        System.out.println("------------------------------------------");

        Set<String> strings = stringHashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = stringHashMap.get(key);
            System.out.println("key: " + key + " value: " + value);
        }
        System.out.println("------------------------------------------");
        Set<String> strings2 = stringHashMap.keySet();
        for (String key : strings) {
            if (stringHashMap.get(key).equals("javaWeb")) {
                System.out.println(key);
            }
        }
    }
}
