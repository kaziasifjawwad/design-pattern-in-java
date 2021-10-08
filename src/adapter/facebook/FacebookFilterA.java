package adapter.facebook;

public class FacebookFilterA implements FacebookFilter{
    @Override
    public void apply() {
        System.out.println("Applied a random facebook filter B");
    }
}
