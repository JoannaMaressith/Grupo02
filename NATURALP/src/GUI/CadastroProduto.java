package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setTitle("Cadastro de Produto");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto:");
		lblNomeDoProduto.setBounds(10, 24, 93, 14);
		contentPane.add(lblNomeDoProduto);
		
		JLabel lblTipoDeProduto = new JLabel("Tipo de produto:");
		lblTipoDeProduto.setBounds(10, 49, 93, 14);
		contentPane.add(lblTipoDeProduto);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(10, 74, 46, 14);
		contentPane.add(lblPreo);
		
		textField = new JTextField();
		textField.setBounds(113, 21, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 46, 194, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 71, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(71, 180, 99, 55);
		contentPane.add(btnSalvar);
		
		JButton btnSair = new JButton("Cancelar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
						dispose();
			}
		});
		btnSair.setBounds(241, 180, 99, 55);
		contentPane.add(btnSair);
	}
}
