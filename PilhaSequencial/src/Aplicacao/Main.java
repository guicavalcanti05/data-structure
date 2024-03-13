package Aplicacao;

public class Main {

	public static void main(String[] args) {
		
		PilhaSequencial pilha = new PilhaSequencial();
		
		
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		pilha.push(33);
		pilha.push(44);
		pilha.push(66);
		
		if (pilha.isEmpty() != true) {
			System.out.println("valor retirado da pilha:"+pilha.pop());
		}
		
		else {
			pilha.esvazia();
		}
		
		



		
	}

}
