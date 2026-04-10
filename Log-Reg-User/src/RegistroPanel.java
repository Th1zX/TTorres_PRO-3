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
        setLayout(null);
        setBackground(new Color(235, 245, 255));

        JLabel title = new JLabel("Registro de usuario");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBounds(60, 30, 400, 40);
        add(title);

        nombreField = createField("Nombre", 80);
        apellidosField = createField("Apellidos", 180);
        controlField = createField("No. Control", 280);
        correoField = createField("Correo electronico", 380);

        JLabel carreraLabel = new JLabel("Carrera");
        carreraLabel.setBounds(60, 470, 200, 20);
        add(carreraLabel);

        String[] carreras = {"Ingeniería de Software", "Administracion", "Contabilidad", "Ingeniería Industrial", "Derecho"};
        JComboBox<String> carreraCombo = new JComboBox<>(carreras);
        carreraCombo.setBounds(60, 500, 380, 30);
        add(carreraCombo);

        JLabel semestreLabel = new JLabel("Semestre");
        semestreLabel.setBounds(60, 540, 200, 20);
        add(semestreLabel);

        String[] semestres = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox<String> semestreCombo = new JComboBox<>(semestres);
        semestreCombo.setBounds(60, 570, 380, 30);
        add(semestreCombo);

        terminosCheck = new JCheckBox("Acepto los terminos y condiciones");
        terminosCheck.setBounds(60, 610, 380, 25);
        add(terminosCheck);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(60, 650, 170, 38);
        registerButton.setBackground(new Color(0, 120, 215));
        registerButton.setForeground(Color.WHITE);
        add(registerButton);

        JButton loginButton = new JButton("Ir a Login");
        loginButton.setBounds(270, 650, 170, 38);
        add(loginButton);

        registerButton.addActionListener(e -> validateRegistro());
        loginButton.addActionListener(e -> main.showLogin());
    }

    private JTextField createField(String labelText, int y) {
        JLabel label = new JLabel(labelText);
        label.setBounds(60, y, 200, 20);
        add(label);
        JTextField field = new JTextField();
        field.setBounds(60, y + 30, 380, 35);
        field.setFont(new Font("Arial", Font.PLAIN, 16));
        field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        add(field);
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
