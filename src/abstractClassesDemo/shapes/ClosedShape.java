package abstractClassesDemo.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class ClosedShape {
    private Color color;
    
    public ClosedShape(Color color) {
        this.color = color;
    }
    
    public abstract void draw(Graphics g);
    public abstract int getArea();
    public abstract int getPerimeter();

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
