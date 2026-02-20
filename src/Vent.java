import java.awt.*;
import javax.swing.*;

public class Vent extends JFrame{

    public Vent() {
        this.setTitle("X");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null); 
        this.setVisible(true);
        this.setIconImage(new ImageIcon("src/changopedo.jpg").getImage());
        
        JLabel tag_title = new JLabel();

        tag_title.setText("X");
        tag_title.setSize(500,500);
        tag_title.setLocation(0,0);
        tag_title.setBackground(Color.black);
        tag_title.setOpaque(true);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setFont(new Font("Arial",Font.BOLD,30));

        this.add(tag_title);
    }

    public static void main(String[] args) {
        new Vent();
    }
}
