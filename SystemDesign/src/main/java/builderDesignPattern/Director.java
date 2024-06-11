package builderDesignPattern;

public class Director {


    BuilderStudent builderStudent;

    Director(BuilderStudent builderStudent){
        this.builderStudent = builderStudent;
    }

    public Student createStudent(){
        if(builderStudent instanceof EngineerStudent){
            return createENginneringStudent();
        }
         else if(builderStudent instanceof MbaStudent){
             return createMbaStudent();
        }
         else{
             return null;
        }
    }

    public Student createENginneringStudent(){

        return builderStudent.setId("101")
                .setAge("32")
                .setName("Rahul")
                .setSubjects().build();
    }

    public Student createMbaStudent(){

       return builderStudent.setId("900")
               .setFatherName("Hari Om")
               .setMotherName("Krishna")
               .setSubjects().build();
    }


}
