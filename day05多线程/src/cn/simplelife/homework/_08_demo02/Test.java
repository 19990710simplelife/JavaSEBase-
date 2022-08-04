package cn.simplelife.homework._08_demo02;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:19
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("张三", "地球", "0001", 100, 20);
        System.out.println("employee = " + employee);
        employee.addSalary();
        System.out.println("employee = " + employee);

        Manager manager = new Manager("李四", "太空", "0002", 1000, 28, "经理");
        System.out.println(manager.getSalary());
        System.out.println("manager = " + manager);
        manager.addSalary();
        System.out.println(manager.getSalary());
        System.out.println("manager = " + manager);
    }
}
