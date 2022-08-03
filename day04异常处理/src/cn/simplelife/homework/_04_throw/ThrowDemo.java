package cn.simplelife.homework._04_throw;

/**
 * @ClassName ThrowDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:40
 * @Version 1.0
 */

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        MyException myException = new MyException();
        myException.registerUser("张三");
    }
}
