package prototype.problem;

public class Canvus {

    public Component clone(Component component){

        Component clone= null;

        if(component instanceof Circle){
            int radius = ((Circle) component).getRadius();
            clone = new Circle(radius);
        }
        else if(component instanceof Trapezium){
            int base_a=((Trapezium) component).getBase_a();
            int base_b = ((Trapezium) component).getBase_b();
            int height=((Trapezium) component).getHeight();

            clone = new Trapezium(base_a,base_b,height);
        }

        return clone;
    }
}
