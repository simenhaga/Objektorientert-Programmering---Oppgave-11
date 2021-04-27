import java.awt.*;

public abstract class Shape {
    private Color color;
    private boolean isFilled;

    //Constructors, getters & setters

    public Shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    //Methods

    public void draw(){

    }
}
