import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentCal extends JFrame {

    Font FONT_DISPLAY = new Font("Arial", Font.BOLD, 42);
    Font FONT_BUTTON = new Font("Arial", Font.BOLD, 22);
    Color C_FONDO = new Color(25, 25, 30);
    Color C_PANEL = new Color(25, 25, 30);
    Color C_BTN = new Color(45, 45, 50);
    Color C_OP = new Color(130, 80, 255);
    Color C_CLR = new Color(80, 80, 90);

    JTextField ent0;

    String[][] BTN_LAYOUT = {
        {"7", "8", "9", "%", "←"},
        {"4", "5", "6", "/", null},
        {"1", "2", "3", "*", "Enter"},
        {"0", ".", "+", "-", "="}
    };

    public VentCal() {
        super("X");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 550);
        setLocationRelativeTo(null);
        setMinimumSize(new java.awt.Dimension(300, 450));

        JPanel panel1 = new JPanel(new BorderLayout(10, 10));
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10)); 
        panel1.setBackground(C_FONDO); 

        JPanel panelS = new JPanel(new BorderLayout());
        ent0 = new JTextField("0");
        ent0.setEditable(false); 
        ent0.setHorizontalAlignment(JTextField.RIGHT); 
        ent0.setFont(FONT_DISPLAY);
        ent0.setForeground(Color.WHITE);
        ent0.setBorder(null); 
        ent0.setBackground(C_PANEL);
        panelS.add(ent0, BorderLayout.CENTER);

        JPanel panelB = new JPanel(new GridBagLayout());
        GridBagConstraints gman = new GridBagConstraints();
        panelB.setBackground(C_PANEL);

        //Logica soon.......
        ActionListener listener = e -> {
            String comando = e.getActionCommand();
        };

        gman.fill = GridBagConstraints.BOTH;
        gman.weightx = 1.0;
        gman.weighty = 1.0;
        gman.insets = new java.awt.Insets(5, 5, 5, 5);

        for (int y = 0; y < BTN_LAYOUT.length; y++) {
            for (int x = 0; x < BTN_LAYOUT[y].length; x++) {
                String etiqueta = BTN_LAYOUT[y][x];
                if (etiqueta == null) continue;

                gman.gridx = x;
                gman.gridy = y;
                gman.gridwidth = 1;
                gman.gridheight = 1;

                if (etiqueta.equals("←")) {
                    gman.gridheight = 2;
                }

                JButton btn = createButton(etiqueta, listener);
                panelB.add(btn, gman);
            }
        }

        panel1.add(panelS, BorderLayout.NORTH);
        panel1.add(panelB, BorderLayout.CENTER);

        add(panel1);
        this.setVisible(true);
    }

        JButton createButton(String label, ActionListener listener) {
        JButton btn = new JButton(label);
        btn.setFont(FONT_BUTTON);
        btn.setFocusPainted(false);
        btn.addActionListener(listener);
        btn.setForeground(Color.WHITE);

        if ("←".equals(label)) btn.setBackground(C_CLR);
        else if ("/*-+".contains(label)) btn.setBackground(C_OP);
        else if ("%".equals(label)) btn.setBackground(C_OP);
        else if ("=".equals(label)) btn.setBackground(new Color(255, 159, 10));
        else if ("Enter".equals(label)) btn.setBackground(C_CLR);
        else { btn.setBackground(C_BTN); }

        return btn;
    }
}