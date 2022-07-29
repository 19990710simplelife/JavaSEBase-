package cn.simplelife.homework._01_myarraycrud;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/7/29 11:43
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        PlayerList playerList = new PlayerList(2);
        playerList.add(11);
        playerList.add(22);
        playerList.add(33);
        playerList.add(44);
        System.out.println(playerList.getCapacity());
        System.out.println(playerList.getCount());
        playerList.get(1);
        playerList.set(0, 55);
        playerList.remove(2);
        System.out.println(playerList.toString());
        System.out.println(playerList.getCapacity());
        System.out.println(playerList.getCount());
    }
}
