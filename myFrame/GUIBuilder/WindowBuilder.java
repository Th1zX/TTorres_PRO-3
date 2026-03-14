import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class WindowBuilder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Usuarios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 650);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.decode("#222222"));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.decode("#222222"));

        Color colorTexto = Color.decode("#E0E0E0");
        Color colorFondoInput = Color.decode("#999999");
        Color colorBordeVerde = Color.decode("#00C800");
        Color colorBordeRojo = Color.decode("#C80000");
        Color colorNegro = Color.decode("#000000");
        Color colorBlanco = Color.decode("#FFFFFF");
        
        Font fuenteTitulo = new Font("SansSerif", Font.PLAIN, 28);
        Font fuenteNormal = new Font("SansSerif", Font.PLAIN, 14);

        JLabel lblTitle = new JLabel("Registro de Usuarios");
        lblTitle.setBounds(20, 10, 300, 40);
        lblTitle.setFont(fuenteTitulo);
        lblTitle.setForeground(colorTexto);
        mainPanel.add(lblTitle);

        JPanel panelGenerales = new JPanel();
        panelGenerales.setLayout(null);
        panelGenerales.setBounds(20, 70, 400, 280);
        panelGenerales.setBackground(Color.decode("#222222"));
        panelGenerales.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(colorBordeVerde), "Datos Generales", 
            TitledBorder.LEFT, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 16), colorTexto));

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(30, 40, 120, 20);
        lblNombres.setForeground(colorTexto);
        lblNombres.setFont(fuenteNormal);
        panelGenerales.add(lblNombres);
        JTextField txtNombres = new JTextField("Taddheo");
        txtNombres.setBounds(160, 40, 180, 25);
        txtNombres.setBackground(colorFondoInput);
        txtNombres.setBorder(BorderFactory.createEmptyBorder());
        panelGenerales.add(txtNombres);

        JLabel lblPaterno = new JLabel("Apellido Paterno:");
        lblPaterno.setBounds(30, 80, 120, 20);
        lblPaterno.setForeground(colorTexto);
        lblPaterno.setFont(fuenteNormal);
        panelGenerales.add(lblPaterno);
        JTextField txtPaterno = new JTextField("Carballo");
        txtPaterno.setBounds(160, 80, 180, 25);
        txtPaterno.setBackground(colorFondoInput);
        txtPaterno.setBorder(BorderFactory.createEmptyBorder());
        panelGenerales.add(txtPaterno);

        JLabel lblMaterno = new JLabel("Apellido Materno:");
        lblMaterno.setBounds(30, 120, 120, 20);
        lblMaterno.setForeground(colorTexto);
        lblMaterno.setFont(fuenteNormal);
        panelGenerales.add(lblMaterno);
        JTextField txtMaterno = new JTextField("Torres");
        txtMaterno.setBounds(160, 120, 180, 25);
        txtMaterno.setBackground(colorFondoInput);
        txtMaterno.setBorder(BorderFactory.createEmptyBorder());
        panelGenerales.add(txtMaterno);

        JLabel lblFecha = new JLabel("Fecha Nacimiento:");
        lblFecha.setBounds(30, 160, 130, 20);
        lblFecha.setForeground(colorTexto);
        lblFecha.setFont(fuenteNormal);
        panelGenerales.add(lblFecha);
        JTextField txtFecha = new JTextField("17/01/2005");
        txtFecha.setBounds(160, 160, 130, 25);
        txtFecha.setBackground(colorFondoInput);
        txtFecha.setBorder(BorderFactory.createEmptyBorder());
        panelGenerales.add(txtFecha);
        JButton btnCalendar = new JButton("O");
        btnCalendar.setBounds(300, 160, 40, 25);
        btnCalendar.setBackground(colorFondoInput);
        btnCalendar.setBorder(BorderFactory.createEmptyBorder());
        panelGenerales.add(btnCalendar);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(30, 200, 120, 20);
        lblSexo.setForeground(colorTexto);
        lblSexo.setFont(fuenteNormal);
        panelGenerales.add(lblSexo);
        JRadioButton rbMasculino = new JRadioButton("Masculino", true);
        rbMasculino.setBounds(160, 190, 100, 20);
        rbMasculino.setOpaque(false);
        rbMasculino.setForeground(colorTexto);
        JRadioButton rbFemenino = new JRadioButton("Femenino");
        rbFemenino.setBounds(160, 210, 100, 20);
        rbFemenino.setOpaque(false);
        rbFemenino.setForeground(colorTexto);
        ButtonGroup bgSexo = new ButtonGroup();
        bgSexo.add(rbMasculino);
        bgSexo.add(rbFemenino);
        panelGenerales.add(rbMasculino);
        panelGenerales.add(rbFemenino);

        JLabel lblNacionalidad = new JLabel("Nacionalidad:");
        lblNacionalidad.setBounds(30, 240, 120, 20);
        lblNacionalidad.setForeground(colorTexto);
        lblNacionalidad.setFont(fuenteNormal);
        panelGenerales.add(lblNacionalidad);
        String[] paises = {"Perú", "México", "Colombia", "Argentina"};
        JComboBox<String> cbNacionalidad = new JComboBox<>(paises);
        cbNacionalidad.setBounds(160, 240, 180, 25);
        cbNacionalidad.setBackground(colorFondoInput);
        cbNacionalidad.setForeground(colorNegro);
        panelGenerales.add(cbNacionalidad);

        mainPanel.add(panelGenerales);

        JPanel panelPerfil = new JPanel();
        panelPerfil.setLayout(null);
        panelPerfil.setBounds(440, 70, 220, 280);
        panelPerfil.setBackground(Color.decode("#222222"));
        panelPerfil.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(colorBordeRojo), "Perfil del Usuario", 
            TitledBorder.LEFT, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 16), colorTexto));

        ImageIcon icon = new ImageIcon("GUIBuilder/rn.jpeg");
        Image img = icon.getImage().getScaledInstance(140, 150, Image.SCALE_SMOOTH);
        JLabel lblFoto = new JLabel(new ImageIcon(img));
        lblFoto.setBounds(40, 40, 140, 150);
        lblFoto.setBorder(BorderFactory.createLineBorder(colorFondoInput));
        panelPerfil.add(lblFoto);

        JCheckBox chkMostrarFoto = new JCheckBox("Mostrar Foto de Perfil", true);
        chkMostrarFoto.setBounds(20, 200, 180, 20);
        chkMostrarFoto.setOpaque(false);
        chkMostrarFoto.setForeground(colorTexto);
        panelPerfil.add(chkMostrarFoto);

        JCheckBox chkMostrarFecha = new JCheckBox("Mostrar fecha Nacimiento", true);
        chkMostrarFecha.setBounds(20, 230, 190, 20);
        chkMostrarFecha.setOpaque(false);
        chkMostrarFecha.setForeground(colorTexto);
        panelPerfil.add(chkMostrarFecha);

        mainPanel.add(panelPerfil);

        JPanel panelOpcionales = new JPanel();
        panelOpcionales.setLayout(null);
        panelOpcionales.setBounds(20, 370, 400, 220);
        panelOpcionales.setBackground(Color.decode("#222222"));
        panelOpcionales.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(colorBordeVerde), "Datos Opcionales", 
            TitledBorder.LEFT, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 16), colorTexto));

        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setBounds(20, 30, 100, 20);
        lblDescripcion.setForeground(colorTexto);
        panelOpcionales.add(lblDescripcion);

        JTextArea txtDescripcion = new JTextArea("XXXXXXXXXXXXX");
        txtDescripcion.setBackground(colorFondoInput);
        txtDescripcion.setForeground(colorNegro);
        JScrollPane scrollDescripcion = new JScrollPane(txtDescripcion);
        scrollDescripcion.setBounds(20, 60, 160, 130);
        scrollDescripcion.setBorder(BorderFactory.createEmptyBorder());
        panelOpcionales.add(scrollDescripcion);

        JLabel lblPreferencias = new JLabel("Preferencias:");
        lblPreferencias.setBounds(200, 30, 100, 20);
        lblPreferencias.setForeground(colorTexto);
        panelOpcionales.add(lblPreferencias);

        String[] preferencias = {"Cantar", "Escuchar Música", "Leer", "Deportes", "Otros"};
        JList<String> listPreferencias = new JList<>(preferencias);
        listPreferencias.setSelectedIndex(3);
        listPreferencias.setBackground(colorFondoInput);
        listPreferencias.setForeground(colorNegro);
        JScrollPane scrollPreferencias = new JScrollPane(listPreferencias);
        scrollPreferencias.setBounds(200, 60, 160, 130);
        scrollPreferencias.setBorder(BorderFactory.createEmptyBorder());
        panelOpcionales.add(scrollPreferencias);

        mainPanel.add(panelOpcionales);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(null);
        panelBotones.setBounds(440, 370, 220, 220);
        panelBotones.setBackground(Color.decode("#222222"));
        panelBotones.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(colorBordeRojo), "Acciones", 
            TitledBorder.LEFT, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 16), colorTexto));

        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.setBounds(50, 40, 120, 35);
        btnNuevo.setBackground(Color.decode("#505050"));
        btnNuevo.setForeground(colorBlanco);
        btnNuevo.setFocusPainted(false);
        btnNuevo.setBorder(BorderFactory.createEmptyBorder());
        panelBotones.add(btnNuevo);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(50, 100, 120, 35);
        btnGuardar.setBackground(Color.decode("#009900"));
        btnGuardar.setForeground(colorBlanco);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setBorder(BorderFactory.createEmptyBorder());
        panelBotones.add(btnGuardar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(50, 160, 120, 35);
        btnSalir.setBackground(Color.decode("#990000"));
        btnSalir.setForeground(colorBlanco);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorder(BorderFactory.createEmptyBorder());
        panelBotones.add(btnSalir);

        mainPanel.add(panelBotones);

        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }
}