package facade.solution;

public class FacadeProblemMain {
    public static void main(String args[]) {
        NotitifactionService service = new NotitifactionService();
        service.send("hello people", "172.168.9.6");
    }
}
