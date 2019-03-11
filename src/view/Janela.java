package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import Calculos.FuncoesMatematicas;

import javax.swing.JComboBox;

public class Janela extends JFrame{
	
	//criacao dos botoes
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
	
	
	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	public Janela() {
		super("Calculadora");
		Container paine = this.getContentPane();
		
		//ajuste do tamanho e localizacao dos botoes
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
		
		
		//funcoes para aparecer os numeros no visor
		lbl0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("0");
				}else {
					lblvisor.setText(lblvisor.getText() + "0");
				}
				
				
			}
		});
		
		lbl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("1");
				}else {
					lblvisor.setText(lblvisor.getText() + "1");
				}
				
				
			}
		});
		
		lbl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("2");
				}else {
					lblvisor.setText(lblvisor.getText() + "2");
				}
				
				
			}
		});
		
		lbl3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("3");
				}else {
					lblvisor.setText(lblvisor.getText() + "3");
				}
				
				
			}
		});
		
		lbl4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("4");
				}else {
					lblvisor.setText(lblvisor.getText() + "4");
				}
				
				
			}
		});
		
		lbl5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("5");
				}else {
					lblvisor.setText(lblvisor.getText() + "5");
				}
				
				
			}
		});
		
		lbl6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("6");
				}else {
					lblvisor.setText(lblvisor.getText() + "6");
				}
				
				
			}
		});
		
		lbl7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("7");
				}else {
					lblvisor.setText(lblvisor.getText() + "7");
				}
				
				
			}
		});
		
		lbl8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("8");
				}else {
					lblvisor.setText(lblvisor.getText() + "8");
				}
				
				
			}
		});
		
		lbl9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblvisor.getText().equals("0")) {
					lblvisor.setText("9");
				}else {
					lblvisor.setText(lblvisor.getText() + "9");
				}
				
				
			}
		});
		
		
		//funcao para limpar a tela e aparecer o numero 0
		lblCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblvisor.setText("0");
				
			}
		});
		
		//funcao para limpar a tela e aparecer o numero 0
		lblC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblvisor.setText("0");
				
			}
		});
		//funcao do botao de igual
		lblIG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(lblvisor.getText());

				if(sinal.equals("soma")) {
					lblvisor.setText(mat.soma(valor1, valor2) + "");
				}
				else if(sinal.equals("sub")) {
					lblvisor.setText(mat.sub(valor1, valor2) + "");
				}
				else if(sinal.equals("mult")) {
					lblvisor.setText(mat.mult(valor1, valor2) + "");
				}
				else if(sinal.equals("divisao")) {
					lblvisor.setText(mat.divisao(valor1, valor2) + "");
				}
				else if(sinal.equals("porcentagem")) {
					lblvisor.setText(mat.porcentagem(valor1, valor2) + "");
				}
				else if(sinal.equals("raiz")) {
					lblvisor.setText(mat.raiz(valor1) + "");
				}
				
			}
		});
		
		//funcoes dos botoes das operacoes
		lblSO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "soma";
				lblvisor.setText("0");
			}
		});
		
		lblMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "sub";
				lblvisor.setText("0");
			}
		});
		
		lblAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "mult";
				lblvisor.setText("0");
			}
		});
		
		lblBARRA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "divisao";
				lblvisor.setText("0");
			}
		});
		
		lblPORC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "porcentagem";
				lblvisor.setText("0");
			}
		});
		
		lblRAIZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblvisor.getText());
				sinal = "raiz";
				lblvisor.setText("0");
			}
		});
		
		
		
		
		//ajustes na tela
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
