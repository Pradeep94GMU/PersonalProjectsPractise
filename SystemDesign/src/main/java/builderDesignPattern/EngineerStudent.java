package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudent extends BuilderStudent{

    @Override
    public BuilderStudent setSubjects() {

        List<String> sub = new ArrayList<>();

        sub.add("OS");
        sub.add("DSA");
        sub.add("OOPS");
        sub.add("LLD");
        sub.add("HLD");
        this.subjects = sub;
        return this;
    }
}
