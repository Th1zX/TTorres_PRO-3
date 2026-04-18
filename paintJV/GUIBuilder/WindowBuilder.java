import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class WindowBuilder {
  public static void main(String[] args) {

    JFrame frame = new JFrame("X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 700);
    frame.setLocationRelativeTo(null);
    
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(null);
    mainPanel.setBackground(Color.decode("#1e1e1e"));

    JPanel drawingPanel = new JPanel();
    drawingPanel.setLayout(null);
    drawingPanel.setBackground(Color.decode("#b7b7b7"));
    drawingPanel.setBorder(BorderFactory.createLineBorder(Color.decode("#444444"), 1));
    drawingPanel.setBounds(0, 0, 800, 700);
    mainPanel.add(drawingPanel);

    JPanel toolbarPanel = new JPanel();
    toolbarPanel.setLayout(null);
    toolbarPanel.setBackground(Color.decode("#252525"));
    toolbarPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.decode("#444444")));
    toolbarPanel.setBounds(800, 0, 200, 700);
    mainPanel.add(toolbarPanel);

    JLabel toolsTitle = new JLabel("HERRAMIENTAS");
    toolsTitle.setFont(new Font("Arial", Font.BOLD, 12));
    toolsTitle.setForeground(Color.decode("#888888"));
    toolsTitle.setBounds(10, 15, 180, 20);
    toolbarPanel.add(toolsTitle);
    String[] brushes = {"Pincel", "Borrador", "Línea", "Círculo", "Rectángulo"};
    int yPos = 55;
    
    for (String brush : brushes) {
      JButton btn = new JButton(brush);
      btn.setBounds(10, yPos, 180, 35);
      btn.setFont(new Font("Arial", Font.PLAIN, 11));
      btn.setForeground(Color.decode("#ffffff"));
      btn.setBackground(Color.decode("#3d3d3d"));
      btn.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
      btn.setFocusPainted(false);
      toolbarPanel.add(btn);
      yPos += 50;
    }

    JLabel colorTitle = new JLabel("COLORES");
    colorTitle.setFont(new Font("Arial", Font.BOLD, 12));
    colorTitle.setForeground(Color.decode("#888888"));
    colorTitle.setBounds(10, 310, 180, 20);
    toolbarPanel.add(colorTitle);

    JButton colorBtn1 = new JButton();
    colorBtn1.setBackground(Color.WHITE);
    colorBtn1.setBounds(10, 340, 25, 25);
    colorBtn1.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn1.setFocusPainted(false);
    toolbarPanel.add(colorBtn1);

    JButton colorBtn2 = new JButton();
    colorBtn2.setBackground(Color.RED);
    colorBtn2.setBounds(10, 375, 25, 25);
    colorBtn2.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn2.setFocusPainted(false);
    toolbarPanel.add(colorBtn2);

    JButton colorBtn3 = new JButton();
    colorBtn3.setBackground(Color.decode("#00ff00"));
    colorBtn3.setBounds(10, 410, 25, 25);
    colorBtn3.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn3.setFocusPainted(false);
    toolbarPanel.add(colorBtn3);

    JButton colorBtn4 = new JButton();
    colorBtn4.setBackground(Color.BLUE);
    colorBtn4.setBounds(10, 445, 25, 25);
    colorBtn4.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn4.setFocusPainted(false);
    toolbarPanel.add(colorBtn4);

    JButton colorBtn5 = new JButton();
    colorBtn5.setBackground(Color.YELLOW);
    colorBtn5.setBounds(10, 480, 25, 25);
    colorBtn5.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn5.setFocusPainted(false);
    toolbarPanel.add(colorBtn5);

    JButton colorBtn6 = new JButton();
    colorBtn6.setBackground(Color.decode("#ff9900"));
    colorBtn6.setBounds(10, 515, 25, 25);
    colorBtn6.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
    colorBtn6.setFocusPainted(false);
    toolbarPanel.add(colorBtn6);
    
    frame.add(mainPanel);
    frame.setVisible(true);

  }
}