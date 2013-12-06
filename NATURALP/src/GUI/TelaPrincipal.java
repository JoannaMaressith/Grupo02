package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Consultora Natura");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 672, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroConsumidores cad = new CadastroConsumidores();
				cad.setVisible(true);
			
			}
		});
		btnCadastrarCliente.setBounds(2, 5, 141, 62);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnCadProduto = new JButton("Cadastrar Produto");
		btnCadProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				CadastroProduto cadp = new CadastroProduto();
				cadp.setVisible(true);
			}
		});
		btnCadProduto.setBounds(2, 72, 141, 62);
		contentPane.add(btnCadProduto);
		
		JButton btnConsultaCliente = new JButton("Consultar Cliente");
		btnConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ProcurarCliente cad_p = new ProcurarCliente();
				cad_p.setVisible(true);
			
			}
			});
		btnConsultaCliente.setBounds(2, 139, 141, 62);
		contentPane.add(btnConsultaCliente);
		
		JButton btnConsultarProduto = new JButton("Consultar Produto");
		btnConsultarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcurarProduto pp =new ProcurarProduto();
				pp.setVisible(true);
			}
		});
		btnConsultarProduto.setBounds(2, 206, 141, 62);
		contentPane.add(btnConsultarProduto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\J\u00F4Marry\\Desktop\\natura-2012.jpg"));
		lblNewLabel.setBounds(165, -4, 500, 352);
		contentPane.add(lblNewLabel);
		
		JButton btnFazerPedido = new JButton("Fazer pedido");
		btnFazerPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Pedido p =new Pedido();
				p.setVisible(true);
			}
		});
		btnFazerPedido.setBounds(2, 273, 141, 62);
		contentPane.add(btnFazerPedido);
	}
	
}

