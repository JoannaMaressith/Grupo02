package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import UtilTeste.*;

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

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","Nome do produto", "Tipo de produto", "Preço"}));
		comboBox.setBounds(34, 23, 152, 20);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(197, 23, 332, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()==null)
					return;

				Produto prod = new Produto();
				//esta linha deve conter conexão do db com a tela

				String aux = (String)comboBox.getSelectedItem();
				if(aux.equals("Nome do produto")){
					String aux2 = textField.getText();
					if(aux.equals("")){
						JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserido");
					}else{
						//linha que deve constar consulta e compara no arraylist / bd
						JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
					}
				}else{
					if(aux.equals("Tipo de produto")){
						String aux2 = textField.getText();
						if(aux2.equals("")){
							JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
						}else{
							//linha que deve constar consulta e compara no arraylist / bd
							JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
						}
					}else{
						if(aux.equals("Preço")){
							String aux2 = textField.getText();
							if(aux2.equals("")){
								JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
							}else{
								//linha que deve constar consulta e compara no arraylist / bd
								JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
							}
						}else{
							JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada.");
						}

					}

				}

			}
		});

		btnProcurar.setBounds(366, 172, 88, 23);
		contentPane.add(btnProcurar);
		
		JButton btnNewButton = new JButton("Novo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				CadastroProduto cadp = new CadastroProduto();
				cadp.setVisible(true);
			}
		});
		btnNewButton.setBounds(366, 206, 89, 23);
		contentPane.add(btnNewButton);
	}
}
