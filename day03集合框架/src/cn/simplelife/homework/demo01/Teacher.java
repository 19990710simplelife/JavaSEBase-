package cn.simplelife.homework.demo01;

/**
 * @ClassName Teacher
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:59
 * @Version 1.0
 */

public class Teacher {
    private String name;
    private Course course;

    public Teacher() {
    }

    public Teacher(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
