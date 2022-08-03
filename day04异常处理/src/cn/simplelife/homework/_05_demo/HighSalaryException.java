package cn.simplelife.homework._05_demo;

/**
 * @ClassName HighSalaryException
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:00
 * @Version 1.0
 */

public class HighSalaryException extends RuntimeException {
    public HighSalaryException(String message) {
        super(message);
    }

    public HighSalaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
