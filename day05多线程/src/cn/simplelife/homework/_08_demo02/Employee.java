package cn.simplelife.homework._08_demo02;

/**
 * @ClassName Employee
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:16
 * @Version 1.0
 */

public class Employee extends Person {
    private String id;
    private double salary;
    private int age;


    @Override
    public void addSalary() {
        this.salary = salary * 0.1 + this.salary;
        this.setSalary(this.salary);
    }

    public Employee(String id, double salary, int age) {
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, String address, String id, double salary, int age) {
        super(name, address);
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
