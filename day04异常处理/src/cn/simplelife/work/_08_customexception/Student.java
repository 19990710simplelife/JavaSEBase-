package cn.simplelife.work._08_customexception;

/**
 * @ClassName Student
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 17:49
 * @Version 1.0
 */

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) throws AgeException {
        if (age < 0 || age > 120) {
            throw new AgeException("年龄错误！");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
