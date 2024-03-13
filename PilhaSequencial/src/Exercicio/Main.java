package Exercicio;

import java.util.Scanner;

import Aplicacao.PilhaSequencial;

public class Main {

	public static void main(String[] args) {
		PilhaSequencial pilha = new PilhaSequencial();
		Scanner tc = new Scanner(System.in);
		pilha.init();
		
		int num,resto;
		
		System.out.print("Digite um numero para converter para binario-->");
		num=tc.nextInt();
		
		while(num != 0) {
			resto = num  % 2;
			pilha.push(resto);
			num = num / 2;
		}
		
		tc.close();
		
		System.out.println("Numero em binario: ");
		pilha.esvazia();
		
		

	}

}
