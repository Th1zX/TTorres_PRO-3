import java.awt.*;
import javax.swing.*;

public class Vent extends JFrame{

    public Vent() {
        this.setTitle("X");
        this.setLayout(null);
        this.setMaximumSize(new Dimension(350,350));
        this.setMinimumSize(new Dimension(350,350));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,350);
        this.setBackground(Color.white);
        this.setLocationRelativeTo(null); 
        this.setVisible(true);        

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
    }
}
