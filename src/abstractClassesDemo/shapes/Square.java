package abstractClassesDemo.shapes;

import java.awt.Color;

public class Square extends Rectangle {
    
    private int sideLength;

    public Square(int x, int y, int sideLength, Color color) {
        super(x, y, sideLength, sideLength, color);
        
        this.sideLength = sideLength;
    }

    @Override
    public void setWidth(int width) {
        setSideLength(width);
    }
    
    @Override
    public void setHeight(int height) {
        setSideLength(height);
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
        super.setHeight(sideLength);
        super.setWidth(sideLength);
    }
}
