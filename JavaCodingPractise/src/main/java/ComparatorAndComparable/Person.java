package ComparatorAndComparable;

public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int height;

    public Person(int id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Person person){
        return Integer.compare(this.height, person.height);
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
