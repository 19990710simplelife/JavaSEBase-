package cn.simplelife.homework._04_throw;

/**
 * @ClassName MyException
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:40
 * @Version 1.0
 */

public class MyException {
    private String[] arr = {"张三", "李四", "王五"};

    public void registerUser(String username) throws Exception {
        for (String s : arr) {
            if (username.equals(s)) {
                throw new Exception("用户名已注册");
            }
        }
    }
}
