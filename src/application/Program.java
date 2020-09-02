package application;

import entities.Pen;

public class Program {

	public static void main(String[] args) {
		Double quantidadeTinta = 100.00;
		boolean status = true;
		
		//Instanciação do objeto "pen1", que é do TAD: Pen;
		Pen pen1 = new Pen(quantidadeTinta, status);
		
		//Utilização de métodos advindos da implementação da classe Pen, que é um tipo abstrato de dados;
		pen1.destampar();
		pen1.escrever();
		System.out.println(pen1.toString());
	}
	
}
