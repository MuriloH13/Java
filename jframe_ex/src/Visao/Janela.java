package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfPrimeiroNome;
	private JTextField txtfSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtSobrenome = new JLabel("Sobrenome:");
		txtSobrenome.setBounds(10, 87, 72, 14);
		contentPane.add(txtSobrenome);
		
		JLabel txtPrimeiroNome = new JLabel("Primeiro Nome:");
		txtPrimeiroNome.setBounds(10, 24, 72, 14);
		contentPane.add(txtPrimeiroNome);
		
		txtfPrimeiroNome = new JTextField();
		txtfPrimeiroNome.setBounds(84, 21, 86, 20);
		contentPane.add(txtfPrimeiroNome);
		txtfPrimeiroNome.setColumns(10);
		
		txtfSobrenome = new JTextField();
		txtfSobrenome.setBounds(84, 84, 86, 20);
		contentPane.add(txtfSobrenome);
		txtfSobrenome.setColumns(10);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(154, 148, 134, 23);
		contentPane.add(btnCadastro);
		
		String nome = txtPrimeiroNome.getText();
		String sobrenome = txtSobrenome.getText();
		
		if(nome.isEmpty() || sobrenome.isEmpty()) {
			JOptionPane.showInternalMessageDialog(null,"Preencha todos os campos!");
		}
	}
}
