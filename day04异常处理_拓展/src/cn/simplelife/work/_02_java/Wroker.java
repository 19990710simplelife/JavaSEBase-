package cn.simplelife.work._02_java;

import java.util.Date;

/**
 * @ClassName Wroker
 * @Description
 * @Author simplelife
 * @Date 2022/8/5 11:27
 * @Version 1.0
 */

public class Wroker {
    private Car car;

    public Wroker(Car car) {
        this.car = car;
    }

    public void goTowork() throws LateException {
        try {
            car.run(1);
        } catch (CarWrongException e) {
            walk();
            Date date = new Date(System.currentTimeMillis());
            String reason = e.getMessage();
            throw new LateException(date, reason);
        }
    }

    public void walk() {
        System.out.println("走路上班");
    }
}
