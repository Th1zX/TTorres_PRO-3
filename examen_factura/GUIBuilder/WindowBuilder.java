import helper_classes.*;
import java.awt.Color;
import javax.swing.*;

public class WindowBuilder {
  public static void main(String[] args) {

    JFrame frame = new JFrame("X");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(750, 700);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel lbl_titulo = new JLabel("Factura JX");
    lbl_titulo.setBounds(30, 20, 200, 30);
    lbl_titulo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    lbl_titulo.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_titulo);

    JLabel lbl_datos_cliente = new JLabel("Datos de Cliente");
    lbl_datos_cliente.setVerticalAlignment(SwingConstants.TOP);
    lbl_datos_cliente.setBounds(30, 60, 650, 100);
    lbl_datos_cliente.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
    lbl_datos_cliente.setBorder(BorderFactory.createLineBorder(Color.decode("#D9D9D9")));
    lbl_datos_cliente.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_datos_cliente);

    JLabel lbl_documento = new JLabel("Documento: ");
    lbl_documento.setBounds(50, 90, 100, 20);
    lbl_documento.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_documento.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_documento);

    JLabel lbl_direccion = new JLabel("Direccion:");
    lbl_direccion.setBounds(50, 125, 100, 20);
    lbl_direccion.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_direccion.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_direccion);

    JLabel lbl_nombre = new JLabel("Nombre: ");
    lbl_nombre.setBounds(350, 90, 80, 20);
    lbl_nombre.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_nombre.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_nombre);

    JLabel lbl_telefono = new JLabel("Telefono:");
    lbl_telefono.setBounds(350, 125, 80, 20);
    lbl_telefono.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_telefono.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_telefono);

    JLabel lbl_datos_factura = new JLabel("Datos de Factura");
    lbl_datos_factura.setBounds(30, 170, 650, 70);
    lbl_datos_factura.setBorder(BorderFactory.createLineBorder(Color.decode("#D9D9D9")));
    lbl_datos_factura.setVerticalAlignment(SwingConstants.TOP);
    lbl_datos_factura.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
    lbl_datos_factura.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_datos_factura);

    JLabel lbl_num_factura = new JLabel("# de Factura:");
    lbl_num_factura.setBounds(50, 200, 100, 20);
    lbl_num_factura.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_num_factura.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_num_factura);

    JLabel lbl_fecha = new JLabel("Fecha:");
    lbl_fecha.setBounds(350, 200, 80, 20);
    lbl_fecha.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_fecha.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_fecha);

    JLabel lbl_val_num_factura = new JLabel("1");
    lbl_val_num_factura.setBounds(150, 200, 100, 20);
    lbl_val_num_factura.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_num_factura.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_num_factura);

    JLabel lbl_val_fecha = new JLabel("17/01/2026");
    lbl_val_fecha.setBounds(430, 200, 150, 20);
    lbl_val_fecha.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_fecha.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_fecha);

    JLabel lbl_listado_facturas = new JLabel("Ver listado de facturas");
    lbl_listado_facturas.setBorder(BorderFactory.createLineBorder(Color.decode("#D9D9D9")));
    lbl_listado_facturas.setVerticalAlignment(SwingConstants.TOP);
    lbl_listado_facturas.setBounds(30, 250, 650, 180);
    lbl_listado_facturas.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 12));
    lbl_listado_facturas.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_listado_facturas);

    JLabel lbl_subtotal = new JLabel("Subtotal: ");
    lbl_subtotal.setBounds(30, 450, 100, 20);
    lbl_subtotal.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_subtotal.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_subtotal);

    JLabel lbl_descuento_porcentaje = new JLabel("Descuento %: ");
    lbl_descuento_porcentaje.setBounds(30, 480, 100, 20);
    lbl_descuento_porcentaje.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_descuento_porcentaje.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_descuento_porcentaje);

    JLabel lbl_iva = new JLabel("IVA 15%:");
    lbl_iva.setBounds(30, 510, 100, 20);
    lbl_iva.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_iva.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_iva);

    JLabel lbl_total = new JLabel("Total Factura:");
    lbl_total.setBounds(30, 540, 100, 20);
    lbl_total.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_total.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_total);

    JLabel lbl_val_subtotal = new JLabel("6000.00");
    lbl_val_subtotal.setBounds(140, 450, 100, 20);
    lbl_val_subtotal.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_subtotal.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_subtotal);

    JLabel lbl_valor_descontado = new JLabel("Valor descontado: ");
    lbl_valor_descontado.setBounds(220, 480, 130, 20);
    lbl_valor_descontado.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_valor_descontado.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_valor_descontado);

    JLabel lbl_val_descontado = new JLabel("0.00");
    lbl_val_descontado.setBounds(360, 480, 100, 20);
    lbl_val_descontado.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_descontado.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_descontado);

    JLabel lbl_val_iva = new JLabel("1500.00");
    lbl_val_iva.setBounds(140, 510, 100, 20);
    lbl_val_iva.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_iva.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_iva);

    JLabel lbl_val_total = new JLabel("7500.00");
    lbl_val_total.setBounds(140, 540, 100, 20);
    lbl_val_total.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    lbl_val_total.setForeground(Color.decode("#D9D9D9"));
    panel.add(lbl_val_total);

    JTextField txt_documento = new JTextField("");
    txt_documento.setBounds(150, 90, 150, 25);
    txt_documento.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    txt_documento.setBackground(Color.decode("#B2B2B2"));
    txt_documento.setForeground(Color.decode("#656565"));
    txt_documento.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(txt_documento, "compra123.pdf", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(txt_documento);

    JTextField txt_direccion = new JTextField("");
    txt_direccion.setBounds(150, 125, 150, 25);
    txt_direccion.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    txt_direccion.setBackground(Color.decode("#B2B2B2"));
    txt_direccion.setForeground(Color.decode("#656565"));
    txt_direccion.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(txt_direccion, "Colima 17", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(txt_direccion);

    JTextField txt_nombre = new JTextField("");
    txt_nombre.setBounds(430, 90, 200, 25);
    txt_nombre.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    txt_nombre.setBackground(Color.decode("#B2B2B2"));
    txt_nombre.setForeground(Color.decode("#656565"));
    txt_nombre.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(txt_nombre, "Jose Torres", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(txt_nombre);

    JTextField txt_telefono = new JTextField("");
    txt_telefono.setBounds(430, 125, 200, 25);
    txt_telefono.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    txt_telefono.setBackground(Color.decode("#B2B2B2"));
    txt_telefono.setForeground(Color.decode("#656565"));
    txt_telefono.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(txt_telefono, "612-123-4567", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(txt_telefono);

    JTextField txt_descuento = new JTextField("");
    txt_descuento.setBounds(140, 480, 60, 25);
    txt_descuento.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    txt_descuento.setBackground(Color.decode("#B2B2B2"));
    txt_descuento.setForeground(Color.decode("#656565"));
    txt_descuento.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(txt_descuento, "0.00", Color.decode("#353535"),   Color.decode("#656565"));
    panel.add(txt_descuento);

    JButton btn_agregar = new JButton("+");
    btn_agregar.setBounds(690, 280, 40, 40);
    btn_agregar.setBackground(Color.decode("#2e2e2e"));
    btn_agregar.setForeground(Color.decode("#D9D9D9"));
    btn_agregar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_agregar.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_agregar.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_agregar, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_agregar);

    JButton btn_quitar = new JButton("-");
    btn_quitar.setBounds(690, 330, 40, 40);
    btn_quitar.setBackground(Color.decode("#2e2e2e"));
    btn_quitar.setForeground(Color.decode("#D9D9D9"));
    btn_quitar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_quitar.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btn_quitar.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_quitar, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_quitar);

    JButton btn_finalizar = new JButton("Finalizar Facura");
    btn_finalizar.setBounds(410, 535, 130, 30);
    btn_finalizar.setBackground(Color.decode("#2e2e2e"));
    btn_finalizar.setForeground(Color.decode("#D9D9D9"));
    btn_finalizar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_finalizar.setBorder(new RoundedBorder(4, Color.decode("#00ff00"), 1));
    btn_finalizar.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_finalizar, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_finalizar);

    JButton btn_limpiar = new JButton("Limpiar");
    btn_limpiar.setBounds(550, 535, 120, 30);
    btn_limpiar.setBackground(Color.decode("#2e2e2e"));
    btn_limpiar.setForeground(Color.decode("#D9D9D9"));
    btn_limpiar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    btn_limpiar.setBorder(new RoundedBorder(4, Color.decode("#ff0000"), 1));
    btn_limpiar.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_limpiar, Color.decode("#232323"), Color.decode("#2e2e2e"));
    panel.add(btn_limpiar);


    String[] table_head = {"Producto", "Cantidad", "Valor", "Subtotal"};
    Object [][] table_obj = {
      {"Agua","2","25","50"},
      {"Cereal","5","45","90"},
      {"Leche","2","30","60"}};
    JTable table = new JTable(table_obj,table_head);
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setBounds(50, 280, 610, 130);
    panel.add(scrollPane);

    frame.add(panel);
    frame.setVisible(true);

  }
}
//test
//test