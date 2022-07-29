package cn.simplelife.homework._01_myarraycrud;


import java.util.Arrays;

/**
 * @ClassName PlayerList
 * @Description 球员数组类，用于初始化球队的信息和一系列方法
 * @Author simplelife
 * @Date 2022/7/29 11:15
 * @Version 1.0
 */

public class PlayerList {
    /**
     * 用于存放球员号的数组
     */
    private Integer[] integers;

    /**
     * 定义一个变量表示数组中元素的个数
     */
    private int count;

    /**
     * 默认初始化一个容量为16的数组
     */
    public PlayerList() {
        this.integers = new Integer[16];
        this.count = 0;
    }

    /**
     * 自定义数组长度
     *
     * @param capacity 数组长度
     */
    public PlayerList(int capacity) {
        /**
         * 判断传递的参数的有效性，如果小于=0，输入参数异常
         */
        if (capacity < 0) {
            System.out.println("参数错误！");
        } else {
            this.integers = new Integer[capacity];
            this.count = 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.integers == null) {
            return null;
        }
        if (this.getCount() == 0) {
            return "[]";
        }
        stringBuilder.append("[");
        for (int i = 0; i < this.count; i++) {
            stringBuilder.append(this.integers[i]);
            if (i != this.count - 1) {
                stringBuilder.append(",");
            } else {
                stringBuilder.append("]");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 获取数组的容量
     *
     * @return 返回数组容量
     */
    public int getCapacity() {
        return this.integers.length;
    }

    /**
     * 获取数组中元素个数
     *
     * @return 返回数组中元素个数
     */
    public int getCount() {
        return this.count;
    }

    /**
     * 添加上场球员
     *
     * @param element 上场球员号
     */
    public void add(int element) {
        // 判断是否需要扩展空间
        if (this.count == this.getCapacity()) {
            this.integers = Arrays.copyOf(this.integers, this.count * 2);
        }
        this.integers[this.count] = element;
        this.count++;
    }

    /**
     * 获取指定索引位置的元素
     *
     * @param index 指定索引
     * @return 返回指定索引位置的元素
     */
    public int get(int index) {
        // 判断索引是否合法
        if (index < 0 || index >= this.count) {
            System.out.print("索引参数错误！");
            return -1;
        }
        return this.integers[index];
    }

    /**
     * 替换球员上场
     *
     * @param index   要替换球员的索引
     * @param element 要替换球员的球员号
     */
    public void set(int index, int element) {
        // 判断索引是否合法
        if (index < 0 || index >= this.count) {
            System.out.print("索引参数错误！");
        } else {
            this.integers[index] = element;
        }
    }

    /**
     * 移除指定索引的球员号，并返回该球员号
     *
     * @param index 指定索引
     */
    public int remove(int index) {
        // 判断索引是否合法
        if (index < 0 || index >= this.count) {
            System.out.print("索引参数错误！");
            return -1;
        } else {
            for (int i = index; i < this.count; i++) {
                this.integers[index] = this.integers[index + 1];
            }
            this.count--;
            this.integers[this.count] = 0;
        }
        return this.integers[index];
    }
}
