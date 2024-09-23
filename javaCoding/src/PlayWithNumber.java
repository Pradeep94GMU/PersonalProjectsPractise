import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private int rating;

    public Employee(String name, double salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                '}';
    }
}



public class PlayWithNumber {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Pradeep Ranjan", 40000, 4),
                new Employee("Rahul Raj", 40000, 6),
                new Employee("Radha Ranjan", 40000, 5),
                new Employee("Sumit Kumar", 40000, 2),
                new Employee("Nilu Bhashkar", 40000, 5),
                new Employee("Aggy ", 40000, 1)
        );

        System.out.println(list);

        //increment salary by 10% if rating is above 4

        List<Employee> res = list.stream()
                .map(emp -> {
                    if (emp.getRating() > 4) {
                        emp.setSalary(emp.getSalary() + emp.getSalary() * 10 / 100);
                    }
                    return emp;
                }).collect(Collectors.toList());


        System.out.println(res);

    }

}
