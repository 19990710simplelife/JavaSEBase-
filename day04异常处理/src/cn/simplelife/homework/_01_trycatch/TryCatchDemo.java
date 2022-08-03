package cn.simplelife.homework._01_trycatch;

import java.util.Scanner;

/**
 * @ClassName TryCatchDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:30
 * @Version 1.0
 */

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2 = 0, result;
        System.out.println("请输入第一个数：");
        num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");

        try {
            num2 = scanner.nextInt();
            result = num1 / num2;
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0！");
        }
    }
}
