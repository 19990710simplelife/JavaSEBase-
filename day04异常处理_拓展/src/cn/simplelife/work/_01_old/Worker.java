package cn.simplelife.work._01_old;

/**
 * @ClassName Worker
 * @Description 这是工人类，调用汽车类中的方法，根据返回结果确定上班方式及结果
 * @Author simplelife
 * @Date 2022/8/5 11:10
 * @Version 1.0
 */

public class Worker {
    private Car car;
    public static final int IN_TIME = 1; //正常情况下准时到达单位
    public static final int LATE = 2;//异常情况，上班迟到

    public Worker(Car car) {
        this.car = car;
    }

    public int goToWork() {
        if (car.run() == Car.OK) {
            return IN_TIME;
        } else {
            walk();
            return LATE;
        }
    }

    private void walk() {
        System.out.println("走路去上班");
    }
}
