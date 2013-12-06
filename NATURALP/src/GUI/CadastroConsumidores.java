package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroConsumidores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroConsumidores frame = new CadastroConsumidores();
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
	public CadastroConsumidores() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnCadastroDeCliente = new JToggleButton("Cadastro de Cliente");
		tglbtnCadastroDeCliente.setBounds(5, 5, 424, 31);
		tglbtnCadastroDeCliente.setFont(new Font("Arial Black", Font.PLAIN, 16));
		contentPane.add(tglbtnCadastroDeCliente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(15, 47, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(15, 72, 54, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(15, 97, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(15, 122, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(15, 147, 46, 14);
		contentPane.add(lblCep);
		
		textField = new JTextField();
		textField.setBounds(71, 47, 353, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 69, 353, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(71, 94, 135, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(71, 119, 135, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(71, 144, 135, 20);
		contentPane.add(textField_4);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(15, 172, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(56, 168, 36, 23);
		contentPane.add(rdbtnF);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(97, 168, 36, 23);
		contentPane.add(rdbtnM);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(216, 97, 54, 14);
		contentPane.add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setBounds(280, 94, 108, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(216, 122, 46, 14);
		contentPane.add(lblCidade);
		
		textField_6 = new JTextField();
		textField_6.setBounds(280, 119, 108, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(216, 147, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		comboBox.setBounds(280, 144, 46, 20);
		contentPane.add(comboBox);
		
		JButton btnSalvar = new JButton("Salvar");
		
		
		btnSalvar.setBounds(291, 213, 89, 23);
		contentPane.add(btnSalvar);
	}
}
