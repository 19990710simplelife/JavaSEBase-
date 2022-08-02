package cn.simplelife.work._06_throws;

/**
 * @ClassName ThrowsException
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 16:55
 * @Version 1.0
 */

public class ThrowsException {
    public static void main(String[] args) {
        /**
         * throws
         * 当方法的定义者在定义方法的时候知道调用该方法时可能会出现异常，但方法定义者不知道如何处理该异常
         * 语法：
         * 修饰符 返回值类型 方法名（参数列表）throws 异常1，异常2..{}
         */
        try {
            divide(1, 0);
            divide(2, 2);
        } catch (Exception e) {
            e.printStackTrace();
    }
    }

    public static void divide(int a, int b) throws Exception {
        System.out.println(a / b);
    }
}
