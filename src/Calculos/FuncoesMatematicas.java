package Calculos;

public class FuncoesMatematicas {
	public double soma (double valor1 ,double valor2) {
		double total = valor1 + valor2;
		return total;
	}
	
	public double sub (double valor1,double valor2) {
		double total = valor1 - valor2;
		return total;
	}
	
	public double mult (double valor1,double valor2) {
		double total = valor1 * valor2;
		return total;
	}
	
	public double divisao (double valor1,double valor2) {
		double total = valor1 / valor2;
		return total;
	}
	
	public double porcentagem (double valor1,double valor2) {
		double total = valor1*(valor2/100);
		return total;
	}
	
	public double raiz (double valor1) {
		double total = Math.sqrt(valor1);
		return total;
	}

}
