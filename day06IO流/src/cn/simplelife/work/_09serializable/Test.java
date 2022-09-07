package cn.simplelife.work._09serializable;

import java.io.*;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 16:16
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) throws IOException {
        // 把对象直接写入到文件中去
        User user = new User("张三", "123456", 18);
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\src\\cn\\simplelife\\work\\_09serializable\\info.txt");
        // 创建管道
        OutputStream outputStream = new FileOutputStream(file);
        // 包装输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
    }
}
