package practice;

public class NotificationServer {
    private  NotificationServer(){}
    private static NotificationServer server;


    public static NotificationServer getNotificationServer(Authentication authentication){
        if(NotificationServer.server == null){
            NotificationServer.server = new NotificationServer();
        }
        return NotificationServer.server;
    }

    public void notification(String name){
        System.out.println("sending message "+ name);
    }

}
