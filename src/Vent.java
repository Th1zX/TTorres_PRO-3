import java.awt.*;
import javax.swing.*;

public class Vent extends JFrame{

    public Vent() {
        this.setTitle("X");
        this.setLayout(null);
        this.setMaximumSize(new Dimension(800,525));
        this.setMinimumSize(new Dimension(800,525));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setBackground(Color.white);
        this.setLocationRelativeTo(null); 

        JLabel tag_title = new JLabel();
        JTextField ent_user = new JTextField();
        JPasswordField ent_pass = new JPasswordField();
        JCheckBox rcd_userpass = new JCheckBox("Remember");
        JButton btn_login = new JButton("Log In");


        this.add(tag_title);
        tag_title.setText("Log In X");
        tag_title.setBounds(100, 50, 200, 50);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Arial",Font.BOLD,30));

        this.add(ent_user);
        ent_user.setText("Username");
        ent_user.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_user.setBackground(Color.gray);
        ent_user.setBounds(50, 150, 235, 30);
        ent_user.setFont(new Font("Arial",Font.PLAIN,20));

        this.add(ent_pass);
        ent_pass.setText("Password");
        ent_pass.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_pass.setBackground(Color.gray);
        ent_pass.setBounds(50, 215, 235, 30);
        ent_pass.setFont(new Font("Arial",Font.PLAIN,20));
        ent_pass.setEchoChar('·');

        this.add(rcd_userpass);
        rcd_userpass.setBounds(50, 250, 110, 25);
        rcd_userpass.setFont(new Font("Arial",Font.PLAIN,15));

        this.add(btn_login);
        btn_login.setBounds(115, 280, 110, 25);
        btn_login.setBackground(Color.DARK_GRAY);
        btn_login.setForeground(Color.white);
        btn_login.setFont(new Font("Arial",Font.PLAIN,15));

        //Jpanel
        JPanel rgs_cont = new JPanel();
        JLabel rgs_title = new JLabel("Registro");

        rgs_title.setForeground(Color.white);
        rgs_title.setFont(new Font("Arial",Font.BOLD,20));
        rgs_title.setBounds(25, 10, 200, 25);
        rgs_cont.add(rgs_title);
        
        this.add(rgs_cont);
        rgs_cont.setBounds(385,50,400,400);
        rgs_cont.setOpaque(true);
        rgs_cont.setBackground(Color.darkGray);
        rgs_cont.setLayout(null);
        
        JTextArea bio_txt = new JTextArea("X _ X");

        bio_txt.setBounds(25, 45, 350, 50);
        bio_txt.setOpaque(true);
        rgs_cont.add(bio_txt);

        JCheckBox opt_sweet = new JCheckBox("Dulce");
        opt_sweet.setBounds(25, 105, 100, 25);
        opt_sweet.setBackground(Color.darkGray);
        opt_sweet.setForeground(Color.WHITE);
        opt_sweet.setOpaque(true);
        rgs_cont.add(opt_sweet);
        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(25, 140, 100, 25);
        opt_salty.setOpaque(true);
        rgs_cont.add(opt_salty);
        JCheckBox opt_healty = new JCheckBox("Saludable");
        opt_healty.setBounds(25, 175, 100, 25);
        opt_healty.setOpaque(true);
        rgs_cont.add(opt_healty);

        JRadioButton accept_terms = new JRadioButton("Acepto los terminos y condiciones");
        accept_terms.setBounds(25, 300, 250, 25);
        accept_terms.setOpaque(true);
        rgs_cont.add(accept_terms);
        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos y condiciones");
        reject_terms.setBounds(25, 330, 250, 25);
        reject_terms.setOpaque(true);
        rgs_cont.add(reject_terms);
        ButtonGroup terms_group = new ButtonGroup();
        terms_group.add(accept_terms);
        terms_group.add(reject_terms);
        
        String[] cols = {"Centro","Pueblo Nuevo","San Juan","Santa Ana"};
        JComboBox<String> cols_combo = new JComboBox<>(cols);
        cols_combo.setBounds(25, 200, 150, 25);
        cols_combo.setOpaque(true);
        rgs_cont.add(cols_combo);

        JButton btn_register = new JButton("Registrar");
        btn_register.setBounds(25, 250, 110, 25);
        btn_register.setBackground(Color.white);
        btn_register.setBorder(BorderFactory.createLineBorder(Color.gray));
        btn_register.setFont(new Font("Arial",Font.PLAIN,15));
        rgs_cont.add(btn_register);

        this.setVisible(true);
        this.repaint();
    }
}
