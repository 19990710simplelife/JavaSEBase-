package cn.simplelife.work._08_customexception;

/**
 * @ClassName CustomException
 * @Description
 * @Author simplelife
 * @Date 2022/8/2 17:45
 * @Version 1.0
 */

public class CustomException {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zs");
        try {
            student.setAge(181);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(student);
    }
}
