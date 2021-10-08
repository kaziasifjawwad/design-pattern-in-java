package facade.problem;

public class FacadeProblemMain {
    public static void main(String[] args) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("170.1.0.2");
        AuthToken authToken =server.authenticate("appId", "key");
        Message message= new Message("Hello world");
        server.send(authToken,message.getContent(),"202.145.6.9");

    }
}
