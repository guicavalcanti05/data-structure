package Filas;

public class FilaInt {

	public final int N = 6;
	int dados [] = new int [N];
	int ini, fim, cont;
	
	
	public void init() {
		ini = fim = cont = 0;
	}
	
	public boolean isEmpty() {
		return (cont==0);
	}
	
	public boolean isFull() {
		return (cont==N);
	}
	
	public void enqueue(int elem) {
		if(isFull()) {
			System.out.println("A fila está cheia");
		}
		
		else {
			dados[fim] = elem;
			fim = (fim+1) % N;
			cont++;
		}
	}
	
	
	public int dequeue() {
		int elem=dados[ini];
		ini = (ini+1) % N;
		cont --;
		return elem;
	}
}
