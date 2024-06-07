package PushNotificationFactoryMethod;

public class MainNotification {

    public static void main(String[] args) {
        NotificationCreatorFactory emailFactoryCreator = new EmailFactoryCreator();
        emailFactoryCreator.getNotify();


        NotificationCreatorFactory SMSFactoryCreator = new SmsConcreateFactory();
        SMSFactoryCreator.getNotify();



    }

}
