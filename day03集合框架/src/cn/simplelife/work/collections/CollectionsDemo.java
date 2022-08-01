package cn.simplelife.work.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 15:46
 * @Version 1.0
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        String[] arr = {"1", "3330", "dsfds"};
        List<String> strings = Arrays.asList(arr);
        System.out.println(strings);
//        strings.add("2e");//java.lang.UnsupportedOperationException
        List<Integer> list = Arrays.asList(1, 4, 6, 3, 2, 8);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
