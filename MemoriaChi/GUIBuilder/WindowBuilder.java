import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class WindowBuilder {
  public static void main(String[] args) {

    JFrame frame = new JFrame("X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(975, 750);
    frame.setResizable(false);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JButton btn_r = new JButton("Reiniciar");
    btn_r.setBounds(342, 660, 100, 29);
    btn_r.setBackground(Color.decode("#2e2e2e"));
    btn_r.setForeground(Color.decode("#D9D9D9"));
    btn_r.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_r.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_r.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_r, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_r);

    JButton btn_p = new JButton("Pausa");
    btn_p.setBounds(573, 660, 100, 29);
    btn_p.setBackground(Color.decode("#2e2e2e"));
    btn_p.setForeground(Color.decode("#D9D9D9"));
    btn_p.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_p.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_p.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_p, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_p);

    JButton btn_m1 = new JButton("");
    btn_m1.setBounds(80, 20, 160, 192);
    btn_m1.setBackground(Color.decode("#2e2e2e"));
    btn_m1.setForeground(Color.decode("#D9D9D9"));
    btn_m1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m1.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m1.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m1, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m1);

    JButton btn_m2 = new JButton("");
    btn_m2.setBounds(296, 20, 160, 192);
    btn_m2.setBackground(Color.decode("#2e2e2e"));
    btn_m2.setForeground(Color.decode("#D9D9D9"));
    btn_m2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m2.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m2.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m2, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m2);

    JButton btn_m3 = new JButton("");
    btn_m3.setBounds(512, 20, 160, 192);
    btn_m3.setBackground(Color.decode("#2e2e2e"));
    btn_m3.setForeground(Color.decode("#D9D9D9"));
    btn_m3.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m3.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m3.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m3, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m3);

    JButton btn_m4 = new JButton("");
    btn_m4.setBounds(728, 20, 160, 192);
    btn_m4.setBackground(Color.decode("#2e2e2e"));
    btn_m4.setForeground(Color.decode("#D9D9D9"));
    btn_m4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m4.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m4.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m4, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m4);

    JButton btn_m5 = new JButton("");
    btn_m5.setBounds(80, 237, 160, 192);
    btn_m5.setBackground(Color.decode("#2e2e2e"));
    btn_m5.setForeground(Color.decode("#D9D9D9"));
    btn_m5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m5.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m5.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m5, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m5);

    JButton btn_m6 = new JButton("");
    btn_m6.setBounds(296, 237, 160, 192);
    btn_m6.setBackground(Color.decode("#2e2e2e"));
    btn_m6.setForeground(Color.decode("#D9D9D9"));
    btn_m6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_m6.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_m6.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_m6, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_m6);

    JButton element9 = new JButton("");
    element9.setBounds(512, 237, 160, 192);
    element9.setBackground(Color.decode("#2e2e2e"));
    element9.setForeground(Color.decode("#D9D9D9"));
    element9.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element9.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element9.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element9, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element9);

    JButton element10 = new JButton("");
    element10.setBounds(728, 237, 160, 192);
    element10.setBackground(Color.decode("#2e2e2e"));
    element10.setForeground(Color.decode("#D9D9D9"));
    element10.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element10.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element10.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element10, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element10);

    JButton element11 = new JButton("");
    element11.setBounds(80, 454, 160, 192);
    element11.setBackground(Color.decode("#2e2e2e"));
    element11.setForeground(Color.decode("#D9D9D9"));
    element11.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element11.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element11.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element11, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element11);

    JButton element12 = new JButton("");
    element12.setBounds(296, 454, 160, 192);
    element12.setBackground(Color.decode("#2e2e2e"));
    element12.setForeground(Color.decode("#D9D9D9"));
    element12.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element12.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element12.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element12, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element12);

    JButton element13 = new JButton("");
    element13.setBounds(512, 454, 160, 192);
    element13.setBackground(Color.decode("#2e2e2e"));
    element13.setForeground(Color.decode("#D9D9D9"));
    element13.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element13.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element13.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element13, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element13);

    JButton element14 = new JButton("");
    element14.setBounds(728, 454, 160, 192);
    element14.setBackground(Color.decode("#2e2e2e"));
    element14.setForeground(Color.decode("#D9D9D9"));
    element14.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    element14.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    element14.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(element14, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(element14);

    frame.add(panel);
    frame.setVisible(true);

  }
}