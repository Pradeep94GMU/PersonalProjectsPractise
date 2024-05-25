package solidPrincipleDemo.singleRepo;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

      Reminder reminder = new Reminder();

      Reminder playCricket = new Reminder(101, "Play Cricket", LocalDateTime.of(2024,05,12, 12,10 ));
      Reminder sleepNote = new Reminder(102, "Sleep for 3 hours", LocalDateTime.of(2024,12,8, 12,30 ));

      reminder.addReminder(playCricket);
      reminder.addReminder(sleepNote);

      System.out.println("All Notes: ");
      reminder.showList();

      reminder.saveReminder("mondayReminder");

//        System.out.println("deleted this reminder");
//        reminder.deleteReminder(playCricket);



    }
}
