package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastros extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textClassificacao;
	private JTextField txtIdade;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastros frame = new Cadastros();
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
	public Cadastros() {
		setTitle("EventApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlText);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		
		textNome.setBackground(SystemColor.menu);
		textNome.setBounds(255, 45, 157, 20);
		
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textClassificacao = new JTextField();
		textClassificacao.setBackground(SystemColor.menu);
		textClassificacao.setColumns(10);
		textClassificacao.setBounds(255, 101, 157, 20);
		contentPane.add(textClassificacao);
		
		txtIdade = new JTextField();
		txtIdade.setBackground(SystemColor.menu);
		txtIdade.setColumns(10);
		txtIdade.setBounds(255, 157, 157, 20);
		contentPane.add(txtIdade);
		
		txtTelefone = new JTextField();
		txtTelefone.setBackground(SystemColor.menu);
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(255, 213, 157, 20);
		contentPane.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(SystemColor.menu);
		txtEmail.setColumns(10);
		txtEmail.setBounds(255, 263, 157, 20);
		contentPane.add(txtEmail);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(SystemColor.text);
		lblNome.setBounds(310, 20, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblClassificacão = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificacão.setForeground(SystemColor.controlLtHighlight);
		lblClassificacão.setBounds(292, 76, 73, 14);
		contentPane.add(lblClassificacão);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setForeground(SystemColor.controlLtHighlight);
		lblIdade.setBounds(310, 132, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(SystemColor.controlLtHighlight);
		lblTelefone.setBounds(310, 188, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(SystemColor.controlLtHighlight);
		lblEmail.setBounds(310, 238, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setForeground(SystemColor.controlLtHighlight);
		lblEndereco.setBounds(310, 286, 46, 14);
		contentPane.add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBackground(SystemColor.menu);
		txtEndereco.setBounds(255, 311, 157, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cadastros.class.getResource("/app/eficialapp.png")));
		lblNewLabel.setBounds(39, 34, 196, 144);
		contentPane.add(lblNewLabel);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			
			}
		});
		btnContinuar.setBackground(SystemColor.activeCaption);
		btnContinuar.setForeground(SystemColor.desktop);
		btnContinuar.setBounds(59, 184, 89, 23);
		contentPane.add(btnContinuar);
	}

}
