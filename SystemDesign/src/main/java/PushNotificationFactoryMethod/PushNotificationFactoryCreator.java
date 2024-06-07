package PushNotificationFactoryMethod;

public class PushNotificationFactoryCreator extends NotificationCreatorFactory{

    @Override
    public Notification notificationCreator() {
        return new PushNotication();
    }
}
