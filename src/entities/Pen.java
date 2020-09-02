package entities;
//Implementação da classe "Caneta"
public class Pen {
	//Atributos
	private	Double tinta;
	private boolean tampa;
			
	public Pen(Double tinta, boolean tampa) {
		this.tinta = tinta;
		this.tampa = tampa;
	}
	//Métodos/"operações"
	public Double getTinta() {
		return tinta;
	}

	public boolean isTampa() {
		return tampa;
	}

	public boolean destampar() {
		return tampa = false;
	}
	
	public boolean tampar() {
		return tampa = true;
	}
	
	public String status() {
		if(tampa == true) return "A caneta está tampada!";
		return "A caneta está destampada!";
	}
	
	public Double escrever() {
		return tinta-=2.5;
	}
	
	public String toString() {
		return "Status da caneta: "+status()
				+"\nQuantidade de tinta: "+getTinta();
				
	}
}
