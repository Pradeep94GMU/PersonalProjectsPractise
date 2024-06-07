package PushNotificationFactoryMethod;

public abstract class NotificationCreatorFactory {

    public abstract Notification notificationCreator();
    public void getNotify(){
        Notification notification = notificationCreator();
        notification.send("Money Sending success");
    }

}
