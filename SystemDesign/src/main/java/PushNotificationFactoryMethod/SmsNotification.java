package PushNotificationFactoryMethod;

public class SmsNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("This is important SMS: "+message);
    }

}
