import java.awt.*;

public class Circle extends Shape{
    private float radius;
    private Point center;

    public Circle(Color color, boolean isFilled, float radius, Point center) {
        super(color, isFilled);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        String result = String.format("radius: %.2f, center: %s", this.radius, center.toString());
        return result;
    }
}
