import java.awt.*;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(Color.GREEN, true, 13f, new Point(12, 3));
        Rectangle rectangle = new Rectangle(Color.BLUE, false, 3, 4, new Point(33, 44));
        Square square = new Square(Color.RED, true, 5.5f, new Point(12f, 5.5f));

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
