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

import UtilTeste.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","Nome", "Endereço", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "CPF", "Sexo" }));
		comboBox.setBounds(27, 27, 144, 20);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(208, 27, 301, 20);
		contentPane.add(textField);
		textField.setColumns(10);




		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente clie = new Cliente();
				//esta linha deve conter conexão do db com a tela
				String aux = (String)comboBox.getSelectedItem();

				if(aux.equals("")){
					JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada.");
				}else{
					if(aux.equals("Nome")){
						String aux2 = textField.getText();
						if(aux2.equals("")){
							JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
						}else{
							//linha que deve constar consulta e compara no arraylist / bd
							JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
						}
					}
					else{
						if(aux.equals("Endereço")){
							String aux2 = textField.getText();
							if(aux2.equals("")){
								JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
							}else{
								//linha que deve constar consulta e compara no arraylist / bd
								JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
							}
						}else{
							if(aux.equals("Bairro")){
								String aux2 = textField.getText();
								if(aux2.equals("")){
									JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
								}else{
									//linha que deve constar consulta e compara no arraylist / bd
									JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
								}
							} else{
								if(aux.equals("Cidade")){
									String aux2 = textField.getText();
									if(aux2.equals("")){
										JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
									}else{
										//linha que deve constar consulta e compara no arraylist / bd
										JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
									}
								}else{
									if(aux.equals("Estado")){
										String aux2 = textField.getText();
										if(aux2.equals("")){
											JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
										}else{
											//linha que deve constar consulta e compara no arraylist / bd
											JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
										}
									}else{
										if(aux.equals("CEP")){
											String aux2 = textField.getText();
											if(aux2.equals("")){
												JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
											}else{
												//linha que deve constar consulta e compara no arraylist / bd
												JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
											}
										}else{
											if(aux.equals("Telefone")){
												String aux2 = textField.getText();
												if(aux2.equals("")){
													JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
												}else{
													//linha que deve constar consulta e compara no arraylist / bd
													JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
												}
											}else{
												if(aux.equals("CPF")){
													String aux2 = textField.getText();
													if(aux2.equals("")){
														JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
													}else{
														//linha que deve constar consulta e compara no arraylist / bd
														JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
													}
												}else{
													if(aux.equals("Sexo")){
														String aux2 = textField.getText();
														if(aux2.equals("")){
															JOptionPane.showMessageDialog(null, "Nenhuma informação foi inserida.");
														}else{
															//linha que deve constar consulta e compara no arraylist / bd
															JOptionPane.showMessageDialog(null, "Dados do cliente: ...");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}


			}
		});
		btnProcurar.setBounds(318, 150, 89, 23);
		contentPane.add(btnProcurar);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroConsumidores cad = new CadastroConsumidores();
				cad.setVisible(true);

			}
		});
		btnNovo.setBounds(318, 202, 89, 23);
		contentPane.add(btnNovo);
	}

}
