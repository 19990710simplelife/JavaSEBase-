package cn.simplelife.homework._09_demo03;

/**
 * @ClassName Expresses
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:33
 * @Version 1.0
 */

public class Expresses {
    private String name;
    private String address;

    public Expresses() {
    }

    public Expresses(String name, String address) {
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
        return "Expresses{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
