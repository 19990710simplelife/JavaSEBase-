package cn.simplelife.work._07_throw;

/**
 * @ClassName ThrowExceptionDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 17:10
 * @Version 1.0
 */

public class ThrowExceptionDemo {
    public static void erisUser(String username) throws Exception {
        String[] arr = {"张三", "李四", "王五"};
        for (String s : arr) {
            if (username.equals(s)) {
                throw new Exception("用户名已注册！");
            }
        }
    }

    public static void main(String[] args) {
        try {
            erisUser("张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
