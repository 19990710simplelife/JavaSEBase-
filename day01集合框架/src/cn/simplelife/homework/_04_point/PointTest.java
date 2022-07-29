package cn.simplelife.homework._04_point;

import java.util.ArrayList;

/**
 * @ClassName PointTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 15:50
 * @Version 1.0
 */

public class PointTest {
    public static void main(String[] args) {
        Point point0 = new Point(1, 5);
        Point point1 = new Point(2, 6);
        Point point2 = new Point(3, 7);
        Point point3 = new Point(4, 8);
        Point point4 = new Point(5, 9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point0);
        arrayList.add(point1);
        arrayList.add(point2);
        arrayList.add(point3);
        arrayList.add(point4);
        arrayList.set(3, new Point(3, 3));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
