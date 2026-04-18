import helper_classes.*;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class WindowBuilder {
  public static Integer[] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};
  public static JButton[] btns = new JButton[12];
  public static int[] status = new int[12]; 
  public static int cont_mov;
  public static int cont_par;
  public static JLabel lblMovimientos;
  public static JLabel lblPares;
  public static Integer carta_1 = null; 
  public static Integer carta_2 = null; 
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

    lblMovimientos = new JLabel("Movimientos: "+cont_mov);
    lblMovimientos.setBounds(80, 10, 180, 25);
    lblMovimientos.setForeground(Color.decode("#D9D9D9"));
    lblMovimientos.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 16));
    panel.add(lblMovimientos);

    lblPares = new JLabel("Pares encontrados: "+cont_par);
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
    btn_r.addActionListener(e -> restart());

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
    btns[0] = btn_m1;
    btns[0].addActionListener(e -> flip(0));

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
    btns[1] = btn_m2;
    btns[1].addActionListener(e -> flip(1));

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
    btns[2] = btn_m3;
    btns[2].addActionListener(e -> flip(2));

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
    btns[3] = btn_m4;
    btns[3].addActionListener(e -> flip(3));

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
    btns[4] = btn_m5;
    btns[4].addActionListener(e -> flip(4));

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
    btns[5] = btn_m6;
    btns[5].addActionListener(e -> flip(5));

    JButton btn_m7 = new JButton("");
    btn_m7.setBounds(512, 267, 160, 192);
    ImageIcon icon7 = new ImageIcon("src/as.png");
    Image image7 = icon7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m7.setIcon(new ImageIcon(image7));
    btn_m7.setBackground(Color.decode("#2e2e2e"));
    btn_m7.setForeground(Color.decode("#D9D9D9"));
    btn_m7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m7.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m7.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m7, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m7);
    btns[6] = btn_m7;
    btns[6].addActionListener(e -> flip(6));

    JButton btn_m8 = new JButton("");
    btn_m8.setBounds(728, 267, 160, 192);
    ImageIcon icon8 = new ImageIcon("src/as.png");
    Image image8 = icon8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m8.setIcon(new ImageIcon(image8));
    btn_m8.setBackground(Color.decode("#2e2e2e"));
    btn_m8.setForeground(Color.decode("#D9D9D9"));
    btn_m8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m8.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m8.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m8, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m8);
    btns[7] = btn_m8;
    btns[7].addActionListener(e -> flip(7));

    JButton btn_m9 = new JButton("");
    btn_m9.setBounds(80, 484, 160, 192);
    ImageIcon icon9 = new ImageIcon("src/as.png");
    Image image9 = icon9.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m9.setIcon(new ImageIcon(image9));
    btn_m9.setBackground(Color.decode("#2e2e2e"));
    btn_m9.setForeground(Color.decode("#D9D9D9"));
    btn_m9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m9.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m9, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m9);
    btns[8] = btn_m9;
    btns[8].addActionListener(e -> flip(8));

    JButton btn_m10 = new JButton("");
    btn_m10.setBounds(296, 484, 160, 192);
    ImageIcon icon10 = new ImageIcon("src/as.png");
    Image image10 = icon10.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m10.setIcon(new ImageIcon(image10));
    btn_m10.setBackground(Color.decode("#2e2e2e"));
    btn_m10.setForeground(Color.decode("#D9D9D9"));
    btn_m10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m10.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m10, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m10);
    btns[9] = btn_m10;
    btns[9].addActionListener(e -> flip(9));

    JButton btn_m11 = new JButton("");
    btn_m11.setBounds(512, 484, 160, 192);
    ImageIcon icon11 = new ImageIcon("src/as.png");
    Image image11 = icon11.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_m11.setIcon(new ImageIcon(image11));
    btn_m11.setBackground(Color.decode("#2e2e2e"));
    btn_m11.setForeground(Color.decode("#D9D9D9"));
    btn_m11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m11.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m11, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m11);
    btns[10] = btn_m11;
    btns[10].addActionListener(e -> flip(10));

    JButton btn_12 = new JButton("");
    btn_12.setBounds(728, 484, 160, 192);
    ImageIcon icon12 = new ImageIcon("src/as.png");
    Image image12 = icon12.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btn_12.setIcon(new ImageIcon(image12));
    btn_12.setBackground(Color.decode("#2e2e2e"));
    btn_12.setForeground(Color.decode("#D9D9D9"));
    btn_12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_12.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_12.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_12, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_12);
    btns[11] = btn_12;
    btns[11].addActionListener(e -> flip(11));
    frame.add(panel);
    frame.setVisible(true);
  }
  public static void flip(Integer n) {
    if (n >= 0 && n < 12 && status[n] == 0) {

      ImageIcon icon = new ImageIcon("src/memoriaback/" + cartas[n] + ".png");
      Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
      btns[n].setIcon(new ImageIcon(image));
      status[n] = 1;
      cont_mov++;
      lblMovimientos.setText("Movimientos: "+cont_mov);
      if (carta_1 == null) {
        carta_1 = n;
      } else if (carta_2 == null) {
        carta_2 = n;
        if (cartas[carta_1].equals(cartas[carta_2])) {
          System.out.println("gud");
          carta_1 = null;
          carta_2 = null;
          cont_par++;
          lblPares.setText("Pares encontrados: "+cont_par);
          Win();
        } else {

          flipB(carta_1);
          flipB(carta_2);
          carta_1 = null;
          carta_2 = null;
        }
      }
    }
  }
  public static void Win() {
    for (int s : status) {
      if (s == 0) {
        return;
      }
    }
    JOptionPane.showMessageDialog(null, "GG","", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void restart() {
    Collections.shuffle(Arrays.asList(cartas));
    Arrays.fill(status, 0);
    cont_mov = 0;
    cont_par = 0;
    carta_1 = null;
    carta_2 = null;
    lblMovimientos.setText("Movimientos: " + cont_mov);
    lblPares.setText("Pares encontrados: " + cont_par);

    ImageIcon backIcon = new ImageIcon("src/as.png");
    Image backImage = backIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    Icon asIcon = new ImageIcon(backImage);

    for (JButton btn : btns) {
      if (btn != null) {
        btn.setIcon(asIcon);
        btn.setEnabled(true);
      }
    }
  }

  public static void flipB(int n) {
    ImageIcon icon = new ImageIcon("src/as.png");
    Image image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    btns[n].setIcon(new ImageIcon(image));
    status[n] = 0;
  }
}