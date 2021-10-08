package prototype.problem;

public class PrototypeProblemMain {

    public static void main(String[] args) {

        Component circle = new Circle(10);

        Canvus canvus = new Canvus();

        circle.render();
        Component cloneCircle = canvus.clone(circle);
        cloneCircle.render();

    }
}
