package PushNotificationFactoryMethod;

public class SmsConcreateFactory extends NotificationCreatorFactory{


    @Override
    public Notification notificationCreator() {
        return new SmsNotification();
    }
}
