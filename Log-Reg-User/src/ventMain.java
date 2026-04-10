import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ventMain extends JFrame {
    private final JPanel content;

    public ventMain() {
        setTitle("Login & Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 720);
        setMinimumSize(new Dimension(850, 700));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        content = new JPanel(new BorderLayout());
        content.setBackground(Color.WHITE);
        add(content, BorderLayout.CENTER);
        setJMenuBar(createMenuBar());
        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenuItem loginMenu = new JMenuItem("Login");
        JMenuItem registroMenu = new JMenuItem("Registro");
        JMenuItem salirMenu = new JMenuItem("Salir");
        loginMenu.addActionListener(this::handleMenu);
        registroMenu.addActionListener(this::handleMenu);
        salirMenu.addActionListener(e -> dispose());
        archivo.add(loginMenu);
        archivo.add(registroMenu);
        archivo.addSeparator();
        archivo.add(salirMenu);

        menuBar.add(archivo);
        return menuBar;
    }

    private void handleMenu(ActionEvent event) {
        String command = ((JMenuItem) event.getSource()).getText();
        if ("Login".equals(command)) {
            showLogin();
        } else if ("Registro".equals(command)) {
            showRegistro();
        }
    }

    public void showLogin() {
        content.removeAll();
        content.add(new LoginPanel(this), BorderLayout.CENTER);
        refreshContent();
    }

    public void showRegistro() {
        content.removeAll();
        content.add(new RegistroPanel(this), BorderLayout.CENTER);
        refreshContent();
    }

    private void refreshContent() {
        content.revalidate();
        content.repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(ventMain::new);
    }
}
