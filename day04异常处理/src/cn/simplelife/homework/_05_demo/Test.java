package cn.simplelife.homework._05_demo;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:01
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("001", "张三", 18);
        employee.setCardId("15613541835148");
        employee.setSalary(1000);
        System.out.println(employee);
    }
}
