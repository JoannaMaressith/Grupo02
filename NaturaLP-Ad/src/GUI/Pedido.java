package GUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import UtilTeste.Cliente;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_6;

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
		double a=0,b=0,c=0;
		setTitle("Pedido");
		setBounds(100, 100, 630, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 21, 46, 14);
		contentPane.add(lblCliente);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 71, 46, 14);
		contentPane.add(lblProduto);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 116, 70, 14);
		contentPane.add(lblQuantidade);

		JLabel lblValorUnitrio = new JLabel("Valor unit\u00E1rio:");
		lblValorUnitrio.setBounds(185, 116, 88, 14);
		contentPane.add(lblValorUnitrio);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento para chamar valor unitario do BD/arraylist
			}
		});
		textField.setEditable(false);
		textField.setBounds(269, 113, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setBounds(10, 287, 70, 14);
		contentPane.add(lblValorTotal);

		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento:");
		lblFormaDePagamento.setBounds(269, 287, 119, 14);
		contentPane.add(lblFormaDePagamento);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(54, 373, 89, 23);
		contentPane.add(btnCancelar);

		JLabel label = new JLabel("Produto:");
		label.setBounds(10, 180, 46, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Quantidade:");
		label_1.setBounds(10, 227, 70, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Valor unit\u00E1rio:");
		label_2.setBounds(185, 227, 88, 14);
		contentPane.add(label_2);

		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento para receber valor do BD/ arraylist

			}
		});

		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(269, 224, 86, 20);
		contentPane.add(textField_2);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProcurarCliente cad = new ProcurarCliente();
				cad.setVisible(true);

			}
		});
		btnPesquisar.setBounds(493, 17, 89, 23);
		contentPane.add(btnPesquisar);


		JButton button = new JButton("Pesquisar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcurarProduto pp =new ProcurarProduto();
				pp.setVisible(true);
			}			
		});
		button.setBounds(493, 67, 89, 23);
		contentPane.add(button);

		JButton button_1 = new JButton("Pesquisar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcurarProduto pp =new ProcurarProduto();
				pp.setVisible(true);
			}			
		});

		button_1.setBounds(493, 176, 89, 23);
		contentPane.add(button_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 113, 86, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 224, 86, 20);
		contentPane.add(textField_4);



		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento para chamar do BD/arraylist o nome do cliente
			}
		});
		textField_1.setBounds(80, 18, 377, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento para chamar do BD/arraylist o nome do produto
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(80, 68, 377, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento para chamar do BD/arraylist o nome do produto
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(80, 177, 377, 20);
		contentPane.add(textField_6);

		c=a+b;
		JLabel lblNewLabel = new JLabel("R$ "+c);
		lblNewLabel.setBounds(80, 287, 119, 14);
		contentPane.add(lblNewLabel);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"","Dinheiro","Cartão de crédito", "Cartão de débito" }));
		comboBox_2.setBounds(403, 284, 130, 20);
		contentPane.add(comboBox_2);

		JButton btnFinalisarPedido = new JButton("Finalizar pedido");
		btnFinalisarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = (String)comboBox_2.getSelectedItem();
				double a,b,c,d;

				if(textField==null){
					a=0;
				}else{
					a = Double.parseDouble(textField.getText());
				}
				if(textField_2==null){
					b=0;					
				}else{
					b = Double.parseDouble(textField_2.getText());
				}
				if(textField_3==null){
					c=0;
				}else{
					c=Double.parseDouble(textField_3.getText());
				}
				if(textField_4==null){
					d=0;
				}else{
					d= Double.parseDouble(textField_4.getText());
				}

				double i=a*c+b*d;

				if(aux.equals("")){
					JOptionPane.showMessageDialog(null, "Nenhuma opção de pagamento foi selecionada.");
				}else{
					JOptionPane.showMessageDialog(null, "Total do pagamento em "+aux+" é R$: "+c+".");
				}
			}
		});
		btnFinalisarPedido.setBounds(393, 373, 140, 23);
		contentPane.add(btnFinalisarPedido);
	}
}
