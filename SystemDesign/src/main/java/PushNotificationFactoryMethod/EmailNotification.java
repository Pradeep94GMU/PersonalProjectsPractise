package PushNotificationFactoryMethod;

public class EmailNotification implements Notification{


    @Override
    public void send(String message) {
        System.out.println("This is important Email: "+message);
    }
}
