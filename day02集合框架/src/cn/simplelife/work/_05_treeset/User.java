package cn.simplelife.work._05_treeset;

/**
 * @ClassName User
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 14:43
 * @Version 1.0
 */

public class User implements Comparable<User> {
    private String id;
    private String name;
    private int age;

    public User() {
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(User o) {
//        if (this.getAge() > o.getAge()) {
//            return 1;
//        } else if (this.getAge() < o.getAge()) {
//            return -1;
//        } else {
//            return 0;
//        }
        return Integer.compare(this.getAge(), o.getAge());
    }
}
