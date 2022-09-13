package cn.simplelife.homework._08getcount;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName GetCharCount
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 20:08
 * @Version 1.0
 */

public class GetCharCount {
    public static void main(String[] args) {
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\copydemo\\calcCharNum.txt");
        try {
            Reader reader = new FileReader(file);
            int len;
            char[] chars = new char[1024];
            StringBuilder stringBuilder = new StringBuilder();
            while ((len = reader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            String string = stringBuilder.toString();
            // 创建一个map集合
            HashMap<String, Integer> hashMap = new HashMap<>();
            String key;
            for (int i = 0; i < string.length(); i++) {
                key = string.charAt(i) + "";
                if (!hashMap.containsKey(key)) {
                    hashMap.put(key, 1);
                } else {
                    Integer integer = hashMap.get(key);
                    integer += 1;
                    hashMap.put(key, integer);
                }
            }
            String[] objects = (String[]) hashMap.keySet().toArray();
            for (String o : objects) {
                System.out.print(o + "(" + hashMap.get(o) + "), ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
