package Aplicacao;

public class PilhaSequencial {
	
		public final int N = 6;
		int pilha [] = new int[N];
		int topo;
		
		
		public void init () {
			topo=0;
		}
		
		public boolean isFull() {
			if(topo==N) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void push (int elem) {
			if(isFull()) {
				System.out.println("Stack overflow");
			}
			else {
				pilha[topo]=elem;
				topo++;
			}
			
		}
		
		public int pop() {
			topo--;
			return (pilha[topo]);
		}
		
		public boolean isEmpty() {
			if (topo ==0) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		public int top() {
			return pilha[topo-1];
		}
		
		public void esvazia() {
			while (!isEmpty()) {
				System.out.println(pop());
			}
		}

}
