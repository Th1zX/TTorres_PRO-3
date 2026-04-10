import java.awt.*;
import javax.swing.*;

public class LoginPanel extends JPanel {
    private final JTextField emailField;
    private final JPasswordField passwordField;
    private final ventMain main;

    public LoginPanel(ventMain main) {
        this.main = main;
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 250));

        // Panel superior con encabezado centrado
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setBackground(new Color(245, 245, 250));
        
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("src/dascl.png");
        Image img = icon.getImage().getScaledInstance(400, 150, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPanel.add(Box.createVerticalStrut(20));
        headerPanel.add(imageLabel);
        headerPanel.add(Box.createVerticalStrut(20));
        
        add(headerPanel, BorderLayout.NORTH);

        // Panel central con formulario centrado
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(245, 245, 250));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        JLabel title = new JLabel("Inicio de sesion");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(title);
        centerPanel.add(Box.createVerticalStrut(30));

        JLabel emailLabel = new JLabel("Correo electronico");
        emailLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(emailLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        emailField = new JTextField(25);
        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        emailField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        emailField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        centerPanel.add(emailField);
        centerPanel.add(Box.createVerticalStrut(15));

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(passwordLabel);
        centerPanel.add(Box.createVerticalStrut(5));

        passwordField = new JPasswordField(25);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        centerPanel.add(passwordField);
        centerPanel.add(Box.createVerticalStrut(15));

        JCheckBox rememberCheck = new JCheckBox("Recordar contraseña");
        rememberCheck.setAlignmentX(Component.LEFT_ALIGNMENT);
        centerPanel.add(rememberCheck);
        centerPanel.add(Box.createVerticalStrut(20));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBackground(new Color(245, 245, 250));
        
        JButton accessButton = new JButton("Acceder");
        accessButton.setPreferredSize(new Dimension(140, 38));
        accessButton.setBackground(Color.BLACK);
        accessButton.setForeground(Color.WHITE);
        
        JButton registerButton = new JButton("Ir a Registro");
        registerButton.setPreferredSize(new Dimension(140, 38));
        
        buttonPanel.add(accessButton);
        buttonPanel.add(Box.createHorizontalStrut(20));
        buttonPanel.add(registerButton);
        
        centerPanel.add(buttonPanel);
        centerPanel.add(Box.createVerticalStrut(15));

        JLabel hint = new JLabel("usuario: admin@uabcs.mx  contraseña: 12345");
        hint.setFont(new Font("Arial", Font.PLAIN, 12));
        hint.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(hint);
        centerPanel.add(Box.createVerticalGlue());

        add(centerPanel, BorderLayout.CENTER);

        accessButton.addActionListener(e -> validateLogin());
        registerButton.addActionListener(e -> main.showRegistro());
    }

    private void validateLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        boolean emailValid = !email.isEmpty();
        boolean passwordValid = !password.isEmpty();
        emailField.setBorder(BorderFactory.createLineBorder(emailValid ? Color.GREEN : Color.RED, 2));
        passwordField.setBorder(BorderFactory.createLineBorder(passwordValid ? Color.GREEN : Color.RED, 2));

        if (!emailValid || !passwordValid) {
            JOptionPane.showMessageDialog(this, "Verifique sus credenciales", "Error de validacion", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (email.equals("admin@uabcs.mx") && password.equals("12345")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso", "Autenticacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Fallo la autenticacion", JOptionPane.ERROR_MESSAGE);
        }
    }
}
