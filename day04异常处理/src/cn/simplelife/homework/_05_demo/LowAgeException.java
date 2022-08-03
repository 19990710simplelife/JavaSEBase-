package cn.simplelife.homework._05_demo;

/**
 * @ClassName LowAgeException
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:51
 * @Version 1.0
 */

public class LowAgeException extends RuntimeException {

    public LowAgeException(String message) {
        super(message);
    }

    public LowAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
