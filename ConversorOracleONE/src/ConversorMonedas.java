import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorMonedas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorMonedas frame = new ConversorMonedas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private final double pesoMexico = 18.37;
	private final double pesoMexicoE = 19.46;
	private final double pesoMexicoL = 22.08;
	private final double dolar = 0.054;
	private final double euro = 0.051;
	private final double libra = 0.045;
	private final double yenJapones = 7.33;
	private final double wonCoreano = 0.014;
	
	/**
	 * Create the frame.
	 */
	public ConversorMonedas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija la moneda que deseas convertir tu dinero:");
		lblNewLabel.setBounds(10, 21, 284, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----Selecciona-----", "De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euros a Pesos", "De Libras a Pesos"}));
		comboBox.setBounds(10, 46, 284, 22);
		contentPane.add(comboBox);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {				
					if (comboBox.getSelectedItem() == "De Pesos a Dolar") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: $ " + (Double.parseDouble(valor) * dolar) + " Dolares");
					} else if (comboBox.getSelectedItem() == "De Pesos a Euros") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: € " + (Double.parseDouble(valor) * euro) + " Euros");
						
					} else if (comboBox.getSelectedItem() == "De Pesos a Libras") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: £ " + (Double.parseDouble(valor) * libra) + " Libras");
						
					} else if (comboBox.getSelectedItem() == "De Pesos a Yen") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: ¥ " + (Double.parseDouble(valor) * yenJapones) + " Yenes");
						
					} else if (comboBox.getSelectedItem() == "De Pesos a Won Coreano") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: ₩ " + (Double.parseDouble(valor) * wonCoreano) + " Wones");
						
					} else if (comboBox.getSelectedItem() == "De Dolar a Pesos") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: $ " + (pesoMexico * Double.parseDouble(valor)) + " Pesos");
						
					} else if (comboBox.getSelectedItem() == "De Euros a Pesos") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: $ " + (pesoMexicoE * Double.parseDouble(valor)) + " Pesos");
						
					} else if (comboBox.getSelectedItem() == "De Libras a Pesos") {
						String valor = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
						JOptionPane.showMessageDialog(null, "El resultado es: $ " + (pesoMexicoL * Double.parseDouble(valor)) + " Pesos");
					}
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnAceptar.setBounds(10, 79, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal mpl = new MenuPrincipal();
				mpl.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(205, 79, 89, 23);
		contentPane.add(btnRegresar);
	}
}
