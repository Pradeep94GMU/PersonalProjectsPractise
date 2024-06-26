package ComparatorAndComparable;

import java.util.Comparator;

//sorts persons first by age, and if age are the same, it then sorts by name.
public class SortPersonsbyMultipleFields implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2){
        //first need to compare the age
        int ageCompare = Integer.compare(e1.getAge(), e2.getAge());
        //we get 3 different options in ageCompare Either 0, 1 , -1
        if(ageCompare != 0){
            //e1 is smaller so it will store 1st then e2 store
            return ageCompare;
        }else{
            //meanign we got same age now
            //now we can compare with respect to name
            return e1.getName().compareTo(e2.getName());
        }
    }

}
