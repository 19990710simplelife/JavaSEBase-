package cn.simplelife.work._08_customexception;

/**
 * @ClassName AgeException
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 17:54
 * @Version 1.0
 */

public class AgeException extends Exception {

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }

}
