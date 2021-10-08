package adapter.facebook;

import adapter.snapchat.SnapFilter;
import adapter.snapchat.SnapSnapFilterA;

public class Main {
    public static void main(String[] args) {
        FacebookFilter filter = new FacebookFilterA();
        String imageName = "Image A";

        FacebookFilter filter1 = new Socket(
                new SnapSnapFilterA()
        );
        ImageStorage storage = new ImageStorage();

        storage.store(imageName,filter1);
    }
}
