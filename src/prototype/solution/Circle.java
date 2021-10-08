package prototype.solution;

public class Circle implements Component {

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


    public Component cloneObject(){
        return  new Circle(getRadius());
    }

    @Override
    public void render() {
        System.out.println("Rendering a circle");
    }

}
