package cn.simplelife.work._02_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ClassName TryCatchDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 16:16
 * @Version 1.0
 */

public class TryCatchDemo1 {
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
            /**
             * e.toString():返回异常类型和异常信息
             * e.getMessage():用于获取异常的具体信息
             * e.printStackTrace():打印异常的堆栈信息
             */
        } catch (InputMismatchException e) {
//            System.out.println("出现输入不匹配异常！");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0！");
        } catch (Exception e) {
            System.out.println("程序出错了");
        }
        System.out.println("end......");
    }
}
