package cn.simplelife.homework._07_demo01;

/**
 * @ClassName Course
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:10
 * @Version 1.0
 */

public class Course {
    private String name;
    private double score;


    public Course() {
    }

    public Course(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
