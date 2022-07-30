package cn.simplelife.homework._06_demo03;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Objects;

/**
 * @ClassName Employee
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:56
 * @Version 1.0
 */

public class Employee {
    private String name;
    private int age;


    public Employee() {
    }

    public Employee(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
