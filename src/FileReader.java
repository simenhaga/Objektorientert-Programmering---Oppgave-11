import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Shape> getShapesFromFile(String filePath){
        ArrayList<Shape> shapes = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                Shape shape;
                if (scanner.hasNext("Circle")) {
                    //Construct circle
                    float radius = Float.parseFloat(scanner.nextLine());
                    int r = Integer.parseInt(scanner.nextLine());
                    int g = Integer.parseInt(scanner.nextLine());
                    int b = Integer.parseInt(scanner.nextLine());
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point center = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));

                    shape = new Circle(new Color(r, g, b), isFilled, radius, center);
                    shapes.add(shape);

                } else if (scanner.hasNext("Rectangle")) {
                    //Construct rectangle
                    float height = Float.parseFloat(scanner.nextLine());
                    float width = Float.parseFloat(scanner.nextLine());
                    int r = Integer.parseInt(scanner.nextLine());
                    int g = Integer.parseInt(scanner.nextLine());
                    int b = Integer.parseInt(scanner.nextLine());
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point topLeft = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));
                    Point bottomRight = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));

                    shape = new Rectangle(new Color(r, g, b), isFilled, height, width, topLeft, bottomRight);
                    shapes.add(shape);

                } else if (scanner.hasNext("Square")) {
                    //Construct square
                    float side = Float.parseFloat(scanner.nextLine());
                    int r = Integer.parseInt(scanner.nextLine());
                    int g = Integer.parseInt(scanner.nextLine());
                    int b = Integer.parseInt(scanner.nextLine());
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point topLeft = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));
                    Point bottomRight = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));

                    shape = new Square(new Color(r, g, b), isFilled, side, topLeft, bottomRight);
                    shapes.add(shape);

                }else {
                    scanner.nextLine();
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return shapes;
    }
}
