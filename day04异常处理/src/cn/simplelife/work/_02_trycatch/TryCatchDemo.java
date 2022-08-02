package cn.simplelife.work._02_trycatch;

import java.util.Scanner;

/**
 * @ClassName TryCatchDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 16:16
 * @Version 1.0
 */

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        try {
            System.out.println("请输入第一个数");
            num1 = scanner.nextDouble();
            System.out.println("请输入第二个数");
            num2 = scanner.nextDouble();
            result = num1 / num2;
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("出问题了！");
        }
        System.out.println("end......");
    }
}
