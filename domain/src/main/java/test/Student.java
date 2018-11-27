package test;

import lombok.Data;

@Data
public class Student {
    /**
     * 名称
     */
    private String name;

    /**
     * 班级
     */
    private String clazz;

    public Student(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

}
