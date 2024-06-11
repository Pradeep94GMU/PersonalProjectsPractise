package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MbaStudent extends BuilderStudent{

    @Override
    public BuilderStudent setSubjects() {

        List<String> sub = new ArrayList<>();

        sub.add("Civics");
        sub.add("GK");
        sub.add("MBBS");

        this.subjects = sub;
        return this;
    }
}
