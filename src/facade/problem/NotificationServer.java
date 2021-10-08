package facade.problem;

public class NotificationServer {

    //connect() --> connection
    // authenticate(appID, key) --> authToken
    //send(authToken , message, target) -->
    //conn.disconnect()

    public Connection connect(String idAddress){
        return  new Connection();
    }

    public AuthToken authenticate(String appId, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken,String message , String target){
        System.out.println("Sending a message");
    }
}
