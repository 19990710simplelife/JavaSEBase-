package cn.simplelife.homework._05_student;

import java.util.ArrayList;

/**
 * @ClassName StudentTest
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 15:58
 * @Version 1.0
 */

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 18, 100, "class05"));
        students.add(new Student("Jerry", 22, 70, "class04"));
        students.add(new Student("Owen", 25, 90, "class05"));
        students.add(new Student("Jim", 30, 80, "class05"));
        students.add(new Student("Steve", 28, 66, "class06"));
        students.add(new Student("Kevin", 24, 100, "class04"));
        updateScore(students, "Jerry");
        remove(students, "Kevin");
        double class05 = getClassAvgScore(students, "class05");
        System.out.println("class05 = " + class05);
        print(students);
    }


    /**
     * 修改成绩
     *
     * @param arrayList  集合
     * @param updateName 要修改成绩的学生姓名
     */
    public static void updateScore(ArrayList<Student> arrayList, String updateName) {
        for (Student student : arrayList) {
            if (student.getName().equals(updateName)) {
                student.setScore(90);
            }
        }
    }


    /**
     * 遍历输出集合中的元素
     *
     * @param arrayList 要输出的集合
     */
    public static void print(ArrayList<Student> arrayList) {
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }

    /**
     * 移除指定姓名的元素
     *
     * @param arrayList  集合
     * @param removeName 指定姓名
     */
    public static void remove(ArrayList<Student> arrayList, String removeName) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(removeName)) {
                arrayList.remove(i);
            } else {
                return;
            }
        }
    }

    /**
     * 求各班级平均分
     *
     * @param arrayList 集合
     * @param classNum  班级号
     * @return 返回各个班级的平均分
     */
    public static double getClassAvgScore(ArrayList<Student> arrayList, String classNum) {
        double sum = 0; // 总分
        int total = 0; // 标记人数
        for (Student student : arrayList) {
            if (student.getClassNum().equals(classNum)) {
                sum += student.getScore();
                total++;
            }
        }
        return sum / total;
    }
}
