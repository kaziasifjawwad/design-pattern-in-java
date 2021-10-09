package practice;

public class NotificationManager {

    public void execute(String content){
        Connection connection = Connection.connect();
        Authentication authentication = new Authentication();
        String authTockent = authentication.getAuthenticationToken(connection);
        NotificationServer server = NotificationServer.getNotificationServer(authentication);
        Message message = new Message(server);
        message.sendMessage(content);
    }
}
