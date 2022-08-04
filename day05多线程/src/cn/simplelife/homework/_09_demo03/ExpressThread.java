package cn.simplelife.homework._09_demo03;

/**
 * @ClassName MailMan
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:37
 * @Version 1.0
 */

public class ExpressThread implements Runnable {
    private Expresses[] expresses = new Expresses[100];
    private int count;

    public ExpressThread() {
        for (int i = 0; i < expresses.length; i++) {
            expresses[i] = new Expresses("快递" + (i + 1), "地址：" + i + 1101);
        }
    }

    @Override
    public void run() {
        for (int i = count; i < expresses.length; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (count < expresses.length) {
                    Expresses e = expresses[count++];
                    System.out.println(Thread.currentThread().getName() + "送：" + e.getName() + " " + e.getAddress());
                }
            }
        }
    }
}
