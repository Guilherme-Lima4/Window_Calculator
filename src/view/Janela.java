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
	JButton lblAPG = new JButton("←");
	JButton lblCE = new JButton("CE");
	JButton lblC = new JButton("C");
	JButton lblMAME = new JButton("±");
	JButton lblRAIZ = new JButton("√");
	JButton lbl7 = new JButton("7");
	JButton lbl8 = new JButton("8");
	JButton lbl9 = new JButton("9");
	JButton lblBARRA = new JButton("/");
	JButton lblPORC = new JButton("%");
	JButton lbl4 = new JButton("4");
	JButton lbl5 = new JButton("5");
	JButton lbl6 = new JButton("6");
	JButton lblAS = new JButton("*");
	JButton lbl1X = new JButton("1/x");
	JButton lbl1 = new JButton("1");
	JButton lbl2 = new JButton("2");
	JButton lbl3 = new JButton("3");
	JButton lblIG = new JButton("=");
	JButton lblMe = new JButton("-");
	JButton lbl0 = new JButton("0");
	JButton lblV = new JButton(",");
	JButton lblSO = new JButton("+");
	
	
	
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
		
		paine.add(lblAPG);
		lblAPG.setBounds(10,108,58,28);
		
		paine.add(lblCE);
		lblCE.setBounds(70,108,58,28);
		
		paine.add(lblC);
		lblC.setBounds(130,108,58,28);
		
		paine.add(lblMAME);
		lblMAME.setBounds(190,108,58,28);
		
		paine.add(lblRAIZ);
		lblRAIZ.setBounds(250,108,58,28);
		
		paine.add(lbl7);
		lbl7.setBounds(10,141,58,28);
		
		paine.add(lbl8);
		lbl8.setBounds(70,141,58,28);
		
		paine.add(lbl9);
		lbl9.setBounds(130,141,58,28);
		
		paine.add(lblBARRA);
		lblBARRA.setBounds(190,141,58,28);
		
		paine.add(lblPORC);
		lblPORC.setBounds(250,141,58,28);
		
		paine.add(lbl4);
		lbl4.setBounds(10,174,58,28);
		
		paine.add(lbl5);
		lbl5.setBounds(70,174,58,28);
		
		paine.add(lbl6);
		lbl6.setBounds(130,174,58,28);
		
		paine.add(lblAS);
		lblAS.setBounds(190,174,58,28);
		
		paine.add(lbl1X);
		lbl1X.setBounds(250,174,58,28);
		
		paine.add(lbl1);
		lbl1.setBounds(10,207,58,28);
		
		paine.add(lbl2);
		lbl2.setBounds(70,207,58,28);
		
		paine.add(lbl3);
		lbl3.setBounds(130,207,58,28);
		
		paine.add(lblMe);
		lblMe.setBounds(190,207,58,28);
		
		paine.add(lblIG);
		lblIG.setBounds(250,207,58,61);
		
		paine.add(lbl0);
		lbl0.setBounds(10,240,118,28);
		
		paine.add(lblV);
		lblV.setBounds(130,240,58,28);
		
		paine.add(lblSO);
		lblSO.setBounds(190,240,58,28);
		
		
		this.setSize(320,310);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
}
	
	
	
	
	

public static void main(String[] args) {
		Janela janela = new Janela();
		
	}

}
