package PushNotificationFactoryMethod;

public class PushNotication implements Notification{

    @Override
    public void send(String message) {
        System.out.println("This is important Push Notification: "+message);
    }

}
