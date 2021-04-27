import java.awt.*;

public class Rectangle extends Shape{
    protected float height;
    protected float width;
    protected Point topLeft;
    protected Point bottomRight;

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

    @Override
    public String toString() {
        String result = String.format("Rectangle{%s, height: %f, width: %f, topLeft: %s, bottomRight: %s",
                super.toString(), this.height, this.width, topLeft.toString(), bottomRight.toString());
        return result;
    }
}
