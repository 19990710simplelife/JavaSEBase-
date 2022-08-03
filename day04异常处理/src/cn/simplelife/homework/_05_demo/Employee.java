package cn.simplelife.homework._05_demo;

/**
 * @ClassName Employe
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:48
 * @Version 1.0
 */

public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;
    private String cardId;

    public void addSalary(double addSalary) {
        if ((this.salary + addSalary) > 5000) {
            throw new HighSalaryException("工资太高了");
        }
    }

    public Employee() {
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        if (name == null) {
            throw new NullPointerException("空指针异常");
        } else {
            this.name = name;
        }
        if (age < 18) {
            throw new LowAgeException("年龄底异常");
        } else if (age > 60) {
            throw new HighAgeException("年龄高异常");
        } else {
            this.age = age;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 5000) {
            throw new HighSalaryException("工资太高了！");
        }
        this.salary = salary;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cardId='" + cardId + '\'' +
                '}';
    }
}
