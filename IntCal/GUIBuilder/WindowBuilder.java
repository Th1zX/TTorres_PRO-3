import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class WindowBuilder {
  public static void main(String[] args) {
    JFrame frame = new JFrame("X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1258, 680);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel title_ = new JLabel("Interes");
    title_.setBounds(50, 2, 625, 60);
    title_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 45));
    title_.setForeground(Color.decode("#D9D9D9"));
    panel.add(title_);

    JLabel subt_ = new JLabel("Calcular Interes", SwingConstants.LEFT);
    subt_.setVerticalAlignment(SwingConstants.TOP);
    subt_.setBorder(BorderFactory.createLineBorder(Color.decode("#09ff00")));
    subt_.setBounds(115, 85, 495, 400);
    subt_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
    subt_.setForeground(Color.decode("#D9D9D9"));
    panel.add(subt_);

    JLabel cap_ = new JLabel("Capital:");
    cap_.setBounds(265, 165, 75, 25);
    cap_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    cap_.setForeground(Color.decode("#D9D9D9"));
    panel.add(cap_);

    JLabel time_ = new JLabel("Tiempo:");
    time_.setBounds(265, 220, 75, 25);
    time_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    time_.setForeground(Color.decode("#D9D9D9"));
    panel.add(time_);

    JLabel tasaI_ = new JLabel("Tasa de Interes:");
    tasaI_.setBounds(190, 275, 150, 20);
    tasaI_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    tasaI_.setForeground(Color.decode("#D9D9D9"));
    panel.add(tasaI_);

    JButton btn_cal = new JButton("Calcular");
    btn_cal.setBounds(170, 355, 105, 30);
    btn_cal.setBackground(Color.decode("#069701"));
    btn_cal.setForeground(Color.decode("#D9D9D9"));
    btn_cal.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 15));
    btn_cal.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_cal.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_cal, Color.decode("#232323"), Color.decode("#069701"));
    panel.add(btn_cal);

    JButton btn_del = new JButton("Cancelar");
    btn_del.setBounds(345, 355, 105, 30);
    btn_del.setBackground(Color.decode("#960000"));
    btn_del.setForeground(Color.decode("#D9D9D9"));
    btn_del.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 15));
    btn_del.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_del.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_del, Color.decode("#232323"), Color.decode("#960000"));
    panel.add(btn_del);

    JTextField inp_tasaI = new JTextField("");
    inp_tasaI.setBounds(345, 275, 165, 24);
    inp_tasaI.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    inp_tasaI.setBackground(Color.decode("#B2B2B2"));
    inp_tasaI.setForeground(Color.decode("#656565"));
    inp_tasaI.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(inp_tasaI, "", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(inp_tasaI);

    JTextField inp_time = new JTextField("");
    inp_time.setBounds(345, 220, 165, 24);
    inp_time.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    inp_time.setBackground(Color.decode("#B2B2B2"));
    inp_time.setForeground(Color.decode("#656565"));
    inp_time.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(inp_time, "", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(inp_time);

    JTextField inp_cap = new JTextField("");
    inp_cap.setBounds(345, 165, 165, 24);
    inp_cap.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    inp_cap.setBackground(Color.decode("#B2B2B2"));
    inp_cap.setForeground(Color.decode("#656565"));
    inp_cap.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(inp_cap, "", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(inp_cap);

    JLabel subt_rstl = new JLabel("Resultados", SwingConstants.LEFT);
    subt_rstl.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
    subt_rstl.setVerticalAlignment(SwingConstants.TOP);
    subt_rstl.setBounds(685, 85, 495, 400);
    subt_rstl.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
    subt_rstl.setForeground(Color.decode("#D9D9D9"));
    panel.add(subt_rstl);

    JLabel inPagar_ = new JLabel("Interes a pagar:");
    inPagar_.setBounds(705, 165, 150, 25);
    inPagar_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    inPagar_.setForeground(Color.decode("#D9D9D9"));
    panel.add(inPagar_);

    JTextField resulPagar_ = new JTextField("");
    resulPagar_.setBounds(740, 200, 325, 21);
    resulPagar_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    resulPagar_.setBackground(Color.decode("#B2B2B2"));
    resulPagar_.setForeground(Color.decode("#656565"));
    resulPagar_.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(resulPagar_, "", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(resulPagar_);

    JLabel monto_ = new JLabel("Monto:");
    monto_.setBounds(705, 265, 75, 20);
    monto_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    monto_.setForeground(Color.decode("#D9D9D9"));
    panel.add(monto_);

    JTextField resulMonto_ = new JTextField("");
    resulMonto_.setBounds(740, 300, 325, 21);
    resulMonto_.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    resulMonto_.setBackground(Color.decode("#B2B2B2"));
    resulMonto_.setForeground(Color.decode("#656565"));
    resulMonto_.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(resulMonto_, "", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(resulMonto_);

    frame.add(panel);
    frame.repaint();
    frame.setVisible(true);

  }
}