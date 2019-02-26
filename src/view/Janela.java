package view;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Janela extends JFrame{
	
	JTextField lblvisor = new JTextField();
	JButton lblMC = new JButton("MC");
	JButton lblMR = new JButton("MR");
	JButton lblMS = new JButton("MS");
	JButton lblMM = new JButton("M+");
	JButton lblME = new JButton("M-");
	
	
	public Janela() {
		super("Calculadora");
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		paine.add(lblvisor);
		lblvisor.setBounds(5,20,198,50);
		
		paine.add(lblMC);
		lblMC.setBounds(5,75,35,28);
		
		paine.add(lblMR);
		lblMR.setBounds(45,75,35,28);
		
		paine.add(lblMS);
		lblMS.setBounds(85,75,35,28);
		
		paine.add(lblMM);
		lblMM.setBounds(125,75,35,28);
		
		paine.add(lblME);
		lblME.setBounds(165,75,35,28);
		
		
		
		this.setSize(215,310);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
}
	
	
	
	
	

public static void main(String[] args) {
		Janela janela = new Janela();
		
	}

}
