package cn.simplelife.work._05_checkedexception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName CheckedException
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 16:45
 * @Version 1.0
 */

public class CheckedException {
    public static void main(String[] args) {
        /**
         * 检查时异常：也就是编译时异常
         */
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(now);
        System.out.println(format);

        String time = "2011-4-20";
        try {
            Date parse = simpleDateFormat.parse(time);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
