package cn.simplelife.homework._09getstudent;

import cn.simplelife.work._09serializable.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName GetStudent
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 20:33
 * @Version 1.0
 */

public class GetStudent {
    public static void main(String[] args) {
        File file = new File("F:\\javaSE\\JavaSE基础进阶\\day06IO流\\test\\Student.txt");
        try {
            Reader reader = new FileReader(file);
            int len;
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = new char[1024];
            if ((len = reader.read(chars)) != -1) {
                stringBuilder.append(chars, 0, len);
            }
            String[] split = stringBuilder.toString().split(";");
            List<Student> list = new ArrayList<>();
            for (String s : split) {
                String[] split1 = s.split("-");
                Student student = new Student();
                student.setName(split1[0]);
                student.setAge(Integer.valueOf(split1[1]));
                student.setScore(Double.valueOf(split1[2]));
                list.add(student);
            }
            double sum = 0;
            for (Student student : list) {
                sum += student.getScore();
            }
            System.out.println(sum / list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
