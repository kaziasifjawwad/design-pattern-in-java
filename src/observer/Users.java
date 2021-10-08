package observer;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public List<Youtube> channels;
    public String name;

    public Users(String name){
        this.name=name;
        this.channels = new ArrayList<>();
    }

    public void subscripbe(Youtube temp){
        channels.add(temp);
        temp.addUser(this);
    }

    public void unsubscribe(Youtube temp){
        this.channels.remove(temp);
        temp.removeUser(this);
    }

    public void update(String notification){
        System.out.println("Hey "+this.name+"\t"+ notification);
    }
    
}
