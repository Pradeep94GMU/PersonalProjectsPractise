package ImmutableClass;

import java.util.List;

public final class ImmutableCl {

    private final String a;
    private final List<Object> obj;

    public ImmutableCl(String a, List<Object> obj) {
        this.a = a;
        this.obj = obj;
    }

    //no setters as we need not to modify this class


    public String getA() {
        return a;
    }

    public List<Object> getObj() {
        return obj;
    }

    public Object getObject(){
        return obj;
    }
}
