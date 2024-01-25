package abstractClassesDemo.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import abstractClassesDemo.shapes.*;

@SuppressWarnings("serial")
public class ShapeCanvasGUI extends JFrame {

    ArrayList<ClosedShape> shapes;

    public ShapeCanvasGUI() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Canvas());

        // add shapes
        shapes = new ArrayList<ClosedShape>();
        shapes.add(new Rectangle(100, 50, 150, 200, Color.RED));
        shapes.add(new Rectangle(50, 75, 100, 125, Color.GREEN));
        
        Square square = new Square(35, 80, 200, Color.ORANGE);
        square.setWidth(175);
        shapes.add(square);
        
        shapes.add(new Circle(50, 95, 30, Color.BLUE));

        this.setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the stroke width to 8 pixels
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(8));

            // Draw a rectangle
            for (ClosedShape shape : shapes) {
                shape.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        new ShapeCanvasGUI();
    }
}
