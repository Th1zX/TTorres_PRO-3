import helper_classes.*;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class WindowBuilder {
  public static Integer[] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};
  public static JButton[] botones = new JButton[12];
  public static int[] status = new int[12]; 
  public static int carta_1 = 0; 
  public static int carta_2 = 0; 
  public static void main(String[] args) {

    List<Integer> lista = Arrays.asList(cartas);
    Collections.shuffle(lista);


    JFrame frame = new JFrame("X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(970, 800);
    frame.setResizable(false);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel lblMovimientos = new JLabel("Movimientos: 0");
    lblMovimientos.setBounds(80, 10, 180, 25);
    lblMovimientos.setForeground(Color.decode("#D9D9D9"));
    lblMovimientos.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
    panel.add(lblMovimientos);

    JLabel lblPares = new JLabel("Pares encontrados: 0");
    lblPares.setBounds(300, 10, 220, 25);
    lblPares.setForeground(Color.decode("#D9D9D9"));
    lblPares.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
    panel.add(lblPares);

    JLabel lblSegundos = new JLabel("Segundos: 0");
    lblSegundos.setBounds(580, 10, 180, 25);
    lblSegundos.setForeground(Color.decode("#D9D9D9"));
    lblSegundos.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
    panel.add(lblSegundos);

    JButton btn_r = new JButton("Reiniciar");
    btn_r.setBounds(345, 700, 100, 29);
    btn_r.setBackground(Color.decode("#2e2e2e"));
    btn_r.setForeground(Color.decode("#D9D9D9"));
    btn_r.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_r.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_r.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_r, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_r);

    JButton btn_p = new JButton("Pausa");
    btn_p.setBounds(520, 700, 100, 29);
    btn_p.setBackground(Color.decode("#2e2e2e"));
    btn_p.setForeground(Color.decode("#D9D9D9"));
    btn_p.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_p.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_p.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_p, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_p);

    JButton btn_m1 = new JButton("");
    btn_m1.setBounds(80, 50, 160, 192);
    ImageIcon icon = new ImageIcon("src/as.png");
    Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m1.setIcon(new ImageIcon(image));
    btn_m1.setBackground(Color.decode("#2e2e2e"));
    btn_m1.setForeground(Color.decode("#D9D9D9"));
    btn_m1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m1.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m1.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m1, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m1);
    botones[0] = btn_m1;
    botones[0].addActionListener(e -> flip(0));

    JButton btn_m2 = new JButton("");
    btn_m2.setBounds(296, 50, 160, 192);
    ImageIcon icon2 = new ImageIcon("src/as.png");
    Image image2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m2.setIcon(new ImageIcon(image2));
    btn_m2.setBackground(Color.decode("#2e2e2e"));
    btn_m2.setForeground(Color.decode("#D9D9D9"));
    btn_m2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m2.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m2.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m2, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m2);
    botones[1] = btn_m2;
    botones[1].addActionListener(e -> flip(1));

    JButton btn_m3 = new JButton("");
    btn_m3.setBounds(512, 50, 160, 192);
    ImageIcon icon3 = new ImageIcon("src/as.png");
    Image image3 = icon3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m3.setIcon(new ImageIcon(image3));
    btn_m3.setBackground(Color.decode("#2e2e2e"));
    btn_m3.setForeground(Color.decode("#D9D9D9"));
    btn_m3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m3.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m3.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m3, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m3);
    botones[2] = btn_m3;
    botones[2].addActionListener(e -> flip(2));

    JButton btn_m4 = new JButton("");
    btn_m4.setBounds(728, 50, 160, 192);
    ImageIcon icon4 = new ImageIcon("src/as.png");
    Image image4 = icon4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m4.setIcon(new ImageIcon(image4));
    btn_m4.setBackground(Color.decode("#2e2e2e"));
    btn_m4.setForeground(Color.decode("#D9D9D9"));
    btn_m4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m4.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m4.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m4, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m4);
    botones[3] = btn_m4;
    botones[3].addActionListener(e -> flip(3));

    JButton btn_m5 = new JButton("");
    btn_m5.setBounds(80, 267, 160, 192);
    ImageIcon icon5 = new ImageIcon("src/as.png");
    Image image5 = icon5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m5.setIcon(new ImageIcon(image5));
    btn_m5.setBackground(Color.decode("#2e2e2e"));
    btn_m5.setForeground(Color.decode("#D9D9D9"));
    btn_m5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m5.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m5.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m5, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m5);
    botones[4] = btn_m5;
    botones[4].addActionListener(e -> flip(4));

    JButton btn_m6 = new JButton("");
    btn_m6.setBounds(296, 267, 160, 192);
    ImageIcon icon6 = new ImageIcon("src/as.png");
    Image image6 = icon6.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m6.setIcon(new ImageIcon(image6));
    btn_m6.setBackground(Color.decode("#2e2e2e"));
    btn_m6.setForeground(Color.decode("#D9D9D9"));
    btn_m6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m6.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m6.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m6, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m6);
    botones[5] = btn_m6;
    botones[5].addActionListener(e -> flip(5));

    JButton element9 = new JButton("");
    element9.setBounds(512, 267, 160, 192);
    ImageIcon icon7 = new ImageIcon("src/as.png");
    Image image7 = icon7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element9.setIcon(new ImageIcon(image7));
    element9.setBackground(Color.decode("#2e2e2e"));
    element9.setForeground(Color.decode("#D9D9D9"));
    element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element9.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element9, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element9);
    botones[6] = element9;
    botones[6].addActionListener(e -> flip(6));

    JButton element10 = new JButton("");
    element10.setBounds(728, 267, 160, 192);
    ImageIcon icon8 = new ImageIcon("src/as.png");
    Image image8 = icon8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element10.setIcon(new ImageIcon(image8));
    element10.setBackground(Color.decode("#2e2e2e"));
    element10.setForeground(Color.decode("#D9D9D9"));
    element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element10.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element10, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element10);
    botones[7] = element10;
    botones[7].addActionListener(e -> flip(7));

    JButton element11 = new JButton("");
    element11.setBounds(80, 484, 160, 192);
    ImageIcon icon9 = new ImageIcon("src/as.png");
    Image image9 = icon9.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element11.setIcon(new ImageIcon(image9));
    element11.setBackground(Color.decode("#2e2e2e"));
    element11.setForeground(Color.decode("#D9D9D9"));
    element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element11.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element11, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element11);
    botones[8] = element11;
    botones[8].addActionListener(e -> flip(8));

    JButton element12 = new JButton("");
    element12.setBounds(296, 484, 160, 192);
    ImageIcon icon10 = new ImageIcon("src/as.png");
    Image image10 = icon10.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element12.setIcon(new ImageIcon(image10));
    element12.setBackground(Color.decode("#2e2e2e"));
    element12.setForeground(Color.decode("#D9D9D9"));
    element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element12.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element12.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element12, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element12);
    botones[9] = element12;
    botones[9].addActionListener(e -> flip(9));

    JButton element13 = new JButton("");
    element13.setBounds(512, 484, 160, 192);
    ImageIcon icon11 = new ImageIcon("src/as.png");
    Image image11 = icon11.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element13.setIcon(new ImageIcon(image11));
    element13.setBackground(Color.decode("#2e2e2e"));
    element13.setForeground(Color.decode("#D9D9D9"));
    element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element13.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element13.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element13, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element13);
    botones[10] = element13;
    botones[10].addActionListener(e -> flip(10));

    JButton element14 = new JButton("");
    element14.setBounds(728, 484, 160, 192);
    ImageIcon icon12 = new ImageIcon("src/as.png");
    Image image12 = icon12.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    element14.setIcon(new ImageIcon(image12));
    element14.setBackground(Color.decode("#2e2e2e"));
    element14.setForeground(Color.decode("#D9D9D9"));
    element14.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element14.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element14.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element14, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element14);
    botones[11] = element14;
    botones[11].addActionListener(e -> flip(11));

    frame.add(panel);
    frame.setVisible(true);

  }
  public static void flip(Integer n) {
    if (n >= 0 && n < 12 && status[n] == 0) {

      ImageIcon icon = new ImageIcon("src/memoriaback/" + cartas[n] + ".png");
      Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
      botones[n].setIcon(new ImageIcon(image));
      status[n] = 1;

      if (carta_1 == 0) {
        carta_1 = n;
      } else if (carta_2 == 0) {
        carta_2 = n;
        if (cartas[carta_1].equals(cartas[carta_2])) {
          System.out.println("gud");
          carta_1 = 0;
          carta_2 = 0;
        } else {

          flipBack(carta_1);
          flipBack(carta_2);
          carta_1 = 0;
          carta_2 = 0;
        }
      }
    }
  }

  public static void flipBack(int n) {
    ImageIcon icon = new ImageIcon("src/as.png");
    Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    botones[n].setIcon(new ImageIcon(image));
    status[n] = 0;
  }
}