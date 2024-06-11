package builderDesignPattern;

import java.util.List;

public class Student {

    private String id;
    private String name;
    private String age;
    private String motherName;
    private String fatherName;

    private List<String> subjects;

    //we use builderclass to construct
    public Student(BuilderStudent builderStudent){
        this.id = builderStudent.id;
        this.age = builderStudent.age;
        this.name = builderStudent.name;
        this.motherName = builderStudent.motherName;
        this.fatherName = builderStudent.fatherName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
