package cn.simplelife.homework._07_demo01;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:11
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Course course0 = new Course("语文", 88);
        Course course1 = new Course("数学", 98);
        Student student0 = new Student("黄晓明", 14, course0);
        Student student1 = new Student("王飞", 15, course1);
        System.out.println("student0 = " + student0);
        System.out.println("student1 = " + student1);
    }
}
