import java.util.ArrayList;

public class ShapeStorage {
    private ArrayList<Shape> shapes;

    public ShapeStorage(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void drawAllShapes(){
        for (Shape shape : shapes){
            shape.draw();
        }
    }
    public void getSumAreaOfSquares() {
        float totalArea = 0;
        for (Shape shape : shapes) {
            if (shape.getClass() == Square.class) {
                Square square = (Square) shape;
                float area = square.height * square.width;
                totalArea += area;
            }
        }
        String result = String.format("Area of all squares is: %.2f", totalArea);
        System.out.println(result);
    }
}
