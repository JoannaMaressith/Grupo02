package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class Splash extends JFrame {

	private JPanel contentPane;
	private  static JProgressBar progressBar = new JProgressBar();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Splash sp = new Splash();
		sp.setVisible(true);
		carregar();
		
	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
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
	}
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.RED);
		progressBar.setForeground(Color.WHITE);
		progressBar.setStringPainted(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\J\u00F4Marry\\Desktop\\natura_logo.jpg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(progressBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 218, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public static void carregar(){
		for (int i =0; i<=100;i++){
			try {
				Thread.sleep(50);
				progressBar.setValue(i);
			} catch (InterruptedException e) {
				JOptionPane.showConfirmDialog(null, "Tente novamente"+e.getMessage()); // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}
	
}
