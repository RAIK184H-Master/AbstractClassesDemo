package abstractClassesDemo.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends ClosedShape {
    
    private int x;
    private int y;
    private int radius;
    
    public Circle(int x, int y, int radius, Color color) {
        super(color);
        
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        // change the color
        g.setColor(getColor());
        g.drawOval(x, y, 2 * radius, 2 * radius);
    }

    @Override
    public int getArea() {
        // intentionally not filling out because i haven't looked it up
        return 0;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
