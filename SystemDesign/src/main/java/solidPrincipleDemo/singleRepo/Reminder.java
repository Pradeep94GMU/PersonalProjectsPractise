package solidPrincipleDemo.singleRepo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {

  private int id;
  private String note;
  private LocalDateTime time;

  public List<Reminder> reminderList = new ArrayList<>();

  public Reminder() {
  }

  public Reminder(int id, String note, LocalDateTime time) {
    this.id = id;
    this.note = note;
    this.time = time;
  }


  //method, jisme addReminder kar saku with the help of Reminder Object

  public void addReminder(Reminder reminder){
    if(reminder.id <= 0 )
    {
      System.out.println("Not possible to set reminder for this id");
      return;
    }
    reminderList.add(reminder);
    System.out.println("Added one reminder successfully: "+ reminder.getNote());

  }

  //delete the reminder
  public void deleteReminder(Reminder reminder){
    reminderList.remove(reminder);
    System.out.println("deleted one reminder: "+ reminder.note);
  }

  public void saveReminder(String filename) throws FileNotFoundException {

    PrintStream writter = new PrintStream("/Users/Pradeep/Desktop/notes/"+filename);

    for(Reminder reminder: reminderList) {
      writter.println(reminder);
    }

    writter.close();

  }





  public void showList(){

    for(Reminder reminder: reminderList){
      System.out.println(reminder.toString());
    }

  }













  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Reminder{" +
            "id=" + id +
            ", note='" + note + '\'' +
            ", time=" + time +
            '}';
  }
}
