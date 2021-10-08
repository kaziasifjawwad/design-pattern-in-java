package observer;

public class FrontEnd {
    public static void main(String[] args) {
        Youtube channel = new Youtube();

        Users asif = new Users("Asif");
        Users arif = new Users("Arif");
        Users munaf = new Users("Munaf");

        channel.addUser(asif);
        channel.addUser(arif);
        channel.addUser(munaf);


        channel.addVideo("Introduction to OOP");

        munaf.unsubscribe(channel);

        System.out.println("**************************************");

        channel.addVideo("introduction to function");
    }
}
