import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorTemperaturas extends JFrame {

	private JPanel contentPane;

	private final double Celsius = 18.37;
	private final double Fahrenheit = 19.46;
	private final double Kelvin = 22.08;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperaturas frame = new ConversorTemperaturas();
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
	public ConversorTemperaturas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 338, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija la temperatura que desea convertir:");
		lblNewLabel.setBounds(31, 28, 259, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----Selecciona-----", "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Celsius a Kelvin", "De Kelvin a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit"}));
		comboBox.setBounds(31, 53, 259, 22);
		contentPane.add(comboBox);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (comboBox.getSelectedItem() == "De Celsius a Fahrenheit") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " C° a " + ((Double.parseDouble(valor) * 9/5) + 32)  + " Fahrenheit");
						
					} else if (comboBox.getSelectedItem() == "De Fahrenheit a Celsius") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " F° a " + ((Double.parseDouble(valor) - 32) * 5/9) + " Celsius");
						
					} else if (comboBox.getSelectedItem() == "De Celsius a Kelvin") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " C° a " + (Double.parseDouble(valor) + 273.15) + " Kelvin");
						
					} else if (comboBox.getSelectedItem() == "De Kelvin a Celsius") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " K° a " + (Double.parseDouble(valor) - 273.15) + " Celsius");
						
					} else if (comboBox.getSelectedItem() == "De Fahrenheit a Kelvin") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " F° a " + ((Double.parseDouble(valor) - 32) * 5/9 + 273.15) + " Kelvin");
						
					} else if (comboBox.getSelectedItem() == "De Kelvin a Fahrenheit") {
						String valor = JOptionPane.showInputDialog("Ingrese los grados a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: " + valor + " K° a " + ((Double.parseDouble(valor) - 273.15) * 9/5 + 32) + " Fahrenheit");
						
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnAceptar.setBounds(31, 86, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mpl = new MenuPrincipal();
				mpl.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(201, 86, 89, 23);
		contentPane.add(btnRegresar);
	}
}
