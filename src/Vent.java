import java.awt.*;
import javax.swing.*;

public class Vent extends JFrame{

    JPanel log_regPanel;
    JPanel usersPanel;
    JTabbedPane tabs;

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


        // tabs
        tabs = new JTabbedPane();
        tabs.setBounds(0, 0, 800, 500);

        log_regPanel = new JPanel();
        log_regPanel.setLayout(null);
        usersPanel = new JPanel();
        usersPanel.setLayout(null);

        tabs.addTab("Login-Register", log_regPanel);
        tabs.addTab("Users", usersPanel);
        this.add(tabs);
        this.login();
        this.registro();
        this.users();

        this.setVisible(true);
        this.repaint();
    }
    public void login(){
        JLabel tag_title = new JLabel();
        JTextField ent_user = new JTextField();
        JPasswordField ent_pass = new JPasswordField();
        JCheckBox rcd_userpass = new JCheckBox("Remember");
        JButton btn_login = new JButton("Log In");

        log_regPanel.add(tag_title);
        tag_title.setText("Log In X");
        tag_title.setBounds(100, 50, 200, 50);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Arial",Font.BOLD,30));

        log_regPanel.add(ent_user);
        ent_user.setText("Username");
        ent_user.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_user.setBackground(Color.gray);
        ent_user.setBounds(50, 150, 235, 30);
        ent_user.setFont(new Font("Arial",Font.PLAIN,20));

        log_regPanel.add(ent_pass);
        ent_pass.setText("Password");
        ent_pass.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_pass.setBackground(Color.gray);
        ent_pass.setBounds(50, 215, 235, 30);
        ent_pass.setFont(new Font("Arial",Font.PLAIN,20));
        ent_pass.setEchoChar('·');

        log_regPanel.add(rcd_userpass);
        rcd_userpass.setBounds(50, 250, 110, 25);
        rcd_userpass.setFont(new Font("Arial",Font.PLAIN,15));

        log_regPanel.add(btn_login);
        btn_login.setBounds(115, 280, 110, 25);
        btn_login.setBackground(Color.DARK_GRAY);
        btn_login.setForeground(Color.white);
        btn_login.setFont(new Font("Arial",Font.PLAIN,15));
    }
    public void registro(){
        JPanel rgs_cont = new JPanel();
        JLabel rgs_title = new JLabel("Registro");

        rgs_title.setForeground(Color.white);
        rgs_title.setFont(new Font("Arial",Font.BOLD,20));
        rgs_title.setBounds(25, 10, 200, 25);
        rgs_cont.add(rgs_title);
        
        log_regPanel.add(rgs_cont);
        rgs_cont.setBounds(410,10,360,380);
        rgs_cont.setOpaque(true);
        rgs_cont.setBackground(Color.darkGray);
        rgs_cont.setLayout(null);
        
        JTextArea bio_txt = new JTextArea("X _ X");
        bio_txt.setBounds(25, 45, 310, 50);
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
        opt_salty.setBackground(Color.darkGray);
        opt_salty.setForeground(Color.WHITE);
        opt_salty.setOpaque(true);
        rgs_cont.add(opt_salty);
        JCheckBox opt_healty = new JCheckBox("Saludable");
        opt_healty.setBounds(25, 175, 100, 25);
        opt_healty.setBackground(Color.darkGray);
        opt_healty.setForeground(Color.WHITE);
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
    }
    
    public void users(){
        usersPanel.setBackground(Color.darkGray);
        usersPanel.setLayout(null);

        String [] table_head = {"No.Control","Nombre","Apellidos","Correo Electronico","Semestre","Carrera"};
        Object [][] table_objects = {
            {"21040056", "Carlos", "Gómez Ruiz", "carlos.gomez@ejemplo.com", "5", "Ingeniería de Software"},
            {"20040123", "Ana Sofía", "López Martínez", "ana.lopez@ejemplo.com", "8", "Administración"},
            {"22040987", "Luis", "Fernández Castro", "luis.fernandez@ejemplo.com", "3", "Contabilidad"},
            {"19040541", "María", "Pérez González", "maria.perez@ejemplo.com", "9", "Ingeniería Industrial"},
            {"23040111", "Jorge", "Ramírez Silva", "jorge.ramirez@ejemplo.com", "1", "Derecho"},
            {"21040888", "Elena", "Torres Vargas", "elena.torres@ejemplo.com", "6", "Arquitectura"},
            {"22040334", "Miguel", "Herrera Soto", "miguel.herrera@ejemplo.com", "4", "Medicina"},
            {"20040555", "Lucía", "Mendoza Castro", "lucia.mendoza@ejemplo.com", "2", "Biología"},
            {"22041234", "Roberto", "Sánchez Díaz", "roberto.sanchez@ejemplo.com", "7", "Ingeniería Civil"},
            {"19049876", "Carmen", "Ríos Morales", "carmen.rios@ejemplo.com", "10", "Psicología"},
            {"23045678", "David", "Guerrero Silva", "david.guerrero@ejemplo.com", "1", "Nutrición"},
            {"21043321", "Valeria", "Ortiz Peña", "valeria.ortiz@ejemplo.com", "4", "Diseño Gráfico"},
            {"20048899", "Alejandro", "Cruz Vargas", "alejandro.cruz@ejemplo.com", "6", "Ciencias de la Computación"},
            {"22047766", "Patricia", "Navarro Luna", "patricia.navarro@ejemplo.com", "3", "Odontología"},
            {"19042211", "Fernando", "Rojas Méndez", "fernando.rojas@ejemplo.com", "9", "Filosofía"},
            {"23049900", "Daniela", "Lara Reyes", "daniela.lara@ejemplo.com", "2", "Comunicación"},
            {"21041122", "Ricardo", "Paredes Guzmán", "ricardo.paredes@ejemplo.com", "5", "Ingeniería Mecatrónica"},
            {"22045544", "Sofía", "Campos Blanco", "sofia.campos@ejemplo.com", "4", "Medicina Veterinaria"},
            {"20047711", "Andrés", "Vega Salazar", "andres.vega@ejemplo.com", "8", "Economía"}
        
        };

        JTable students = new JTable(table_objects,table_head);
        JScrollPane final_table = new JScrollPane(students);
        final_table.setBounds(50, 200, 700, 200);
        usersPanel.add(final_table);

        JButton desc_btn = new JButton("Download");
        desc_btn.setBounds(700,150,60,35);
        desc_btn.setFont(new Font("Arial",Font.BOLD,10));
        usersPanel.add(desc_btn);

        JButton add_btn = new JButton("Add");
        add_btn.setBounds(625,150,60,35);
        add_btn.setFont(new Font("Arial",Font.BOLD,10));
        usersPanel.add(add_btn);


    }
}
