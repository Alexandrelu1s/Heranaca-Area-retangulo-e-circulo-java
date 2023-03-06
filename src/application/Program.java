package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Cor;
import entities.Corpo;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Corpo forma;
		
		List<Corpo> list = new ArrayList<>();	
		
		System.out.print("Entre o numero de formas: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i+1));
			System.out.print("Cor (PRETO, AZUL E VERMELHO): ");
			sc.nextLine();
			String cor = sc.nextLine().toUpperCase();
			System.out.print("Retangulo ou circulo (R/C)? ");
			char x = sc.next().toUpperCase().charAt(0);
			
			if(x == 'R') {
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				
				forma = new Retangulo(altura, largura, Cor.valueOf(cor));
				list.add(forma);
			}
			if(x == 'C') {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				
				forma = new Circulo(raio, Cor.valueOf(cor));
				list.add(forma);
			}
		}
		
		for(Corpo l : list) {
			System.out.println(l);
		}
		
		sc.close();
	}

}
