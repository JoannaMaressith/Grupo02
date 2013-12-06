package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pedido extends JFrame {

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
					Pedido frame = new Pedido();
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
	public Pedido() {
		setTitle("Pedido");
		setBounds(100, 100, 630, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 21, 46, 14);
		contentPane.add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(80, 18, 409, 20);
		contentPane.add(comboBox);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 71, 46, 14);
		contentPane.add(lblProduto);
		
		JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.setBounds(80, 68, 409, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 116, 70, 14);
		contentPane.add(lblQuantidade);
		
		JComboBox comboBox_2 = new JComboBox();
		
		
		comboBox_2.setBounds(80, 113, 70, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblValorUnitrio = new JLabel("Valor unit\u00E1rio:");
		lblValorUnitrio.setBounds(185, 116, 88, 14);
		contentPane.add(lblValorUnitrio);
		
		textField = new JTextField();
		textField.setBounds(269, 113, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(10, 287, 70, 14);
		contentPane.add(lblValorTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 284, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFinalisarPedido = new JButton("Finalizar pedido");
		btnFinalisarPedido.setBounds(388, 347, 140, 23);
		contentPane.add(btnFinalisarPedido);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
		lblFormaDePagamento.setBounds(10, 322, 119, 14);
		contentPane.add(lblFormaDePagamento);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBounds(145, 313, 70, 23);
		contentPane.add(rdbtnDinheiro);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cart\u00E3o");
		rdbtnNewRadioButton.setBounds(230, 313, 70, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(61, 347, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel label = new JLabel("Produto:");
		label.setBounds(10, 180, 46, 14);
		contentPane.add(label);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(80, 177, 409, 20);
		contentPane.add(comboBox_3);
		
		JLabel label_1 = new JLabel("Quantidade:");
		label_1.setBounds(10, 227, 70, 14);
		contentPane.add(label_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(80, 224, 70, 20);
		contentPane.add(comboBox_4);
		
		JLabel label_2 = new JLabel("Valor unit\u00E1rio:");
		label_2.setBounds(185, 227, 88, 14);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(269, 224, 86, 20);
		contentPane.add(textField_2);
	}
}
