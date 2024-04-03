package Main;

import Filas.FilaInt;

public class Main {

	public static void main(String[] args) {
		
		FilaInt fila = new FilaInt();
		
		fila.init();
		fila.enqueue(10);
		fila.enqueue(15);
		fila.enqueue(5);
		
		while(!fila.isEmpty()) {
			System.out.println("Valor retirado:"+fila.dequeue());
		}
		
	}

}
