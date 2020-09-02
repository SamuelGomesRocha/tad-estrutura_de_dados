package application;

import entities.Pen;

public class Program {

	public static void main(String[] args) {
		Double quantidadeTinta = 100.00;
		boolean status = true;
		
		//Instancia��o do objeto "pen1", que � do TAD: Pen;
		Pen pen1 = new Pen(quantidadeTinta, status);
		
		//Utiliza��o de m�todos advindos da implementa��o da classe Pen, que � um tipo abstrato de dados;
		pen1.destampar();
		pen1.escrever();
		System.out.println(pen1.toString());
	}
	
}
