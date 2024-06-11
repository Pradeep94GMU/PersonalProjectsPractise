package builderDesignPattern;

public class Client {

    public static void main(String[] args) {
        Director director1 = new Director(new EngineerStudent());
        Director director2 = new Director(new MbaStudent());

        Student enggStudent1 = director1.createStudent();
        Student MbaStudent2 = director2.createStudent();

        System.out.println(enggStudent1);
        System.out.println(MbaStudent2);
    }



}
