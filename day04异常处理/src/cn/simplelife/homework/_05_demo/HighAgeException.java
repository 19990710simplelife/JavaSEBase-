package cn.simplelife.homework._05_demo;

/**
 * @ClassName HighAgeException
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:57
 * @Version 1.0
 */

public class HighAgeException extends RuntimeException {
    public HighAgeException(String message) {
        super(message);
    }

    public HighAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
