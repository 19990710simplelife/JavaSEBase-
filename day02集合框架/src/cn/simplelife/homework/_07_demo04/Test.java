package cn.simplelife.homework._07_demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 18:11
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("zhang3", 18, 3000));
        workers.add(new Worker("li4", 25, 3500));
        workers.add(new Worker("wang5", 22, 3200));

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println("-----------------------------");
        workers.add(1, new Worker("zhao6", 24, 3300));
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        workers.remove(3);

        System.out.println("-----------------------------");
        workers.add(1, new Worker("zhao6", 24, 3300));
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
