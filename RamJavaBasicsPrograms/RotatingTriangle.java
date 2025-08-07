package RamJavaBasicsPrograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotatingTriangle extends JPanel implements ActionListener {
    private Timer timer;
    private double angle = 0;

    public RotatingTriangle() {
        timer = new Timer(20, this); // refresh every 20 ms
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Smoother rendering
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g2.translate(w / 2, h / 2); // Move origin to center
        g2.rotate(Math.toRadians(angle)); // Rotate

        int size = 100;
        Polygon triangle = new Polygon();
        triangle.addPoint(0, -size);
        triangle.addPoint(-size, size);
        triangle.addPoint(size, size);

        g2.setColor(Color.BLUE);
        g2.fillPolygon(triangle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle += 2; // Rotate by 2 degrees
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new RotatingTriangle());
        frame.setVisible(true);
    }
}
