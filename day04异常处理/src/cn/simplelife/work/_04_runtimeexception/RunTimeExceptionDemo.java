package cn.simplelife.work._04_runtimeexception;

/**
 * @ClassName RunTimeExceptionDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 16:30
 * @Version 1.0
 */

public class RunTimeExceptionDemo {
    public static void main(String[] args) {
        /**
         * 运行时异常：
         * 在编译时期不被检查，只有在运行时才会被发现的异常
         * 运行时异常程序员可以处理也可以不处理
         */
        // 常见的运行时异常
        int[] arr = {1, 32, 3};
        //java.lang.ArrayIndexOutOfBoundsException: 所有越界
        //int item = arr[10];

        // java.lang.ArithmeticException: / by zero 除数不能为0
        // int result = 1 / 0;
        String str = null;
        // java.lang.NullPointerException 空指针异常
        // str.length();

        // java.lang.NumberFormatException: For input string: "sad" 数据格式化异常
        // Integer.parseInt("sad");
    }
}
