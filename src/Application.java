import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static ShapeStorage storage;

    public static void main(String[] args) {
        //testShapes();
        String filepath = "Shapes.txt";
        storage =  new ShapeStorage(FileReader.getShapesFromFile(filepath));
        runApplication();
    }

    private static void runApplication(){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("1: Draw all shapes \n2: Show combined area of squares \n3: Quit");
            if (scanner.hasNext("1")){
                scanner.next();
                storage.drawAllShapes();
            }
            else if (scanner.hasNext("2")){
                scanner.next();
                storage.getSumAreaOfSquares();
            }
            else if (scanner.hasNext("3")) {
                scanner.next();
                quit();
                quit = true;
            }
        } while (!quit);
    }

    private static void quit() {
        System.out.println("Goodbye!");
    }

    // Test helper methods
    private static void testShapes() {
        Circle circle = new Circle(Color.GREEN, true, 13f, new Point(12, 3));
        Rectangle rectangle = new Rectangle(Color.BLUE, false, 3, 4, new Point(33, 44));
        Square square = new Square(Color.RED, true, 5.5f, new Point(12f, 5.5f));

        circle.draw();
        rectangle.draw();
        square.draw();
    }

    private static void testFileReader(){
        ArrayList<Shape> shapes = FileReader.getShapesFromFile("shapes.txt");
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
