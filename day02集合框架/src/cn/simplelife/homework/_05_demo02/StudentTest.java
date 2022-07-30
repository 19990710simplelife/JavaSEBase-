package cn.simplelife.homework._05_demo02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName StudentTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 15:58
 * @Version 1.0
 */

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Tom", 18, 100, "class05"));
        students.add(new Student("Jerry", 22, 70, "class04"));
        students.add(new Student("Owen", 25, 90, "class05"));
        students.add(new Student("Jim", 30, 80, "class05"));
        students.add(new Student("Steve", 28, 66, "class06"));
        students.add(new Student("Kevin", 24, 100, "class04"));
        System.out.println(students);
        double sum = 0;
        int total = 0;
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            if ("Kevin".equals(studentIterator.next().getName())) {
                studentIterator.remove();
                break;
            }
        }

        for (Student student : students) {
            if ("Jerry".equals(student.getName())) {
                student.setScore(90);
            }
            if ("class05".equals(student.getClassNum())) {
                sum += student.getScore();
                total++;
            }
        }
        System.out.println(students);
        System.out.println(sum / total);
    }
}
