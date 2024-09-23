import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,2,2,3,8,4,9);

        int sum = list.stream().mapToInt(e -> e).sum();
        System.out.println(sum);

        OptionalInt max = list.stream().mapToInt(e -> e).min();

        if(max.isPresent()){
            System.out.println(max.getAsInt());
        }

    }
}