package cn.simplelife.work.myarray;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player(10);
        System.out.println("数组容量是：" + player.capacity());
        player.add(11);
        player.add(22);
        player.add(32);
        player.add(42);
        System.out.println("数组长度是：" + player.length());
        System.out.println(player.toString());
        System.out.println(player.get(2));
        player.replace(1, 33);
        System.out.println(player.toString());
        player.remove(0);
        System.out.println(player.toString());
        System.out.println("数组长度是：" + player.length());
        System.out.println("数组容量是：" + player.capacity());
    }
}
