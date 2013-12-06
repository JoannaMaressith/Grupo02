package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ProcurarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcurarCliente frame = new ProcurarCliente();
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
	public ProcurarCliente() {
		setTitle("Procurar Cliente");
		setBounds(100, 100, 533, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nome", "Endereço", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "CPF", "Sexo" }));
		comboBox.setBounds(27, 27, 144, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(208, 27, 301, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(319, 190, 89, 23);
		contentPane.add(btnProcurar);
	}

}
