import java.awt.*;

public class Square extends Rectangle{

    public Square(Color color, boolean isFilled, float side, Point topLeft) {
        super(color, isFilled, side, side, topLeft);
    }

    //Constructor with bottomRight, kept for compatibility with shapes.txt
    public Square(Color color, boolean isFilled, float side, Point topLeft, Point bottomRight) {
        super(color, isFilled, side, side, topLeft);
    }

    @Override
    public String toString() {
        String result = String.format("side: %.2f, topLeft: %s, bottomRight: %s", this.height, topLeft.toString(), bottomRight.toString());
        return result;
    }
}
