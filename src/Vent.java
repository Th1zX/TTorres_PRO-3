import java.awt.*;
import javax.swing.*;

public class Vent extends JFrame{
    JPanel log_regPanel;
    JPanel regPanel;
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

        tabs = new JTabbedPane();
        tabs.setBounds(0, 0, 800, 500);

        log_regPanel = new JPanel();
        log_regPanel.setLayout(null);
        regPanel = new JPanel();
        regPanel.setLayout(null);
        usersPanel = new JPanel();
        usersPanel.setLayout(null);

        tabs.addTab("Login", log_regPanel);
        tabs.addTab("Register", regPanel);
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
        JCheckBox rcd_userpass = new JCheckBox("Recordar");
        JButton btn_login = new JButton("Iniciar sesion");

        log_regPanel.add(tag_title);
        ImageIcon logo = new ImageIcon(getClass().getResource("/dascl.png"));
        Image logoScaled = logo.getImage().getScaledInstance(230, 80, Image.SCALE_SMOOTH);
        tag_title.setIcon(new ImageIcon(logoScaled));
        tag_title.setBounds(285, 30, 230, 80);

        log_regPanel.add(ent_user);
        ent_user.setText("Usuario");
        ent_user.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_user.setForeground(Color.WHITE);
        ent_user.setBackground(Color.gray);
        ent_user.setBounds(285, 150, 235, 30);
        ent_user.setFont(new Font("Arial",Font.PLAIN,20));

        log_regPanel.add(ent_pass);
        ent_pass.setText("Password");
        ent_pass.setBorder(BorderFactory.createLineBorder(Color.gray));
        ent_pass.setForeground(Color.WHITE);
        ent_pass.setBackground(Color.gray);
        ent_pass.setBounds(285, 215, 235, 30);
        ent_pass.setFont(new Font("Arial",Font.PLAIN,20));
        ent_pass.setEchoChar('·');

        log_regPanel.add(rcd_userpass);
        rcd_userpass.setBounds(285, 250, 110, 25);
        rcd_userpass.setFont(new Font("Arial",Font.PLAIN,15));

