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
	JButton lblEXI = new JButton("Exibir");
	JButton lblED = new JButton("Editar");
	JButton lblAJ = new JButton("Ajuda");
	
	
	public Janela() {
		super("Calculadora");
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		paine.add(lblvisor);
		lblvisor.setBounds(10,20,297,50);
		
		paine.add(lblMC);
		lblMC.setBounds(10,75,58,28);
		
		paine.add(lblMR);
		lblMR.setBounds(70,75,58,28);
		
		paine.add(lblMS);
		lblMS.setBounds(130,75,58,28);
		
		paine.add(lblMM);
		lblMM.setBounds(190,75,58,28);
		
		paine.add(lblME);
		lblME.setBounds(250,75,58,28);
		
		paine.add(lblEXI);
		lblEXI.setBounds(10,2,70,15);
		
		paine.add(lblED);
		lblED.setBounds(80,2,70,15);
		
		paine.add(lblAJ);
		lblAJ.setBounds(150,2,70,15);
		
		
		this.setSize(320,400);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
}
	
	
	
	
	

public static void main(String[] args) {
		Janela janela = new Janela();
		
	}

}
