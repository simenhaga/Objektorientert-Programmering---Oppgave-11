import java.awt.*;

public class circle extends shape{
    private float radius;
    private Point center;

    public circle(Color color, boolean isFilled, float radius, Point center) {
        super(color, isFilled);
        this.radius = radius;
        this.center = center;
    }
}
