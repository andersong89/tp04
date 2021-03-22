package app;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AApp {

	int idade;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	private JFrame frmInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AApp window = new AApp();
					window.frmInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicial = new JFrame();
		frmInicial.setTitle("EventApp");
		frmInicial.setBackground(new Color(100, 149, 237));
		frmInicial.setBounds(100, 100, 434, 409);
		frmInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicial.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frmInicial.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 5, 418, 354);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		JButton butonConvidados = new JButton("Lista");
		butonConvidados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cadastros().setVisible(true);
				
			}
		});
		butonConvidados.setBackground(SystemColor.activeCaption);
		butonConvidados.setHorizontalAlignment(SwingConstants.LEFT);
		butonConvidados.setBounds(51, 255, 64, 23);
		panel_1.add(butonConvidados);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(AApp.class.getResource("/app/eficialapp.png")));
		lblNewLabel.setBounds(10, 125, 142, 119);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(240, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon(AApp.class.getResource("/app/controle de gastos.png")));
		lblNewLabel_2.setBounds(162, 125, 116, 119);
		panel_1.add(lblNewLabel_2);
		
		JLabel tarefas = new JLabel("Tarefas");
		tarefas.setIcon(new ImageIcon(AApp.class.getResource("/app/tarefasofi.jpg")));
		tarefas.setBounds(288, 137, 120, 107);
		panel_1.add(tarefas);
		
		JButton btnGastos = new JButton("Gastos");
		btnGastos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGastos.setBackground(SystemColor.activeCaption);
		btnGastos.setBounds(162, 255, 89, 23);
		panel_1.add(btnGastos);
		
		JButton btnTarefas = new JButton("Tarefas");
		btnTarefas.setBackground(SystemColor.activeCaption);
		btnTarefas.setBounds(298, 255, 89, 23);
		panel_1.add(btnTarefas);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AApp.class.getResource("/app/event.png")));
		lblNewLabel_1.setBounds(76, 25, 342, 89);
		panel_1.add(lblNewLabel_1);
	}
}
