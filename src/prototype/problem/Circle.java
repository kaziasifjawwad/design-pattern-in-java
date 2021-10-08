package prototype.problem;

public class Circle implements Component{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

}
