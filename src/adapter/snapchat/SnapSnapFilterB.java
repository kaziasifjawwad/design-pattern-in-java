package adapter.snapchat;

public class SnapSnapFilterB implements SnapFilter {



    @Override
    public void normalization() {
        System.out.println("normalization done on filter B");
        this.apply();
    }

    @Override
    public void apply() {
        System.out.println("Successfully applied filter B");
    }
}
