package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class StudentDemo1 {
        private String name;
        private int mathMarks;
        private int scienceMarks;
        private int englishMarks;

    public StudentDemo1(String name, int mathMarks, int scienceMarks, int englishMarks) {
        this.name = name;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }
}

public class Main{

    public static void main(String[] args) {

        // Creating a list of students with their marks in various subjects
        List<StudentDemo1> students = Arrays.asList(
                new StudentDemo1("Alice", 85, 90, 75),
                new StudentDemo1("Bob", 95, 80, 85),
                new StudentDemo1("Charlie", 78, 88, 82),
                new StudentDemo1("Don", 98, 68, 72)
        );

        students.forEach(x-> System.out.println(x.getMathMarks()));

        //find math marks max
        StudentDemo1 studentDemo1 = students.stream()
                .max((a, b) -> a.getMathMarks() - b.getMathMarks()).get();

        System.out.println("Max mark of a student: "+studentDemo1.getMathMarks());

    }

}
