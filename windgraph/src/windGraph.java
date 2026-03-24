import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class windGraph {

    public static void main(String[] args) {
        JFrame frame = buildFrame();
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.decode("#A0E0FF"));
                g2d.fillRect(0, 0, 1000, 700);

                g2d.setColor(Color.decode("#D2691E"));
                g2d.fillRect(0, 580, 1000, 120);
                g2d.setColor(Color.decode("#F4A460"));
                g2d.fillRect(0, 550, 1000, 30);
                
                g2d.setColor(Color.BLACK);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(0, 550, 1000, 550);
                g2d.drawLine(0, 580, 1000, 580);

                g2d.setColor(Color.decode("#228B22"));
                g2d.fillRect(40, 480, 90, 70);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(40, 480, 90, 70);

                g2d.setColor(Color.BLACK);
                g2d.fillRect(290, 270, 120, 280);
                g2d.setColor(Color.decode("#66B2FF"));
                g2d.fillRect(270, 250, 120, 300);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(270, 250, 120, 300);

                g2d.setColor(Color.BLACK);
                g2d.fillRect(190, 420, 120, 130);
                g2d.setColor(Color.decode("#FFB6C1"));
                g2d.fillRect(170, 400, 120, 150);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(170, 400, 120, 150);

                g2d.setColor(Color.BLACK);
                g2d.fillRect(550, 400, 80, 150);
                g2d.fillRect(540, 370, 100, 30);
                g2d.setColor(Color.decode("#00AA00"));
                g2d.fillRect(550, 400, 80, 150);
                g2d.fillRect(540, 370, 100, 30);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(550, 400, 80, 150);
                g2d.drawRect(540, 370, 100, 30);

                g2d.setColor(Color.BLACK);
                g2d.fillRect(840, 420, 150, 130);
                g2d.setColor(Color.decode("#00CC66"));
                g2d.fillRect(820, 400, 150, 150);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(820, 400, 150, 150);

                g2d.setColor(Color.decode("#FF9966"));
                g2d.fillRect(150, 100, 50, 50);
                g2d.fillRect(200, 100, 50, 50);
                g2d.fillRect(50, 300, 50, 50);
                g2d.fillRect(820, 300, 50, 50);
                
                g2d.setColor(Color.BLACK);
                g2d.drawRect(150, 100, 50, 50);
                g2d.drawRect(200, 100, 50, 50);
                g2d.drawRect(50, 300, 50, 50);
                g2d.drawRect(820, 300, 50, 50);
            }
        };

        frame.add(pane);
    }

    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setVisible(true);
        return frame;
    }
}