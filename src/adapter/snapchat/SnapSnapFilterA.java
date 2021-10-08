package adapter.snapchat;

public class SnapSnapFilterA implements SnapFilter {



    @Override
    public void normalization() {
        System.out.println("normalization done on filter A");
        this.apply();
    }

    @Override
    public void apply() {
        System.out.println("Successfully applied filter A");
    }
}
