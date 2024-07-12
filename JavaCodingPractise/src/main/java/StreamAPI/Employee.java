package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int id;
    private int age;
    private int salary;
    private String location;

    // Constructor
    public Employee(String name, int id, int age, int salary, String location) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1, 30, 70000, "New York");
        Employee emp2 = new Employee("Bob", 2, 35, 80000, "San Francisco");
        Employee emp4 = new Employee("new1", 4, 22, 80000, "Francisco");
        Employee emp3 = new Employee("Charlie", 3, 40, 90000, "Los Angeles");



        // Print employee details
//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);

        List<Employee> list= Arrays.asList(emp1, emp2, emp3, emp4);


        //find the max salary emp

        //list.stream()
        //       .sorted(Comparator.comparing(Employee::getName).reverse()).forEach(System.out::println);


        list.stream()
                .sorted((e1, e2)-> e2.getSalary() - e1.getSalary()).forEach(System.out::println);

        //reverse
        //System.out.println(employee);



        //filter employee detail based on salary first then location

//        list.stream()
//                .sorted(
//                        Comparator.comparingDouble(Employee::getSalary)
//                                .thenComparing(Employee::getLocation)
//                ).forEach(x-> System.out.println(x));


        //extract the salary list

        List<Integer> collect = list.stream()
                .map(Employee::getSalary).collect(Collectors.toList());

        Employee employee = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();

        //System.out.println(collect);
        System.out.println(employee.getName());




    }
}

