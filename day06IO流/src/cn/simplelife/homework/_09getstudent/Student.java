package cn.simplelife.homework._09getstudent;

import lombok.*;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author simplelife
 * @Date 2022/9/13 20:34
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {
    private String name;
    private Integer age;
    private Double score;
}
