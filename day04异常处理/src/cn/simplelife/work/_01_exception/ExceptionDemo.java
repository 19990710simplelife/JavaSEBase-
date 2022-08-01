package cn.simplelife.work._01_exception;

import java.util.Scanner;

/**
 * @ClassName ExceptionDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 15:58
 * @Version 1.0
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        System.out.println("请输入第一个数");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
            System.out.println("请输入第二个数");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result = " + result);
                } else {
                    System.out.println("输入参数错误");
                }
            } else {
                System.out.println("输入参数错误");
            }
        } else {
            System.out.println("输入参数错误");
        }
    }
}
