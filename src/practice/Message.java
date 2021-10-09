package practice;
public class Message {

    private NotificationServer notificationServer;

    public Message(NotificationServer server){
        this.notificationServer = server;
    }

    public void sendMessage(String message){
        notificationServer.notification(message);
    }
}
