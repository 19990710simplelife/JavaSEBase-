package cn.simplelife.homework._08_demo02;

/**
 * @ClassName Person
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:15
 * @Version 1.0
 */

public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public void addSalary() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
