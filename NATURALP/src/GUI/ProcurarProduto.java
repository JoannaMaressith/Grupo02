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

public class ProcurarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcurarProduto frame = new ProcurarProduto();
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
	public ProcurarProduto() {
		setTitle("Procurar Produto");
		setBounds(100, 100, 554, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nome do produto", "Tipo de produto", "Preço"}));
		comboBox.setBounds(34, 23, 152, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(197, 23, 332, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(367, 172, 88, 23);
		contentPane.add(btnProcurar);
	}
}
