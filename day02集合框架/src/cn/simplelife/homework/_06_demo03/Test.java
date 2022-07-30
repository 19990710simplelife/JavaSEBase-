package cn.simplelife.homework._06_demo03;

import java.util.HashSet;

/**
 * @ClassName Tetst
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 18:00
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        HashSet<Employee> department1Employee = new HashSet<>();
        department1Employee.add(new Employee("小斌", 22));
        department1Employee.add(new Employee("地雷", 23));
        department1Employee.add(new Employee("吉吉", 21));
        Department department1 = new Department("部门1", department1Employee);
        System.out.println("department1 = " + department1);
        System.out.println("------------------------------------------------");

        HashSet<Employee> department2Employee = new HashSet<>();
        department2Employee.add(new Employee("东方菇凉", 18));
        department2Employee.add(new Employee("独孤求败", 28));
        department2Employee.add(new Employee("糖糖", 25));
        Department department2 = new Department("部门2", department2Employee);
        System.out.println("department2 = " + department2);
    }
}
