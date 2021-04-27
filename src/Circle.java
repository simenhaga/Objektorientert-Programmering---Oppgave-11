import java.awt.*;

public class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle(Color color, boolean isFilled, float radius, Point center) {
        super(color, isFilled);
        this.radius = radius;
        this.center = center;
    }
}
