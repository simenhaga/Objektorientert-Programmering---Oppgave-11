import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Shape> getShapesFromFile(String filePath){
        ArrayList<Shape> shapes = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                Shape shape = null;
                if (scanner.hasNext("Circle")) {
                    scanner.nextLine();
                    //Construct circle
                    float radius = Float.parseFloat(scanner.nextLine());
                    Color color = parseColor(scanner);
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point center = new Point(Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));

                    shape = new Circle(color, isFilled, radius, center);

                } else if (scanner.hasNext("Rectangle")) {
                    scanner.nextLine();
                    //Construct rectangle
                    float height = Float.parseFloat(scanner.nextLine());
                    float width = Float.parseFloat(scanner.nextLine());
                    Color color = parseColor(scanner);
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point topLeft = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));
                    Point bottomRight = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));

                    shape = new Rectangle(color, isFilled, height, width, topLeft, bottomRight);

                } else if (scanner.hasNext("Square")) {
                    scanner.nextLine();

                    //Construct square
                    float side = Float.parseFloat(scanner.nextLine());
                    Color color = parseColor(scanner);
                    boolean isFilled = Boolean.parseBoolean(scanner.nextLine());
                    Point topLeft = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));
                    Point bottomRight = new Point(Float.parseFloat(scanner.nextLine()),
                            Float.parseFloat(scanner.nextLine()));

                    shape = new Square(color, isFilled, side, topLeft, bottomRight);

                }else {
                    scanner.nextLine();
                }
                if (shape != null){
                    shapes.add(shape);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return shapes;
    }

    private static Color parseColor(Scanner scanner){
        int r = Integer.parseInt(scanner.nextLine());
        int g = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        return new Color(r, g, b);
    }
}
