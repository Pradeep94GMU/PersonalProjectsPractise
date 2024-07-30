package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSet2 {

    private int id;

    private String name;
    private String age;

    private String dept;
    private double salary;

    public EmployeeSet2(int id, String name, String age, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSet2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {

        List<EmployeeSet2> list = Arrays.asList(
                new EmployeeSet2(1, "Pradeep Ranjan", "28", "Dev", 78000),
                new EmployeeSet2(2, "Aisha Patel", "32", "HR", 65000),
                new EmployeeSet2(3, "Carlos Martinez", "25", "Sales", 52000),
                new EmployeeSet2(4, "Danielle Lee", "35", "Marketing", 70000),
                new EmployeeSet2(5, "Ethan Brown", "29", "IT", 85000),
                new EmployeeSet2(6, "Fiona Wilson", "40", "Finance", 90000),
                new EmployeeSet2(7, "Gabriel Chen", "31", "Dev", 72000),
                new EmployeeSet2(8, "Hannah Kim", "27", "HR", 60000),
                new EmployeeSet2(9, "Isaac Patel", "33", "Sales", 55000),
                new EmployeeSet2(10, "Jasmine Singh", "30", "Marketing", 68000)
        );

//      Filter and print all employees with a salary greater than a specified amount.
        List<EmployeeSet2> res1 = list.stream().filter(emp -> emp.getSalary() > 60000).collect(Collectors.toList());
        //System.out.println(res1);

//      Find the sum of all employees' salaries.
        List<Double> res2 = list.stream().map(emp -> emp.getSalary()).collect(Collectors.toList());
        Optional<Double> res22 = res2.stream().reduce((a, b)-> a + b);
        if(res22.isPresent()){
           // System.out.println(res22.get());
        }
        else{
            System.out.println("no values");
        }

//      Count the number of employees in a particular department.
        Map<String, Long> res3 = list.stream().collect(Collectors.groupingBy(emp-> emp.getDept(), Collectors.counting()));
        //System.out.println(res3);

//      Find the average salary of employees in a specific department.
        Map<String, Double> res4 =  list.stream().filter(emp-> emp.getDept().equals("Dev")).collect(Collectors.groupingBy(emp-> emp.getDept(), Collectors.averagingDouble(emp -> emp.getSalary())));
        //System.out.println(res4);

//      Convert a list of employees to a list of their names.
        List<String> res5 = list.stream().map(emp-> emp.getName()).collect(Collectors.toList());
        System.out.println(res5);

//        Find the employee with the highest salary.
//        Find the employee with the lowest salary.
//        Sort employees by their salary in ascending order.
//        Sort employees by their name in alphabetical order.
//        Group employees by department.







    }





}
