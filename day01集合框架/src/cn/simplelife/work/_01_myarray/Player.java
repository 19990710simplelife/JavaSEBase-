package cn.simplelife.work._01_myarray;

/**
 * 可变数组，可以对数组进行增删改查
 */
public class Player {
    private Integer[] values;
    private int count;//记录数组中元素的个数

    /**
     * 初始化默认容量为16的可变数组
     */
    public Player() {
        this.values = new Integer[16];
        this.count = 0;
    }

    /**
     * 初始化指定容量的数组
     *
     * @param capacity 指定的容量
     */
    public Player(int capacity) {
        this.values = new Integer[capacity];
        this.count = 0;
    }

    /**
     * 获取数组的容量
     *
     * @return 返回数组的容量
     */
    public int capacity() {
        return this.values.length;
    }

    public int length() {
        return this.count;
    }

    /**
     * 添加数组元素
     *
     * @param value 添加的元数据
     */
    public void add(int value) {
        /**
         * 判断容量是否足够
         * TODO 检查容量并拓展容量
         */
        if (this.count == this.capacity()) {
            // 扩容空间
            Integer[] newArr = new Integer[this.capacity() * 2 + 2];
            // 复制原数组数据到新数组
            System.arraycopy(this.values, 0, newArr, 0, this.count);
            // 修改原数组的引用地址
            this.values = newArr;
        }
        this.values[this.count] = value;
        this.count++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        // 1、校验数组是否有元素
        if (this.count > 0) {
            stringBuilder.append("[");
            for (int i = 0; i < this.count; i++) {
                stringBuilder.append(this.values[i]);
                stringBuilder.append(",");
            }
            stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "]");
            return stringBuilder.toString();
        } else {
            return "[]";
        }
    }

    /**
     * 获取指定位置的元素
     *
     * @param index 指定位置
     * @return 返回指定位置的元素
     */
    public int get(int index) {
        if (index < 0 || index >= this.count) {
            System.out.print("参数错误！！！");
            return -1;
        }
        return this.values[index];
    }

    /**
     * 修改数组元素
     *
     * @param index 要修改的索引
     * @param value 要修改的值
     */
    public void replace(int index, int value) {
        if (index < 0 || index >= this.count) {
            System.out.print("参数错误！！！");
        } else {
            this.values[index] = value;
        }
    }

    /**
     * 删除数组元素
     *
     * @param index 要删除元素的索引
     */
    public void remove(int index) {
        if (index < 0 || index >= this.count) {
            System.out.print("参数错误！！！");
        } else {
            for (int i = index; i < this.count - 1; i++) {
                this.values[i] = this.values[i + 1];
            }
            this.values[this.count - 1] = 0;
            this.count--;
        }
    }
}
