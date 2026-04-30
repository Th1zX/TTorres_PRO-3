import java.awt.*;
import javax.swing.*;

public class RegistroPanel extends JPanel {
    private final JTextField nombreField;
    private final JTextField apellidosField;
    private final JTextField controlField;
    private final JTextField correoField;
    private final JCheckBox terminosCheck;
    private final ventMain main;

    public RegistroPanel(ventMain main) {
        this.main = main;
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 250));

        JPanel mainCenterPanel = new JPanel();
        mainCenterPanel.setLayout(new BorderLayout());
        mainCenterPanel.setBackground(new Color(245, 245, 250));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245, 245, 250));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 50));

        JLabel title = new JLabel("Registro de usuario");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(title);
        centerPanel.add(Box.createVerticalStrut(30));

        nombreField = createFieldNew("Nombre", centerPanel);
        apellidosField = createFieldNew("Apellidos", centerPanel);
        controlField = createFieldNew("No. Control", centerPanel);
        correoField = createFieldNew("Correo electronico", centerPanel);

        JLabel carreraLabel = new JLabel("Carrera");
        carreraLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(carreraLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        String[] carreras = {"Ingenieria de Software", "Administracion", "Contabilidad", "Ingeniería Industrial", "Derecho"};
        JComboBox<String> carreraCombo = new JComboBox<>(carreras);
        carreraCombo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        carreraCombo.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(carreraCombo);
        centerPanel.add(Box.createVerticalStrut(15));

        JLabel semestreLabel = new JLabel("Semestre");
        semestreLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(semestreLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        String[] semestres = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox<String> semestreCombo = new JComboBox<>(semestres);
        semestreCombo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        semestreCombo.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(semestreCombo);
        centerPanel.add(Box.createVerticalStrut(15));

        terminosCheck = new JCheckBox("Acepto los terminos y condiciones");
        terminosCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        terminosCheck.setBackground(new Color(245, 245, 250));
        centerPanel.add(terminosCheck);
        centerPanel.add(Box.createVerticalStrut(20));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBackground(new Color(245, 245, 250));
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

        JButton registerButton = new JButton("Registrar");
        registerButton.setPreferredSize(new Dimension(140, 38));
        registerButton.setBackground(new Color(0, 120, 215));
        registerButton.setForeground(Color.WHITE);

        JButton loginButton = new JButton("Iniciar sesion");
        loginButton.setPreferredSize(new Dimension(140, 38));

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(registerButton);
        buttonPanel.add(Box.createHorizontalStrut(20));
        buttonPanel.add(loginButton);
        buttonPanel.add(Box.createHorizontalGlue());
        
        centerPanel.add(buttonPanel);
        centerPanel.add(Box.createVerticalGlue());

        mainCenterPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(new Color(245, 245, 250));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        JLabel regisImageLabel = new JLabel();
        ImageIcon regisIcon = new ImageIcon("src/regis.png");
        Image regisImg = regisIcon.getImage().getScaledInstance(350, 640, Image.SCALE_SMOOTH);
        regisImageLabel.setIcon(new ImageIcon(regisImg));
        regisImageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        rightPanel.add(regisImageLabel);

        mainCenterPanel.add(rightPanel, BorderLayout.EAST);
        add(mainCenterPanel, BorderLayout.CENTER);

        registerButton.addActionListener(e -> validateRegistro());
        loginButton.addActionListener(e -> main.showLogin());
    }

    private JTextField createFieldNew(String labelText, JPanel panel) {
        JLabel label = new JLabel(labelText);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(label);
        panel.add(Box.createVerticalStrut(5));
        JTextField field = new JTextField();
        field.setFont(new Font("Arial", Font.PLAIN, 16));
        field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        field.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(field);
        panel.add(Box.createVerticalStrut(15));
        return field;
    }

    private void validateRegistro() {
        boolean nombreValid = !nombreField.getText().trim().isEmpty();
        boolean apellidosValid = !apellidosField.getText().trim().isEmpty();
        boolean controlValid = controlField.getText().trim().matches("\\d{6,}");
        boolean correoValid = correoField.getText().trim().matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
        boolean terminosValid = terminosCheck.isSelected();
        nombreField.setBorder(BorderFactory.createLineBorder(nombreValid ? Color.GREEN : Color.RED, 2));
        apellidosField.setBorder(BorderFactory.createLineBorder(apellidosValid ? Color.GREEN : Color.RED, 2));
        controlField.setBorder(BorderFactory.createLineBorder(controlValid ? Color.GREEN : Color.RED, 2));
        correoField.setBorder(BorderFactory.createLineBorder(correoValid ? Color.GREEN : Color.RED, 2));
        terminosCheck.setForeground(terminosValid ? Color.BLACK : Color.RED);
        if (nombreValid && apellidosValid && controlValid && correoValid && terminosValid) {
            JOptionPane.showMessageDialog(this, "Registro exitoso", "Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Verifique los campos marcados", "Error de validacion", JOptionPane.WARNING_MESSAGE);
        }
    }
}