package cn.simplelife.homework.demo01;

/**
 * @ClassName Course
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 20:00
 * @Version 1.0
 */

public class Course {
    private String name;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
