import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class windGraph {

    public static void main(String[] args) throws IOException {
        JFrame frame = buildFrame();
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawLine(0,0,1000,700);
                g2d.setColor(Color.decode("#800000"));

                g2d.drawOval(100, 100, 150, 50);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawPolygon(new int[] {300,100,500}, new int [] {100,300,300},3);

                g2d.drawRect(250,300,100,100);
                g2d.drawRoundRect(500,150,100,100,1,1);

                g2d.drawArc(400,100,100,100,0,90);
                g2d.setFont(new Font("Arial",Font.BOLD,22));

                g2d.drawString("Hola N ", 100, 100);
                g2d.fillOval(500, 50, 50, 50);

                g2d.fillPolygon(new int[] {500,300,700}, new int [] {300,500,500},3);
                g2d.fillRect(385,500,250,100);
                g2d.setColor(Color.decode("#ffe600"));
                g2d.fillRoundRect(500,500,100,100,10,10);
                g2d.fillArc(450,150,100,100,0,300);

                BufferedImage image;
                try {
                    image = ImageIO.read(new File("src/rn.jpeg"));
                    g2d.drawImage(image, 700, 0, null);

                } catch (Exception e) {

                    e.printStackTrace();
                }
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