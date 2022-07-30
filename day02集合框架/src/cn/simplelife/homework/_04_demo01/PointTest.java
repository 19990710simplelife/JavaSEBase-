package cn.simplelife.homework._04_demo01;

import java.util.HashSet;

/**
 * @ClassName PointTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:30
 * @Version 1.0
 */

public class PointTest {
    public static void main(String[] args) {
        Point<Integer> integerPoint0 = new Point<>(1, 1);
        Point<Integer> integerPoint1 = new Point<>(2, 2);
        Point<Integer> integerPoint2 = new Point<>(3, 3);
        Point<Integer> integerPoint3 = new Point<>(4, 4);
        Point<Integer> integerPoint4 = new Point<>(5, 5);

        HashSet<Point<Integer>> integerHashSet = new HashSet<>();
        integerHashSet.add(integerPoint0);
        integerHashSet.add(integerPoint1);
        integerHashSet.add(integerPoint2);
        integerHashSet.add(integerPoint3);
        integerHashSet.add(integerPoint4);
        System.out.println(integerHashSet);
        System.out.println("--------------------------------");
        for (Point<Integer> integerPoint : integerHashSet) {
            System.out.println(integerPoint);
        }
    }
}
