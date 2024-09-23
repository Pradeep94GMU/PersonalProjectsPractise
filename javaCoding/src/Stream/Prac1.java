package Stream;


import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private String Location;
    private int age;

    private String gender;

    public Employee() {
    }

    public Employee(int id, String name, String location, int age, String gender) {
        this.id = id;
        this.name = name;
        Location = location;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Location='" + Location + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Prac1 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Apple", "Chapra", 32, "Male"),
                new Employee(2, "Orange", "Bihar", 23, "Female"),
                new Employee(3, "Aging", "patna", 44,"Male"),
                new Employee(4, "Sitafal", "nalanda", 12,"Female"),
                new Employee(5, "Grapes", "patna", 55,"Female"),
                new Employee(6, "jamun", "Chapra", 22, "Male")
        );

        /*Find list of employees whose name starts with alphabet A
        List<Employee> res = list.stream().filter(emp -> emp.getName().startsWith("A")).collect(Collectors.toList());
        res.stream().forEach(System.out::println);
         */

        /*
        //Group The employees By Department Names
        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getLocation));

        //way to print Map using StreamAPI
        collect.entrySet().forEach(System.out::println);
         */

        /*
        //Find the total count of employees using stream
        int res = list.size();
        Long res2 = list.stream().count();

        System.out.println(res +" and "+res2);
         */

        /*
        //Find the max age of employees
        int maxAge = list.stream().mapToInt(emp-> emp.getAge()).max().orElse(-1);

        System.out.println(maxAge);
         */

        /*
        //Find all department names
        List<String> locationNames = list.stream().map(emp -> emp.getLocation()).collect(Collectors.toList());

        System.out.println(locationNames);
         */

        /*
        //Find the count of employee in each department
        Map<String, Long> deptWise = list.stream().collect(Collectors.groupingBy(Employee::getLocation, Collectors.counting()));

        deptWise.entrySet().forEach(System.out::println);
         */


        /*
        //Find the list of employees whose age is less than 30
        List<Employee> lessAge = list.stream().filter(emp -> emp.getAge() < 30 ).collect(Collectors.toList());
        System.out.println(lessAge);
         */

        /*
        //Find the list of employees whose age is in between 26 and 31
        List<Employee> lessAge = list.stream().filter(emp -> emp.getAge() >= 26 && emp.getAge() < 31 ).collect(Collectors.toList());
        System.out.println(lessAge);
         */


        /*
        //Find the average age of male and female employee
        Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        avgAge.entrySet().forEach(System.out::println);
         */

        //Find the department who is having maximum number of employee
        Map.Entry<String, Long> maxLoca = list.stream().collect(Collectors.groupingBy(Employee::getLocation, Collectors.counting()))
                //we hv map so we need to find which is max among values
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //this is above one is returning a map entry right so we need a data type which can store this

        System.out.println(maxLoca.getKey()+" and "+maxLoca.getValue());





    }

}
