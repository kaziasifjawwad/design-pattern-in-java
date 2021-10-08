package adapter.facebook;


public class ImageStorage {

    public void store(String image, FacebookFilter filter){
        filter.apply();
        System.out.println(image + " Stored");
    }
}
