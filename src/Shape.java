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
        String result = String.format("%s{%s, %s}", this.getClass().getName(), this.colorToString(), this);
        System.out.println(result);
    }

    public String colorToString() {
        String color = String.format("Color(R:%d, G:%d, B:%d)", this.color.getRed(), this.color.getGreen(), this.color.getBlue());
        return String.format("Color: %s, isFilled: %s", color, isFilled);
    }
}
