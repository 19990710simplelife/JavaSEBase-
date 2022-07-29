package cn.simplelife.homework._01_myarraycrud;

/**
 * @ClassName MyArrayListTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 14:33
 * @Version 1.0
 */

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(1);
        myArrayList.add(1.0);
        myArrayList.add("张三");
        System.out.println(myArrayList.toString());
    }
}
