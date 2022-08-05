package cn.simplelife.work._02_java;

/**
 * @ClassName Car
 * @Description
 * @Author simplelife
 * @Date 2022/8/5 11:25
 * @Version 1.0
 */

public class Car {
    public void run(int error) throws CarWrongException {
        if (error == 1) {
            throw new CarWrongException("车子无法刹车");
        } else if (error == 2) {
            throw new CarWrongException("发动机启动异常");
        } else {
            System.out.println("正常");
        }
    }
}
