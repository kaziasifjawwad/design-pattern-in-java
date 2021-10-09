package practice;

public class Connection {
    private Connection(){}

    private static Connection connection  = new Connection();

    public static Connection connect(){
        return new Connection();
    }
}
