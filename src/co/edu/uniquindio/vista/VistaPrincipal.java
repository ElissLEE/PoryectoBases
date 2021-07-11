package co.edu.uniquindio.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;

public class VistaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// =========== Sede ===========//
	private JTextField textoCodigoSede;
	private JTextField textoNombreSede;
	private JTable tablaSedes;
	private JTextField textoCodigoBusquedaSede;
	private JTextField textoStockProducto;
	private JTextField textoDescProducto;
	private JTextField textoBusquedaProducto;
	private JTable tablaProductos;
	private JTextField textoCodigoProducto;
	private JTextField textoNombreProducto;
	private JTextField textoPrecioProducto;
	private JTextField textoApellidosProveedor;
	private JTextField textoCodigoProveedor;
	private JTextField textoBusquedaProveedor;
	private JTable tablaProveedores;
	private JTextField textoCedulaProveedor;
	private JTextField textoNombreProveedor;
	private JTextField textoApellidosCliente;
	private JTextField textoDireccionCliente;
	private JTextField textoBusquedaCliente;
	private JTextField textoCedulaCliente;
	private JTextField textoNombreCliente;
	private JTable table;
	private JTextField textoFechaCarrito;
	private JTextField textoBusquedaCarrito;
	private JTextField textoNumeroCarrito;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setResizable(false);
		setTitle("El Buen Precio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setForeground(Color.BLACK);
		tabbedPane.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
				JPanel panelInicio = new JPanel();
				panelInicio.setBackground(Color.WHITE);
				tabbedPane.addTab("Inicio", null, panelInicio, null);
				panelInicio.setLayout(null);
				
				JLabel lblNewLabel_18 = new JLabel("");
				lblNewLabel_18.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/icono.jpg")));
				lblNewLabel_18.setBounds(286, 67, 225, 180);
				panelInicio.add(lblNewLabel_18);
				
				JLabel lblNewLabel_19 = new JLabel("");
				lblNewLabel_19.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/facebook.png")));
				lblNewLabel_19.setBounds(79, 329, 50, 50);
				panelInicio.add(lblNewLabel_19);
				
				JLabel lblNewLabel_20 = new JLabel("El Buen Precio");
				lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_20.setBounds(139, 347, 182, 25);
				panelInicio.add(lblNewLabel_20);
				
				JLabel lblNewLabel_21 = new JLabel("");
				lblNewLabel_21.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/insta.png")));
				lblNewLabel_21.setBounds(499, 329, 50, 50);
				panelInicio.add(lblNewLabel_21);
				
				JLabel lblNewLabel_22 = new JLabel("elbuenprecio_");
				lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_22.setBounds(559, 347, 147, 25);
				panelInicio.add(lblNewLabel_22);

		JPanel panelSede = new JPanel();
		panelSede.setBackground(Color.WHITE);
		tabbedPane.addTab("Sede", null, panelSede, null);
		panelSede.setLayout(null);
  /*
		class FondoPanel extends JPanel{
		
			private Image imagen;
			
			@Override
			public void paint(Graphics g) {
				
				imagen =  new Image(getClass().getResource("/co/edu/uniquindio/inconos/recargar.png").getFile());
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paint(g);
			}
		}
		*/
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n de la sede");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(65, 250, 268, 14);
		panelSede.add(lblNewLabel);

		textoCodigoSede = new JTextField();
		textoCodigoSede.setBounds(195, 118, 161, 20);
		panelSede.add(textoCodigoSede);
		textoCodigoSede.setColumns(10);

		textoNombreSede = new JTextField();
		textoNombreSede.setBounds(195, 154, 161, 20);
		panelSede.add(textoNombreSede);
		textoNombreSede.setColumns(10);

		JComboBox ComboBoxCiudadSede = new JComboBox();
		ComboBoxCiudadSede.setToolTipText("");
		ComboBoxCiudadSede.setBackground(Color.WHITE);
		ComboBoxCiudadSede.setBounds(195, 78, 161, 20);
		panelSede.add(ComboBoxCiudadSede);

		JLabel lblCodigoSede = new JLabel("Codigo postal:");
		lblCodigoSede.setBounds(51, 81, 104, 14);
		panelSede.add(lblCodigoSede);

		JLabel lblCorreoSede = new JLabel("Codigo sede:");
		lblCorreoSede.setBounds(51, 121, 104, 14);
		panelSede.add(lblCorreoSede);

		JLabel lblTelefonoSede = new JLabel("Direccion:");
		lblTelefonoSede.setBounds(51, 157, 104, 14);
		panelSede.add(lblTelefonoSede);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 289, 732, 90);
		panelSede.add(scrollPane);

		tablaSedes = new JTable();
		tablaSedes
				.setModel(
						new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Codigo Sede", "Codigo Postal", "Direccion"
			}
		));
		scrollPane.setViewportView(tablaSedes);

		JLabel lblNewLabel_2 = new JLabel("Codigo:");
		lblNewLabel_2.setBounds(440, 128, 71, 14);
		panelSede.add(lblNewLabel_2);

		textoCodigoBusquedaSede = new JTextField();
		textoCodigoBusquedaSede.setBounds(539, 125, 205, 20);
		panelSede.add(textoCodigoBusquedaSede);
		textoCodigoBusquedaSede.setColumns(10);

		JButton btnBuscarSede = new JButton("Buscar");
		btnBuscarSede.setBackground(Color.LIGHT_GRAY);
		btnBuscarSede.setBounds(539, 193, 104, 20);
		btnBuscarSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelSede.add(btnBuscarSede);

		JButton btnActualizarsede = new JButton("Modificar");
		btnActualizarsede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizarsede.setBackground(Color.LIGHT_GRAY);
		btnActualizarsede.setBounds(659, 390, 104, 20);
		panelSede.add(btnActualizarsede);

		JButton btnCrearSede = new JButton("Crear");
		btnCrearSede.setBackground(Color.LIGHT_GRAY);
		btnCrearSede.setBounds(148, 193, 104, 20);
		btnCrearSede.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelSede.add(btnCrearSede);

		JButton btnEliminarSede = new JButton("Eliminar");
		btnEliminarSede.setBackground(Color.LIGHT_GRAY);
		btnEliminarSede.setBounds(506, 390, 104, 22);
		panelSede.add(btnEliminarSede);

		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(381, 57, 1, 167);
		panelSede.add(separator_3);

		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(419, 57, 1, 167);
		panelSede.add(separator_3_1);

		JLabel lblNewLabel_1 = new JLabel("Ingrese el codigo de la sede para realizar una busqueda");
		lblNewLabel_1.setBounds(428, 75, 317, 14);
		panelSede.add(lblNewLabel_1);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(31, 268, 732, 10);
		panelSede.add(separator_4);

		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2.setBounds(31, 57, 1, 167);
		panelSede.add(separator_3_2);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(31, 224, 351, 2);
		panelSede.add(separator_1_2);

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(31, 57, 351, 2);
		panelSede.add(separator_1_2_1);

		JSeparator separator_1_2_2_1 = new JSeparator();
		separator_1_2_2_1.setBounds(419, 57, 342, 2);
		panelSede.add(separator_1_2_2_1);

		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(31, 33, 732, 13);
		panelSede.add(separator_4_1);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/Titulo.png")));
		lblNewLabel_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(332, 0, 127, 33);
		panelSede.add(lblNewLabel_6);

		JSeparator separator_1_2_2_1_1 = new JSeparator();
		separator_1_2_2_1_1.setBounds(419, 224, 342, 2);
		panelSede.add(separator_1_2_2_1_1);

		JSeparator separator_3_1_1 = new JSeparator();
		separator_3_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1.setBounds(759, 57, 1, 167);
		panelSede.add(separator_3_1_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7
				.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/recargar.png")));
		lblNewLabel_7.setBounds(632, 390, 18, 18);
		panelSede.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8
				.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/eliminar.png")));
		lblNewLabel_8.setBounds(478, 392, 18, 18);
		panelSede.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/lupa.png")));
		lblNewLabel_9.setBounds(511, 193, 18, 18);
		panelSede.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/agregar.png")));
		lblNewLabel_10.setBounds(128, 193, 18, 18);
		panelSede.add(lblNewLabel_10);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/tienda.png")));
		lblNewLabel_16.setBounds(35, 246, 20, 20);
		panelSede.add(lblNewLabel_16);
		
		JPanel panelProducto = new JPanel();
		panelProducto.setLayout(null);
		panelProducto.setBackground(Color.WHITE);
		tabbedPane.addTab("Productos", null, panelProducto, null);
		
		JLabel lblNewLabel_11 = new JLabel("Informaci\u00F3n de los productos");
		lblNewLabel_11.setForeground(Color.DARK_GRAY);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(51, 250, 268, 14);
		panelProducto.add(lblNewLabel_11);
		
		textoStockProducto = new JTextField();
		textoStockProducto.setColumns(10);
		textoStockProducto.setBounds(195, 123, 161, 18);
		panelProducto.add(textoStockProducto);
		
		textoDescProducto = new JTextField();
		textoDescProducto.setColumns(10);
		textoDescProducto.setBounds(195, 154, 161, 18);
		panelProducto.add(textoDescProducto);
		
		JComboBox ComboBoxTipoProductos = new JComboBox();
		ComboBoxTipoProductos.setToolTipText("");
		ComboBoxTipoProductos.setBackground(Color.WHITE);
		ComboBoxTipoProductos.setBounds(195, 92, 161, 18);
		panelProducto.add(ComboBoxTipoProductos);
		
		JLabel lblCodigoSede_2 = new JLabel("Tipo:");
		lblCodigoSede_2.setBounds(51, 95, 104, 14);
		panelProducto.add(lblCodigoSede_2);
		
		JLabel lblCorreoSede_2 = new JLabel("Stock:");
		lblCorreoSede_2.setBounds(51, 128, 104, 14);
		panelProducto.add(lblCorreoSede_2);
		
		JLabel lblTelefonoSede_2 = new JLabel("Direccion:");
		lblTelefonoSede_2.setBounds(51, 157, 104, 14);
		panelProducto.add(lblTelefonoSede_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(31, 289, 732, 90);
		panelProducto.add(scrollPane_2);
		
		tablaProductos = new JTable();
		tablaProductos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nombre", "Tipo", "Descripcion", "Precio", "Stock"
			}
		));
		scrollPane_2.setViewportView(tablaProductos);
		
		JLabel lblNewLabel_2_2 = new JLabel("Codigo:");
		lblNewLabel_2_2.setBounds(430, 144, 71, 14);
		panelProducto.add(lblNewLabel_2_2);
		
		textoBusquedaProducto = new JTextField();
		textoBusquedaProducto.setColumns(10);
		textoBusquedaProducto.setBounds(539, 142, 205, 18);
		panelProducto.add(textoBusquedaProducto);
		
		JButton btnBuscarProducto = new JButton("Buscar");
		btnBuscarProducto.setBackground(Color.LIGHT_GRAY);
		btnBuscarProducto.setBounds(539, 193, 104, 20);
		panelProducto.add(btnBuscarProducto);
		
		JButton btnActualizarProducto = new JButton("Modificar");
		btnActualizarProducto.setBackground(Color.LIGHT_GRAY);
		btnActualizarProducto.setBounds(659, 390, 104, 20);
		panelProducto.add(btnActualizarProducto);
		
		JButton btnCrearProducto = new JButton("Crear");
		btnCrearProducto.setBackground(Color.LIGHT_GRAY);
		btnCrearProducto.setBounds(151, 212, 104, 20);
		panelProducto.add(btnCrearProducto);
		
		JButton btnEliminarProducto = new JButton("Eliminar");
		btnEliminarProducto.setBackground(Color.LIGHT_GRAY);
		btnEliminarProducto.setBounds(506, 390, 104, 22);
		panelProducto.add(btnEliminarProducto);
		
		JSeparator separator_3_3 = new JSeparator();
		separator_3_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_3.setBounds(381, 22, 1, 218);
		panelProducto.add(separator_3_3);
		
		JSeparator separator_3_1_2 = new JSeparator();
		separator_3_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_2.setBounds(419, 22, 1, 218);
		panelProducto.add(separator_3_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingrese el codigo del producto para realizar una busqueda");
		lblNewLabel_1_2.setBounds(426, 94, 359, 14);
		panelProducto.add(lblNewLabel_1_2);
		
		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBounds(31, 268, 732, 10);
		panelProducto.add(separator_4_2);
		
		JSeparator separator_3_2_1 = new JSeparator();
		separator_3_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_1.setBounds(31, 22, 1, 218);
		panelProducto.add(separator_3_2_1);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(31, 239, 351, 2);
		panelProducto.add(separator_1_2_2);
		
		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setBounds(31, 22, 351, 2);
		panelProducto.add(separator_1_2_1_1);
		
		JSeparator separator_1_2_2_1_2 = new JSeparator();
		separator_1_2_2_1_2.setBounds(421, 22, 342, 2);
		panelProducto.add(separator_1_2_2_1_2);
		
		JSeparator separator_1_2_2_1_1_1 = new JSeparator();
		separator_1_2_2_1_1_1.setBounds(419, 238, 342, 2);
		panelProducto.add(separator_1_2_2_1_1_1);
		
		JSeparator separator_3_1_1_1 = new JSeparator();
		separator_3_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1_1.setBounds(759, 22, 1, 218);
		panelProducto.add(separator_3_1_1_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/recargar.png")));
		lblNewLabel_7_1.setBounds(632, 390, 18, 18);
		panelProducto.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/eliminar.png")));
		lblNewLabel_8_1.setBounds(478, 392, 18, 18);
		panelProducto.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/lupa.png")));
		lblNewLabel_9_1.setBounds(511, 193, 18, 18);
		panelProducto.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("");
		lblNewLabel_10_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/agregar.png")));
		lblNewLabel_10_1.setBounds(128, 212, 18, 18);
		panelProducto.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_3 = new JLabel("Codigo:");
		lblNewLabel_3.setBounds(51, 35, 46, 14);
		panelProducto.add(lblNewLabel_3);
		
		JLabel lblNewLabel_12 = new JLabel("Nombre:");
		lblNewLabel_12.setBounds(51, 66, 61, 14);
		panelProducto.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Precio:");
		lblNewLabel_13.setBounds(51, 184, 46, 14);
		panelProducto.add(lblNewLabel_13);
		
		textoCodigoProducto = new JTextField();
		textoCodigoProducto.setBounds(195, 33, 161, 18);
		panelProducto.add(textoCodigoProducto);
		textoCodigoProducto.setColumns(10);
		
		textoNombreProducto = new JTextField();
		textoNombreProducto.setBounds(195, 62, 161, 18);
		panelProducto.add(textoNombreProducto);
		textoNombreProducto.setColumns(10);
		
		textoPrecioProducto = new JTextField();
		textoPrecioProducto.setBounds(195, 183, 161, 18);
		panelProducto.add(textoPrecioProducto);
		textoPrecioProducto.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/pro.png")));
		lblNewLabel_14.setBounds(570, 33, 50, 50);
		panelProducto.add(lblNewLabel_14);
		
		JPanel panelProveedor = new JPanel();
		panelProveedor.setLayout(null);
		panelProveedor.setBackground(Color.WHITE);
		tabbedPane.addTab("Proveedores", null, panelProveedor, null);
		
		JLabel lblNewLabel_4 = new JLabel("Informaci\u00F3n de los proveedores");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(51, 250, 268, 14);
		panelProveedor.add(lblNewLabel_4);
		
		textoApellidosProveedor = new JTextField();
		textoApellidosProveedor.setColumns(10);
		textoApellidosProveedor.setBounds(195, 107, 161, 18);
		panelProveedor.add(textoApellidosProveedor);
		
		textoCodigoProveedor = new JTextField();
		textoCodigoProveedor.setColumns(10);
		textoCodigoProveedor.setBounds(195, 162, 161, 18);
		panelProveedor.add(textoCodigoProveedor);
		
		JLabel lblCodigoSede_1 = new JLabel("Nombre:");
		lblCodigoSede_1.setBounds(51, 81, 104, 14);
		panelProveedor.add(lblCodigoSede_1);
		
		JLabel lblCorreoSede_1 = new JLabel("Apellidos:");
		lblCorreoSede_1.setBounds(51, 110, 104, 14);
		panelProveedor.add(lblCorreoSede_1);
		
		JLabel lblTelefonoSede_1 = new JLabel("Codigo:");
		lblTelefonoSede_1.setBounds(51, 164, 104, 14);
		panelProveedor.add(lblTelefonoSede_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 289, 732, 90);
		panelProveedor.add(scrollPane_1);
		
		tablaProveedores = new JTable();
		tablaProveedores.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Codigo", "Nombre", "Apellidos", "Cedula"
			}
		));
		scrollPane_1.setViewportView(tablaProveedores);
		
		JLabel lblNewLabel_2_1 = new JLabel("Codigo:");
		lblNewLabel_2_1.setBounds(440, 145, 71, 14);
		panelProveedor.add(lblNewLabel_2_1);
		
		textoBusquedaProveedor = new JTextField();
		textoBusquedaProveedor.setColumns(10);
		textoBusquedaProveedor.setBounds(540, 145, 205, 20);
		panelProveedor.add(textoBusquedaProveedor);
		
		JButton btnBuscarProveedor = new JButton("Buscar");
		btnBuscarProveedor.setBackground(Color.LIGHT_GRAY);
		btnBuscarProveedor.setBounds(539, 193, 104, 20);
		panelProveedor.add(btnBuscarProveedor);
		
		JButton btnActualizarProveedor = new JButton("Modificar");
		btnActualizarProveedor.setBackground(Color.LIGHT_GRAY);
		btnActualizarProveedor.setBounds(659, 390, 104, 20);
		panelProveedor.add(btnActualizarProveedor);
		
		JButton btnCrearProveedor = new JButton("Crear");
		btnCrearProveedor.setBackground(Color.LIGHT_GRAY);
		btnCrearProveedor.setBounds(148, 193, 104, 20);
		panelProveedor.add(btnCrearProveedor);
		
		JButton btnEliminarProveedor = new JButton("Eliminar");
		btnEliminarProveedor.setBackground(Color.LIGHT_GRAY);
		btnEliminarProveedor.setBounds(506, 390, 104, 22);
		panelProveedor.add(btnEliminarProveedor);
		
		JSeparator separator_3_4 = new JSeparator();
		separator_3_4.setOrientation(SwingConstants.VERTICAL);
		separator_3_4.setBounds(381, 57, 1, 167);
		panelProveedor.add(separator_3_4);
		
		JSeparator separator_3_1_3 = new JSeparator();
		separator_3_1_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_3.setBounds(419, 57, 1, 167);
		panelProveedor.add(separator_3_1_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese el codigo del proveedor para realizar una busqueda");
		lblNewLabel_1_1.setBounds(422, 110, 361, 14);
		panelProveedor.add(lblNewLabel_1_1);
		
		JSeparator separator_4_3 = new JSeparator();
		separator_4_3.setBounds(31, 268, 732, 10);
		panelProveedor.add(separator_4_3);
		
		JSeparator separator_3_2_2 = new JSeparator();
		separator_3_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_2.setBounds(31, 57, 1, 167);
		panelProveedor.add(separator_3_2_2);
		
		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(31, 224, 351, 2);
		panelProveedor.add(separator_1_2_3);
		
		JSeparator separator_1_2_1_2 = new JSeparator();
		separator_1_2_1_2.setBounds(31, 57, 351, 2);
		panelProveedor.add(separator_1_2_1_2);
		
		JSeparator separator_1_2_2_1_3 = new JSeparator();
		separator_1_2_2_1_3.setBounds(419, 57, 342, 2);
		panelProveedor.add(separator_1_2_2_1_3);
		
		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setBounds(31, 33, 732, 13);
		panelProveedor.add(separator_4_1_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/Titulo.png")));
		lblNewLabel_6_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(332, 0, 127, 40);
		panelProveedor.add(lblNewLabel_6_1);
		
		JSeparator separator_1_2_2_1_1_2 = new JSeparator();
		separator_1_2_2_1_1_2.setBounds(419, 224, 342, 2);
		panelProveedor.add(separator_1_2_2_1_1_2);
		
		JSeparator separator_3_1_1_2 = new JSeparator();
		separator_3_1_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1_2.setBounds(759, 57, 1, 167);
		panelProveedor.add(separator_3_1_1_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/recargar.png")));
		lblNewLabel_7_2.setBounds(632, 390, 18, 18);
		panelProveedor.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("");
		lblNewLabel_8_2.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/eliminar.png")));
		lblNewLabel_8_2.setBounds(478, 392, 18, 18);
		panelProveedor.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_9_2 = new JLabel("");
		lblNewLabel_9_2.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/lupa.png")));
		lblNewLabel_9_2.setBounds(511, 193, 18, 18);
		panelProveedor.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_10_2 = new JLabel("");
		lblNewLabel_10_2.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/agregar.png")));
		lblNewLabel_10_2.setBounds(128, 193, 18, 18);
		panelProveedor.add(lblNewLabel_10_2);
		
		textoCedulaProveedor = new JTextField();
		textoCedulaProveedor.setBounds(195, 135, 161, 18);
		panelProveedor.add(textoCedulaProveedor);
		textoCedulaProveedor.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Cedula:");
		lblNewLabel_5.setBounds(51, 135, 46, 14);
		panelProveedor.add(lblNewLabel_5);
		
		textoNombreProveedor = new JTextField();
		textoNombreProveedor.setBounds(195, 77, 161, 18);
		panelProveedor.add(textoNombreProveedor);
		textoNombreProveedor.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/proveedor.png")));
		lblNewLabel_15.setBounds(569, 63, 45, 45);
		panelProveedor.add(lblNewLabel_15);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setLayout(null);
		panelCliente.setBackground(Color.WHITE);
		tabbedPane.addTab("Cliente", null, panelCliente, null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Informaci\u00F3n de los clientes");
		lblNewLabel_4_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(51, 250, 268, 14);
		panelCliente.add(lblNewLabel_4_1);
		
		textoApellidosCliente = new JTextField();
		textoApellidosCliente.setColumns(10);
		textoApellidosCliente.setBounds(195, 107, 161, 18);
		panelCliente.add(textoApellidosCliente);
		
		textoDireccionCliente = new JTextField();
		textoDireccionCliente.setColumns(10);
		textoDireccionCliente.setBounds(195, 162, 161, 18);
		panelCliente.add(textoDireccionCliente);
		
		JLabel lblCodigoSede_1_1 = new JLabel("Nombre:");
		lblCodigoSede_1_1.setBounds(51, 81, 104, 14);
		panelCliente.add(lblCodigoSede_1_1);
		
		JLabel lblCorreoSede_1_1 = new JLabel("Apellidos:");
		lblCorreoSede_1_1.setBounds(51, 110, 104, 14);
		panelCliente.add(lblCorreoSede_1_1);
		
		JLabel lblTelefonoSede_1_1 = new JLabel("Direccion:");
		lblTelefonoSede_1_1.setBounds(51, 164, 104, 14);
		panelCliente.add(lblTelefonoSede_1_1);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(31, 289, 732, 90);
		panelCliente.add(scrollPane_1_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellidos", "Cedula", "Direccion"
			}
		));
		scrollPane_1_1.setViewportView(table);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Codigo:");
		lblNewLabel_2_1_1.setBounds(440, 145, 71, 14);
		panelCliente.add(lblNewLabel_2_1_1);
		
		textoBusquedaCliente = new JTextField();
		textoBusquedaCliente.setColumns(10);
		textoBusquedaCliente.setBounds(540, 145, 205, 20);
		panelCliente.add(textoBusquedaCliente);
		
		JButton btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.setBackground(Color.LIGHT_GRAY);
		btnBuscarCliente.setBounds(539, 193, 104, 20);
		panelCliente.add(btnBuscarCliente);
		
		JButton btnActualizarCliente = new JButton("Modificar");
		btnActualizarCliente.setBackground(Color.LIGHT_GRAY);
		btnActualizarCliente.setBounds(659, 390, 104, 20);
		panelCliente.add(btnActualizarCliente);
		
		JButton btnCrearCliente = new JButton("Crear");
		btnCrearCliente.setBackground(Color.LIGHT_GRAY);
		btnCrearCliente.setBounds(148, 193, 104, 20);
		panelCliente.add(btnCrearCliente);
		
		JButton btnEliminarCliente = new JButton("Eliminar");
		btnEliminarCliente.setBackground(Color.LIGHT_GRAY);
		btnEliminarCliente.setBounds(506, 390, 104, 22);
		panelCliente.add(btnEliminarCliente);
		
		JSeparator separator_3_4_1 = new JSeparator();
		separator_3_4_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_4_1.setBounds(381, 57, 1, 167);
		panelCliente.add(separator_3_4_1);
		
		JSeparator separator_3_1_3_1 = new JSeparator();
		separator_3_1_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_3_1.setBounds(419, 57, 1, 167);
		panelCliente.add(separator_3_1_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ingrese la cedula del cliente para realizar una busqueda");
		lblNewLabel_1_1_1.setBounds(428, 110, 317, 14);
		panelCliente.add(lblNewLabel_1_1_1);
		
		JSeparator separator_4_3_1 = new JSeparator();
		separator_4_3_1.setBounds(31, 268, 732, 10);
		panelCliente.add(separator_4_3_1);
		
		JSeparator separator_3_2_2_1 = new JSeparator();
		separator_3_2_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_2_1.setBounds(31, 57, 1, 167);
		panelCliente.add(separator_3_2_2_1);
		
		JSeparator separator_1_2_3_1 = new JSeparator();
		separator_1_2_3_1.setBounds(31, 224, 351, 2);
		panelCliente.add(separator_1_2_3_1);
		
		JSeparator separator_1_2_1_2_1 = new JSeparator();
		separator_1_2_1_2_1.setBounds(31, 57, 351, 2);
		panelCliente.add(separator_1_2_1_2_1);
		
		JSeparator separator_1_2_2_1_3_1 = new JSeparator();
		separator_1_2_2_1_3_1.setBounds(419, 57, 342, 2);
		panelCliente.add(separator_1_2_2_1_3_1);
		
		JSeparator separator_4_1_1_1 = new JSeparator();
		separator_4_1_1_1.setBounds(31, 33, 732, 13);
		panelCliente.add(separator_4_1_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/Titulo.png")));
		lblNewLabel_6_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1_1.setBounds(332, 0, 127, 34);
		panelCliente.add(lblNewLabel_6_1_1);
		
		JSeparator separator_1_2_2_1_1_2_1 = new JSeparator();
		separator_1_2_2_1_1_2_1.setBounds(419, 224, 342, 2);
		panelCliente.add(separator_1_2_2_1_1_2_1);
		
		JSeparator separator_3_1_1_2_1 = new JSeparator();
		separator_3_1_1_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1_2_1.setBounds(759, 57, 1, 167);
		panelCliente.add(separator_3_1_1_2_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("");
		lblNewLabel_7_2_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/recargar.png")));
		lblNewLabel_7_2_1.setBounds(632, 390, 18, 18);
		panelCliente.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("");
		lblNewLabel_8_2_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/eliminar.png")));
		lblNewLabel_8_2_1.setBounds(478, 392, 18, 18);
		panelCliente.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("");
		lblNewLabel_9_2_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/lupa.png")));
		lblNewLabel_9_2_1.setBounds(511, 193, 18, 18);
		panelCliente.add(lblNewLabel_9_2_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("");
		lblNewLabel_10_2_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/agregar.png")));
		lblNewLabel_10_2_1.setBounds(128, 193, 18, 18);
		panelCliente.add(lblNewLabel_10_2_1);
		
		textoCedulaCliente = new JTextField();
		textoCedulaCliente.setColumns(10);
		textoCedulaCliente.setBounds(195, 135, 161, 18);
		panelCliente.add(textoCedulaCliente);
		
		JLabel lblNewLabel_5_1 = new JLabel("Cedula:");
		lblNewLabel_5_1.setBounds(51, 135, 46, 14);
		panelCliente.add(lblNewLabel_5_1);
		
		textoNombreCliente = new JTextField();
		textoNombreCliente.setColumns(10);
		textoNombreCliente.setBounds(195, 77, 161, 18);
		panelCliente.add(textoNombreCliente);
		
		JLabel lblNewLabel_15_1 = new JLabel("");
		lblNewLabel_15_1.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/usuario.png")));
		lblNewLabel_15_1.setBounds(569, 63, 45, 45);
		panelCliente.add(lblNewLabel_15_1);
		
		JPanel panelCarrito = new JPanel();
		panelCarrito.setLayout(null);
		panelCarrito.setBackground(Color.WHITE);
		tabbedPane.addTab("Carrito", null, panelCarrito, null);
		
		JLabel lblInformacinDelCarrito = new JLabel("Informaci\u00F3n del carrito");
		lblInformacinDelCarrito.setForeground(Color.DARK_GRAY);
		lblInformacinDelCarrito.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInformacinDelCarrito.setBounds(61, 250, 268, 14);
		panelCarrito.add(lblInformacinDelCarrito);
		
		textoFechaCarrito = new JTextField();
		textoFechaCarrito.setColumns(10);
		textoFechaCarrito.setBounds(195, 154, 161, 20);
		panelCarrito.add(textoFechaCarrito);
		
		JLabel lblNumeroCarrito = new JLabel("Numero Carrito:");
		lblNumeroCarrito.setBounds(51, 81, 104, 14);
		panelCarrito.add(lblNumeroCarrito);
		
		JLabel lblCedulaCliente = new JLabel("Cedula Cliente:");
		lblCedulaCliente.setBounds(51, 121, 104, 14);
		panelCarrito.add(lblCedulaCliente);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(51, 157, 104, 14);
		panelCarrito.add(lblFecha);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(31, 289, 732, 90);
		panelCarrito.add(scrollPane_3);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Num Carrito", "Cliente", "Fecha", "Costo Total"
			}
		));
		scrollPane_3.setViewportView(table_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Numero Carrito:");
		lblNewLabel_2_3.setBounds(430, 128, 127, 14);
		panelCarrito.add(lblNewLabel_2_3);
		
		textoBusquedaCarrito = new JTextField();
		textoBusquedaCarrito.setColumns(10);
		textoBusquedaCarrito.setBounds(539, 125, 205, 20);
		panelCarrito.add(textoBusquedaCarrito);
		
		JButton btnBuscarCarrito = new JButton("Buscar");
		btnBuscarCarrito.setBackground(Color.LIGHT_GRAY);
		btnBuscarCarrito.setBounds(539, 193, 104, 20);
		panelCarrito.add(btnBuscarCarrito);
		
		JButton btnActualizarCarrito = new JButton("Modificar");
		btnActualizarCarrito.setBackground(Color.LIGHT_GRAY);
		btnActualizarCarrito.setBounds(659, 390, 104, 20);
		panelCarrito.add(btnActualizarCarrito);
		
		JButton btnCrearCarrito = new JButton("Crear");
		btnCrearCarrito.setBackground(Color.LIGHT_GRAY);
		btnCrearCarrito.setBounds(148, 193, 104, 20);
		panelCarrito.add(btnCrearCarrito);
		
		JButton btnEliminarCarrito = new JButton("Eliminar");
		btnEliminarCarrito.setBackground(Color.LIGHT_GRAY);
		btnEliminarCarrito.setBounds(506, 390, 104, 22);
		panelCarrito.add(btnEliminarCarrito);
		
		JSeparator separator_3_5 = new JSeparator();
		separator_3_5.setOrientation(SwingConstants.VERTICAL);
		separator_3_5.setBounds(381, 57, 1, 167);
		panelCarrito.add(separator_3_5);
		
		JSeparator separator_3_1_4 = new JSeparator();
		separator_3_1_4.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_4.setBounds(419, 57, 1, 167);
		panelCarrito.add(separator_3_1_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingrese el numero del carrito para realizar una busqueda");
		lblNewLabel_1_3.setBounds(427, 75, 371, 14);
		panelCarrito.add(lblNewLabel_1_3);
		
		JSeparator separator_4_4 = new JSeparator();
		separator_4_4.setBounds(31, 268, 732, 10);
		panelCarrito.add(separator_4_4);
		
		JSeparator separator_3_2_3 = new JSeparator();
		separator_3_2_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_2_3.setBounds(31, 57, 1, 167);
		panelCarrito.add(separator_3_2_3);
		
		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(31, 224, 351, 2);
		panelCarrito.add(separator_1_2_4);
		
		JSeparator separator_1_2_1_3 = new JSeparator();
		separator_1_2_1_3.setBounds(31, 57, 351, 2);
		panelCarrito.add(separator_1_2_1_3);
		
		JSeparator separator_1_2_2_1_4 = new JSeparator();
		separator_1_2_2_1_4.setBounds(419, 57, 342, 2);
		panelCarrito.add(separator_1_2_2_1_4);
		
		JSeparator separator_4_1_2 = new JSeparator();
		separator_4_1_2.setBounds(31, 33, 732, 13);
		panelCarrito.add(separator_4_1_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/Titulo.png")));
		lblNewLabel_6_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(334, 0, 127, 34);
		panelCarrito.add(lblNewLabel_6_2);
		
		JSeparator separator_1_2_2_1_1_3 = new JSeparator();
		separator_1_2_2_1_1_3.setBounds(419, 224, 342, 2);
		panelCarrito.add(separator_1_2_2_1_1_3);
		
		JSeparator separator_3_1_1_3 = new JSeparator();
		separator_3_1_1_3.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1_3.setBounds(759, 57, 1, 167);
		panelCarrito.add(separator_3_1_1_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("");
		lblNewLabel_7_3.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/recargar.png")));
		lblNewLabel_7_3.setBounds(632, 390, 18, 18);
		panelCarrito.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_8_3 = new JLabel("");
		lblNewLabel_8_3.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/eliminar.png")));
		lblNewLabel_8_3.setBounds(478, 392, 18, 18);
		panelCarrito.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_9_3 = new JLabel("");
		lblNewLabel_9_3.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/lupa.png")));
		lblNewLabel_9_3.setBounds(511, 193, 18, 18);
		panelCarrito.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_10_3 = new JLabel("");
		lblNewLabel_10_3.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/agregar.png")));
		lblNewLabel_10_3.setBounds(128, 193, 18, 18);
		panelCarrito.add(lblNewLabel_10_3);
		
		textoNumeroCarrito = new JTextField();
		textoNumeroCarrito.setBounds(195, 78, 161, 20);
		panelCarrito.add(textoNumeroCarrito);
		textoNumeroCarrito.setColumns(10);
		
		JComboBox comboBoxCedulaClienteCarrito = new JComboBox();
		comboBoxCedulaClienteCarrito.setBackground(new Color(255, 255, 255));
		comboBoxCedulaClienteCarrito.setBounds(195, 117, 161, 22);
		panelCarrito.add(comboBoxCedulaClienteCarrito);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/co/edu/uniquindio/inconos/carrito-de-compras.png")));
		lblNewLabel_17.setBounds(31, 246, 20, 20);
		panelCarrito.add(lblNewLabel_17);
	}
}
