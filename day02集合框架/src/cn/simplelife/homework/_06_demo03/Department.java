package cn.simplelife.homework._06_demo03;

import java.util.HashSet;

/**
 * @ClassName Department
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 17:59
 * @Version 1.0
 */

public class Department {
    private String deptName;
    private HashSet<Employee> employees;

    public Department() {
    }

    public Department(String deptName, HashSet<Employee> employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashSet<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
