package datos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;

public class DatosES extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtAnioNacimiento;
	private JTextField txtPeso;
	private JButton btnProcesar;
	private JLabel textPane;
	private JTextField textMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosES frame = new DatosES();
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
	public DatosES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		lblNombre.setBounds(27, 41, 156, 30);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel_1 = new JLabel("Año de nacimiento");
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(27, 81, 156, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Peso en kilogramos");
		lblNewLabel_2.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(29, 121, 154, 30);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(193, 48, 155, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAnioNacimiento = new JTextField();
		txtAnioNacimiento.setBounds(193, 85, 155, 26);
		contentPane.add(txtAnioNacimiento);
		txtAnioNacimiento.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(193, 125, 155, 26);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		btnProcesar = new JButton("PROCESAR");
		btnProcesar.setFont(new Font("Britannic Bold", Font.PLAIN, 14));
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(358, 47, 105, 41);
		contentPane.add(btnProcesar);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Britannic Bold", Font.PLAIN, 14));
		btnLimpiar.setBounds(358, 116, 105, 41);
		contentPane.add(btnLimpiar);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(27, 167, 436, 100);
		contentPane.add(textPane);
		
		textMostrar = new JTextField();
		textMostrar.setBounds(27, 299, 427, 114);
		contentPane.add(textMostrar);
		textMostrar.setColumns(10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			handleBtnProcesarActionPerformed(e);
		}
	}
	protected void handleBtnProcesarActionPerformed(ActionEvent e) {
		String nombre = txtNombre.getText();
		int anio = Integer.parseInt(txtAnioNacimiento.getText());
		double peso = Double.parseDouble(txtPeso.getText());

		textMostrar.setText("Datos Ingresados mi King \n\n");
		textMostrar.append("Nombre : " +nombre+" \n");
		textMostrar.append("Nombre : " +anio+" \n");
		textMostrar.append("Nombre : " +peso+" \n");
	}
}
