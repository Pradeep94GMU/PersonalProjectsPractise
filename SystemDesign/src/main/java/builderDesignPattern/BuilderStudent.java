package builderDesignPattern;

import java.util.List;

public abstract class BuilderStudent {

     String id;
     String name;
     String age;
     String motherName;
     String fatherName;

     List<String> subjects;

    public BuilderStudent setId(String id) {
        this.id = id;
        return this;
    }

    public BuilderStudent setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderStudent setAge(String age) {
        this.age = age;
        return this;
    }

    public BuilderStudent setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public BuilderStudent setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public abstract BuilderStudent setSubjects();

    //now we can build with Student type

    public Student build(){
        return new Student(this);
    }
}
