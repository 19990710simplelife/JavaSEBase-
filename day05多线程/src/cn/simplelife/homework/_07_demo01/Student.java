package cn.simplelife.homework._07_demo01;

/**
 * @ClassName Studnet
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:09
 * @Version 1.0
 */

public class Student {
    private String name;
    private int age;
    private Course course;

    public Student() {
    }

    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
