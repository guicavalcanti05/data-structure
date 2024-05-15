package Teste;

import java.util.Scanner;

import ListaGenerica.ListaCrescenteInt;

public class teste {

	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
	ListaCrescenteInt lista = new ListaCrescenteInt();
	
	
	int valor;
	System.out.println("Informe um valor para inserir na lista ou negativo para encerrar: ");
	valor = tc.nextInt();
	
	lista.add(valor);
	
	while(valor >= 0) {
		System.out.println("Informe um valor para inserir na lista ou negativo para encerrar: ");
		valor = tc.nextInt();
		
		lista.add(valor);
		lista.show();
	}
	

	}

}
