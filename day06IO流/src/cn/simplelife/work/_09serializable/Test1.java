package cn.simplelife.work._09serializable;

import java.io.*;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/9/7 16:16
 * @Version 1.0
 */

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 把对象直接写入到文件中去
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\src\\cn\\simplelife\\work\\_09serializable\\info.txt");
        // 创建管道
        InputStream inputStream = new FileInputStream(file);
        // 包装输出流
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object o = objectInputStream.readObject();
        System.out.println("read = " + o);
        objectInputStream.close();
    }
}
