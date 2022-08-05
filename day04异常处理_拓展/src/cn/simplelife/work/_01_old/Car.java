package cn.simplelife.work._01_old;

/**
 * @ClassName Car
 * @Description 这是一各汽车类，表示汽车异常和正常两种情况
 * @Author simplelife
 * @Date 2022/8/5 11:07
 * @Version 1.0
 */

public class Car {
    public static final int OK = 1; //正常情况
    public static final int WRONG = 2;//异常情况

    public int run() {
        if (OK == 1) {
            return OK;
        } else {
            return WRONG;
        }
    }
}
