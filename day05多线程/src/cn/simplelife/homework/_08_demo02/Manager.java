package cn.simplelife.homework._08_demo02;

/**
 * @ClassName Manager
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:17
 * @Version 1.0
 */

public class Manager extends Employee {
    private String level;

    @Override
    public void addSalary() {
        double salary1;
        salary1 = this.getSalary() * 0.2 + this.getSalary();
        this.setSalary(salary1);
    }

    public Manager(String id, double salary, int age, String level) {
        super(id, salary, age);
        this.level = level;
    }

    public Manager(String name, String address, String id, double salary, int age, String level) {
        super(name, address, id, salary, age);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "level='" + level + '\'' +
                '}';
    }
}
