import java.awt.*;

public class Rectangle extends Shape{
    private float height;
    private float width;
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Color color, boolean isFilled, float height, float width, Point topLeft) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
        this.topLeft = topLeft;
        this.bottomRight = new Point(topLeft.getX() + width, topLeft.getY() + height);
    }

    //Constructor with bottomRight, kept for compatibility with shapes.txt
    public Rectangle(Color color, boolean isFilled, float height, float width, Point topLeft, Point bottomRight) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
        this.topLeft = topLeft;
        this.bottomRight = new Point(topLeft.getX() + width, topLeft.getY() + height);
    }
}
