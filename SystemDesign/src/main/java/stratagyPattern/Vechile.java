package stratagyPattern;

public class Vechile {
   driveStratery ds;

   public Vechile(driveStratery ds){
       this.ds = ds;
   }

   public void drive(){
       ds.drive();
   }

}
