package cn.simplelife.work._02_java;

/**
 * @ClassName CarWrongException
 * @Description
 * @Author simplelife
 * @Date 2022/8/5 11:22
 * @Version 1.0
 */

public class CarWrongException extends Exception{
    public CarWrongException() {
    }

    public CarWrongException(String message) {
        super(message);
    }
}
