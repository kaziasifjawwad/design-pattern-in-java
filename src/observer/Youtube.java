package observer;

import java.util.ArrayList;
import java.util.List;

public class Youtube {
    private List<Users> usersList;
    private List<String> videoList;

    public Youtube(){
        this.usersList = new ArrayList<>();
        this.videoList = new ArrayList<>();
    }


    public void addUser(Users user){
        usersList.add(user);

    }

    public void removeUser(Users user){
        usersList.remove(user);
    }

    public void pushNotification(String name){
        for(Users user: usersList){
            user.update("new Video updated , video name : " + name);
        }
    }

    public void addVideo(String videoName){
        videoList.add(videoName);
        pushNotification(videoName);
    }

}
