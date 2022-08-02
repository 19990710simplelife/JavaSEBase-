package cn.simplelife.work._03_trycatchfinally;

import java.util.Scanner;

/**
 * @ClassName TryCatchFinallyDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 17:27
 * @Version 1.0
 */

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        System.out.println("请输入第一个数");
        try {
            num1 = scanner.nextInt();
            System.out.println("请输入第二个数");
            num2 = scanner.nextInt();
            result = num1 / num2;
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("程序出错了");
        } finally {
            /**
             * finally遇到return也会执行
             */
            System.out.println("我是finally代码块");
        }
        System.out.println("end......");
    }
}
