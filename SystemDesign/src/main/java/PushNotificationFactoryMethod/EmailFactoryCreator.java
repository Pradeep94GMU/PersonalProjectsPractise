package PushNotificationFactoryMethod;

public class EmailFactoryCreator extends NotificationCreatorFactory{


    @Override
    public Notification notificationCreator() {
        return new EmailNotification();
    }
}
