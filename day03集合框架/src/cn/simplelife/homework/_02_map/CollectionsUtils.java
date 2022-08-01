package cn.simplelife.homework._02_map;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @ClassName CollectionsUtils
 * @Description
 * @Author simplelife
 * @Date 2022/8/1 19:52
 * @Version 1.0
 */

public class CollectionsUtils {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 4, 56, 7, 8, 90);
        Collections.sort(integers);
        int i = Collections.binarySearch(integers, 90);
        System.out.println(integers);
        System.out.println("i = " + i);
    }
}
