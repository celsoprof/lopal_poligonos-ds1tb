package br.senai.sp.jandira.calculo_poligonos;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.ui.Menu;

public class CalculadoraPoligonos {

	public static void main(String[] args) {
		
		// Looping / Laços de repetição
		
		int contador = 1;
		while(contador <= 15) {
			System.out.println("SENAI JANDIRA! - " + contador);
			contador = contador + 1;
		}
		
		String resposta = "s";
		while(resposta.equals("s")) {
			System.out.println("Estamos dando voltas");
			System.out.print("Gostaria de dar uma volta (s/n)? ");
			Scanner leitor = new Scanner(System.in);
			resposta = leitor.next();
		}
		
		System.out.println("------ TABUADA DO 9 --------------");
		contador = 0;
		while(contador <= 10) {
			int resultado = 9 * contador;
			System.out.println("9 X " + contador + " = " + resultado);
			contador++;
		}
		
		
		//Menu.criarMenu();

	}

}
