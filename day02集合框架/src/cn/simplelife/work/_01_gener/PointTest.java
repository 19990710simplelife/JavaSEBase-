package cn.simplelife.work._01_gener;

/**
 * @ClassName PointTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 9:26
 * @Version 1.0
 */

public class PointTest {
    public static void main(String[] args) {
        Point<String> stringPoint = new Point<>("1", "2");
        System.out.println("stringPoint = " + stringPoint);
        System.out.println("----------------------------------");
        Point<Double> doublePoint = new Point<>(1.0, 2.6);
        System.out.println("doublePoint = " + doublePoint);
        System.out.println("----------------------------------");
        Point<Integer> integerPoint = new Point<>(1, 5);
        System.out.println("integerPoint = " + integerPoint);
    }
}
