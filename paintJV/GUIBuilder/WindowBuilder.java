import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
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

        String[] currentTool = {"Pincel"};
        Color[] currentColor = {Color.BLACK};

        BufferedImage canvasImage = new BufferedImage(800, 700, BufferedImage.TYPE_INT_ARGB);
        Graphics2D canvasGraphics = canvasImage.createGraphics();
        canvasGraphics.setColor(Color.decode("#b7b7b7"));
        canvasGraphics.fillRect(0, 0, 800, 700);
        canvasGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(canvasImage, 0, 0, null);
            }
        };
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

        JButton brushBtn1 = new JButton("Pincel");
        brushBtn1.setBounds(10, 55, 145, 32);
        brushBtn1.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn1.setForeground(Color.decode("#ffffff"));
        brushBtn1.setBackground(Color.decode("#3d3d3d"));
        brushBtn1.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn1.setFocusPainted(false);
        brushBtn1.addActionListener(e -> currentTool[0] = "Pincel");
        toolbarPanel.add(brushBtn1);

        JButton brushBtn2 = new JButton("Borrador");
        brushBtn2.setBounds(10, 105, 145, 32);
        brushBtn2.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn2.setForeground(Color.decode("#ffffff"));
        brushBtn2.setBackground(Color.decode("#3d3d3d"));
        brushBtn2.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn2.setFocusPainted(false);
        brushBtn2.addActionListener(e -> currentTool[0] = "Borrador");
        toolbarPanel.add(brushBtn2);
        
        JButton brushBtn2_1 = new JButton("⟳");
        brushBtn2_1.setBounds(160,105,35,32);
        brushBtn2_1.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn2_1.setForeground(Color.decode("#ffffff"));
        brushBtn2_1.setBackground(Color.decode("#3d3d3d"));
        brushBtn2_1.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn2_1.setFocusPainted(false);
        toolbarPanel.add(brushBtn2_1);


        JButton brushBtn3 = new JButton("Rectangulo");
        brushBtn3.setBounds(10, 155, 90, 32);
        brushBtn3.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn3.setForeground(Color.decode("#ffffff"));
        brushBtn3.setBackground(Color.decode("#3d3d3d"));
        brushBtn3.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn3.setFocusPainted(false);
        toolbarPanel.add(brushBtn3);

        JButton brushBtn4 = new JButton("Circulo");
        brushBtn4.setBounds(10, 205, 90, 32);
        brushBtn4.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn4.setForeground(Color.decode("#ffffff"));
        brushBtn4.setBackground(Color.decode("#3d3d3d"));
        brushBtn4.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn4.setFocusPainted(false);
        toolbarPanel.add(brushBtn4);

        JButton brushBtn5 = new JButton("Triangulo");
        brushBtn5.setBounds(105, 155, 90, 32);
        brushBtn5.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn5.setForeground(Color.decode("#ffffff"));
        brushBtn5.setBackground(Color.decode("#3d3d3d"));
        brushBtn5.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn5.setFocusPainted(false);
        toolbarPanel.add(brushBtn5);

        JButton brushBtn6 = new JButton("Linea");
        brushBtn6.setBounds(105, 205, 90, 32);
        brushBtn6.setFont(new Font("Arial", Font.PLAIN, 11));
        brushBtn6.setForeground(Color.decode("#ffffff"));
        brushBtn6.setBackground(Color.decode("#3d3d3d"));
        brushBtn6.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        brushBtn6.setFocusPainted(false);
        toolbarPanel.add(brushBtn6);

        JLabel colorTitle = new JLabel("COLORES");
        colorTitle.setFont(new Font("Arial", Font.BOLD, 12));
        colorTitle.setForeground(Color.decode("#888888"));
        colorTitle.setBounds(10, 345, 180, 20);
        toolbarPanel.add(colorTitle);

        JButton colorBtn1 = new JButton();
        colorBtn1.setBackground(Color.WHITE);
        colorBtn1.setBounds(10, 375, 25, 25);
        colorBtn1.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn1.setFocusPainted(false);
        colorBtn1.addActionListener(e -> currentColor[0] = Color.WHITE);
        toolbarPanel.add(colorBtn1);

        JButton colorBtn2 = new JButton();
        colorBtn2.setBackground(Color.black);
        colorBtn2.setBounds(10, 410, 25, 25);
        colorBtn2.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn2.setFocusPainted(false);
        colorBtn2.addActionListener(e -> currentColor[0] = Color.BLACK);
        toolbarPanel.add(colorBtn2);

        JButton colorBtn3 = new JButton();
        colorBtn3.setBackground(Color.gray);
        colorBtn3.setBounds(10, 445, 25, 25);
        colorBtn3.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn3.setFocusPainted(false);
        colorBtn3.addActionListener(e -> currentColor[0] = Color.GRAY);
        toolbarPanel.add(colorBtn3);

        JButton colorBtn4 = new JButton();
        colorBtn4.setBackground(Color.BLUE);
        colorBtn4.setBounds(10, 480, 25, 25);
        colorBtn4.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn4.setFocusPainted(false);
        colorBtn4.addActionListener(e -> currentColor[0] = Color.BLUE);
        toolbarPanel.add(colorBtn4);

        JButton colorBtn5 = new JButton();
        colorBtn5.setBackground(Color.red);
        colorBtn5.setBounds(10, 515, 25, 25);
        colorBtn5.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn5.setFocusPainted(false);
        colorBtn5.addActionListener(e -> currentColor[0] = Color.RED);
        toolbarPanel.add(colorBtn5);

        JButton colorBtn6 = new JButton();
        colorBtn6.setBackground(Color.green);
        colorBtn6.setBounds(10, 550, 25, 25);
        colorBtn6.setBorder(BorderFactory.createLineBorder(Color.decode("#555555"), 1));
        colorBtn6.setFocusPainted(false);
        colorBtn6.addActionListener(e -> currentColor[0] = Color.GREEN);
        toolbarPanel.add(colorBtn6);

        JLabel thicknessTitle = new JLabel("GROSOR");
        thicknessTitle.setFont(new Font("Arial", Font.BOLD, 12));
        thicknessTitle.setForeground(Color.decode("#888888"));
        thicknessTitle.setBounds(10, 585, 180, 20);
        toolbarPanel.add(thicknessTitle);

        JSlider thicknessSlider = new JSlider(1, 50, 5);
        thicknessSlider.setBounds(10, 610, 180, 40);
        thicknessSlider.setBackground(Color.decode("#252525"));
        thicknessSlider.setForeground(Color.WHITE);
        toolbarPanel.add(thicknessSlider);

        int[] lastX = {-1};
        int[] lastY = {-1};

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastX[0] = e.getX();
                lastY[0] = e.getY();
            }
        });

        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if (currentTool[0].equals("Pincel")) {
                    canvasGraphics.setColor(currentColor[0]);
                } else if (currentTool[0].equals("Borrador")) {
                    canvasGraphics.setColor(Color.decode("#b7b7b7")); // Usa el color del fondo
                }

                canvasGraphics.setStroke(new BasicStroke(thicknessSlider.getValue(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                canvasGraphics.drawLine(lastX[0], lastY[0], x, y);

                lastX[0] = x;
                lastY[0] = y;

                drawingPanel.repaint();
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);

    }
}