        log_regPanel.add(btn_login);
        btn_login.setBounds(332, 280, 140, 25);
        btn_login.setBackground(Color.DARK_GRAY);
        btn_login.setForeground(Color.white);
        btn_login.setFont(new Font("Arial",Font.PLAIN,15));
    }
    public void registro(){
        JPanel rgs_cont = new JPanel();
        JLabel rgs_title = new JLabel("Registro");

        rgs_title.setForeground(Color.white);
        rgs_title.setFont(new Font("Arial",Font.BOLD,20));
        rgs_title.setBounds(25, 10, 300, 25);
        rgs_cont.add(rgs_title);
        
        JLabel regis_image = new JLabel();
        ImageIcon regis = new ImageIcon(getClass().getResource("/regis.png"));
        Image regisScaled = regis.getImage().getScaledInstance(400, 500, Image.SCALE_SMOOTH);
        regis_image.setIcon(new ImageIcon(regisScaled));
        regis_image.setBounds(0, 0, 400, 500);
        regPanel.add(regis_image);

        regPanel.add(rgs_cont);
        rgs_cont.setBounds(400,0,400,500);
        rgs_cont.setOpaque(true);
        rgs_cont.setBackground(new Color(45, 70, 100));
        rgs_cont.setLayout(null);

        JLabel label_nombre = new JLabel("Nombre:");
        label_nombre.setForeground(Color.WHITE);
        label_nombre.setBounds(25, 45, 80, 20);
        label_nombre.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_nombre);
        JTextField txt_nombre = new JTextField();
        txt_nombre.setBounds(15, 65, 370, 25);
        txt_nombre.setBorder(BorderFactory.createLineBorder(new Color(100, 150, 200)));
        txt_nombre.setBackground(new Color(220, 230, 240));
        txt_nombre.setForeground(new Color(30, 50, 80));
        rgs_cont.add(txt_nombre);

        JLabel label_apellidos = new JLabel("Apellidos:");
        label_apellidos.setForeground(Color.WHITE);
        label_apellidos.setBounds(25, 95, 80, 20);
        label_apellidos.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_apellidos);
        JTextField txt_apellidos = new JTextField();
        txt_apellidos.setBounds(15, 115, 370, 25);
        txt_apellidos.setBorder(BorderFactory.createLineBorder(new Color(100, 150, 200)));
        txt_apellidos.setBackground(new Color(220, 230, 240));
        txt_apellidos.setForeground(new Color(30, 50, 80));
        rgs_cont.add(txt_apellidos);

        JLabel label_control = new JLabel("No. Control:");
        label_control.setForeground(Color.WHITE);
        label_control.setBounds(25, 145, 80, 20);
        label_control.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_control);
        JTextField txt_control = new JTextField();
        txt_control.setBounds(15, 165, 370, 25);
        txt_control.setBorder(BorderFactory.createLineBorder(new Color(100, 150, 200)));
        txt_control.setBackground(new Color(220, 230, 240));
        txt_control.setForeground(new Color(30, 50, 80));
        rgs_cont.add(txt_control);

        JLabel label_correo = new JLabel("Correo:");
        label_correo.setForeground(Color.WHITE);
        label_correo.setBounds(25, 195, 80, 20);
        label_correo.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_correo);
        JTextField txt_correo = new JTextField();
        txt_correo.setBounds(15, 215, 370, 25);
        txt_correo.setBorder(BorderFactory.createLineBorder(new Color(100, 150, 200)));
        txt_correo.setBackground(new Color(220, 230, 240));
        txt_correo.setForeground(new Color(30, 50, 80));
        rgs_cont.add(txt_correo);

        JLabel label_carrera = new JLabel("Carrera:");
        label_carrera.setForeground(Color.WHITE);
        label_carrera.setBounds(25, 245, 80, 20);
        label_carrera.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_carrera);
        String[] carreras = {"Ingeniería de Software", "Administración", "Contabilidad", "Ingeniería Industrial", "Derecho"};
        JComboBox<String> combo_carrera = new JComboBox<>(carreras);
        combo_carrera.setBounds(15, 265, 370, 25);
        rgs_cont.add(combo_carrera);

        JLabel label_semestre = new JLabel("Semestre:");
        label_semestre.setForeground(Color.WHITE);
        label_semestre.setBounds(25, 295, 80, 20);
        label_semestre.setFont(new Font("Arial", Font.PLAIN, 12));
        rgs_cont.add(label_semestre);
        String[] semestres = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox<String> combo_semestre = new JComboBox<>(semestres);
        combo_semestre.setBounds(15, 315, 370, 25);
        rgs_cont.add(combo_semestre);

        JCheckBox chk_terminos = new JCheckBox("Acepto los términos y condiciones");
        chk_terminos.setBounds(15, 345, 370, 20);
        chk_terminos.setBackground(new Color(45, 70, 100));
        chk_terminos.setForeground(Color.WHITE);
        chk_terminos.setOpaque(true);
        rgs_cont.add(chk_terminos);

        JButton btn_register = new JButton("Registrar");
        btn_register.setBounds(152, 370, 95, 25);
        btn_register.setBackground(new Color(100, 150, 200));
        btn_register.setBorder(BorderFactory.createLineBorder(new Color(70, 120, 170)));
        btn_register.setFont(new Font("Arial", Font.PLAIN, 15));
        btn_register.setForeground(Color.WHITE);
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

        JLabel user_title = new JLabel("Users");
        user_title.setBounds(350,30,200,100);
        user_title.setFont(new Font("Arial",Font.BOLD,35));
        user_title.setForeground(Color.white);
        usersPanel.add(user_title);

        JLabel users_conttitle = new JLabel("Total Users");
        users_conttitle.setBounds(75,100,200,100);
        users_conttitle.setFont(new Font("Arial",Font.BOLD,20));
        users_conttitle.setForeground(Color.white);
        usersPanel.add(users_conttitle);

        JLabel users_cont = new JLabel("18");
        users_cont.setBounds(75,125,200,100);
        users_cont.setFont(new Font("Arial",Font.BOLD,20));
        users_cont.setForeground(Color.white);
        usersPanel.add(users_cont);

        
        JButton desc_btn = new JButton("Download");
        desc_btn.setBounds(680,150,100,20);
        desc_btn.setFont(new Font("Arial",Font.BOLD,10));
        usersPanel.add(desc_btn);

        JButton add_btn = new JButton("Add");
        add_btn.setBounds(570,150,100,20);
        add_btn.setFont(new Font("Arial",Font.BOLD,10));
        usersPanel.add(add_btn);

        JMenuBar menuBar = new JMenuBar();
        JMenu barra = new JMenu("|||");
        menuBar.add(barra);

        JMenu menu1 = new JMenu("Archivo");
        barra.add(menu1);
        JMenuItem opt1_mi = new JMenuItem("Abir");
        menu1.add(opt1_mi);
        JMenuItem opt2_mi = new JMenuItem("Nuevo");
        menu1.add(opt2_mi);
        JMenuItem opt3_mi = new JMenuItem("Cerrar");
        menu1.add(opt3_mi);
        menu1.addSeparator();

        JMenu menu2 = new JMenu("Guardar");
        menu1.add(menu2);
        JMenuItem opt4_mi = new JMenuItem("Guardar");
        menu2.add(opt4_mi);
        JMenuItem opt5_mi = new JMenuItem("Guardar como");
        menu2.add(opt5_mi);
        this.setJMenuBar(menuBar);
    }

    private void setIconImage(String rnjpeg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
