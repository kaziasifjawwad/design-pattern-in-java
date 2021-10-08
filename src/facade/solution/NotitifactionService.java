package facade.solution;

public class NotitifactionService {
    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("170.1.0.2");
        AuthToken authToken =server.authenticate("appId", "key");
        Message messageObject= new Message(message);
        server.send(authToken,messageObject.getContent(),"202.145.6.9");
    }
}
