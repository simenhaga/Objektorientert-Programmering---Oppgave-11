import java.awt.*;

public abstract class shape {
    private Color color;
    private boolean isFilled;

    //Constructors, getters & setters

    public shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    //Methods

    public void draw(){

    }
}
