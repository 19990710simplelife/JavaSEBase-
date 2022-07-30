package cn.simplelife.work._01_gener;

/**
 * @ClassName Point
 * @Description
 * @Author simplelife
 * @Date 2022/7/30 9:25
 * @Version 1.0
 */

public class Point<T> {
    private T x;
    private T y;

    public Point() {
    }

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
