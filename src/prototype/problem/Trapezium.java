package prototype.problem;

public class Trapezium implements Component{
    public int getBase_a() {
        return base_a;
    }

    public void setBase_a(int base_a) {
        this.base_a = base_a;
    }

    public int getBase_b() {
        return base_b;
    }

    public void setBase_b(int base_b) {
        this.base_b = base_b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int base_a,base_b,height;

    public Trapezium(int base_a, int base_b, int height) {
        this.base_a = base_a;
        this.base_b = base_b;
        this.height = height;
    }

    @Override
    public void render() {
        System.out.println("rendering a trapezium");
    }
}
