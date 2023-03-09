import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione una opción de conversión:");
		lblNewLabel.setBounds(51, 103, 253, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor Monedas", "Conversor Temperaturas"}));
		comboBox.setBounds(73, 128, 199, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (comboBox.getSelectedItem() == "Conversor Monedas") {
						ConversorMonedas cms = new ConversorMonedas();
						cms.setVisible(true);
						dispose();
					} else if (comboBox.getSelectedItem() == "Conversor Temperaturas") {
						ConversorTemperaturas cts = new ConversorTemperaturas();
						cts.setVisible(true);
						dispose();
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
			}
		});
		btnNewButton.setBounds(84, 176, 178, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenidos/as al programa de Conversiones en Java");
		lblNewLabel_1.setBounds(25, 41, 303, 14);
		contentPane.add(lblNewLabel_1);
	}
}
