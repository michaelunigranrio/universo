package control;

import java.util.Scanner;

import domain.Galaxia;
import domain.Nebulosa;
import domain.Universo;

public class ControleGeral {
	public static void main (String[] args) {
		
		String nomeUniverso;
		Scanner leia = new Scanner(System.in);
		char po='n';
		
		Universo uni = new Universo(null, null, null);
		Nebulosa nebu = new Nebulosa(null, 0, null);
		Galaxia gal = new Galaxia(null, 0, null, null);
		
		System.out.println("Digite o nome do Universo: ");
		uni.setNome(leia.nextLine());
		
		do {
			System.out.println("Digite a opção que deseja adicionar: ");
			System.out.println("1 - Nebulosa\n2 - Galáxia\n3 - Sistema\n4 -"
					+ " Planeta\n5 - Satélite\n6 - Estrela\n7 - Cometa\n8"
					+ " - Meteorito\n9 - Meteoro\n10 - Asteroide");
			int opcao = leia.nextInt();
			
			switch (opcao) {
			
			case 1:
			{
				System.out.println("Digite o nome e idade da Nebulosa:");
				String nome = leia.nextLine();
				int idade = leia.nextInt();
				Nebulosa nebulosa = new Nebulosa(nome, idade, uni);
				break;
			}
			case 2:
			{
				System.out.println("Digite o nome e idade da Galáxia:");
				String nome = leia.nextLine();
				int idade = leia.nextInt();
				Galaxia galaxia = new Galaxia(nome, idade, uni, null);
				break;
			}
			case 3:
			{
			
			}
			case 4:
			{
			
			}
			case 5:
			{
			
			}
			
			System.out.println("Deseja Continuar?");
			po = leia.next().charAt(0);
		}
		
		} while(po == 's' || po == 'S' );
		
	}
}
