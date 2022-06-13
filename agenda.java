package jojopose;

import java.util.Scanner;

public class agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        
		Scanner ler = new Scanner(System.in); // Esse e o Scanner que fara a leitura do codigo

		int i = 0, j = 0, k = 0, linhas = 5, colunas = 5; // Nossas variaveis
		String m[][] = new String[linhas][colunas]; // Nossas variaveis 
		String x; // Nossa variavel

		for (i = 0; i < linhas; i++) { // Nosso sistema para repeticao
			System.out.printf("Pessoa %d\n", (i + 1)); // iterface que aparecera para o usuario
			System.out.print("Informe seu nome: "); // interface que aparecera para o usuario imputar os dados
			m[i][0] = ler.nextLine(); // Fara a leitura da nossa String
			System.out.print("Informe seu endereco: ");  // interface que aparecera para o usuario imputar os dados
			m[i][1] = ler.nextLine(); // Fara a leitura da nossa String
			System.out.print("Informe seu codigo postal: ");  // interface que aparecera para o usuario imputar os dados
			m[i][2] = ler.nextLine(); // Fara a leitura da nossa String
			System.out.print("Informe seu bairro: ");  // interface que aparecera para o usuario imputar os dados
			m[i][3] = ler.nextLine(); // Fara a leitura da nossa String
			System.out.print("Informe seu telefone: ");  // interface que aparecera para o usuario imputar os dados
			m[i][4] = ler.nextLine(); // Fara a leitura da nossa String
			System.out.printf("\n"); // String para quebrar linha 
		}

		for (i = 0; i < linhas; i++) { // Sistema de repeticao
			for (j = 0; j < linhas; j++) { // Sistema de repeticao

				if (m[i][0].compareTo(m[j][0]) < 0) { // sistema de decisao

					for (k = 0; k < 5; k++) { // sistema de repeticao
						x = m[i][k]; // coordenando as variaveis
						m[i][k] = m[j][k]; // coordenando as variaveis
						m[j][k] = x; // coordenando as variaveis

					}
				}
			}
		}

		for (i = 0; i < linhas; i++) { // Sistema de repeticao
			for (j = 0; j < 1; j++) { // Sistema de repeticao
				System.out.printf("Pessoa %d\n", (i + 1)); // iterface que aparecera para o usuario
				System.out.printf("Nome: %s\n", m[i][0]); // iterface que aparecera para o usuario
				System.out.printf("Endereco: %s\n", m[i][1]); // iterface que aparecera para o usuario
				System.out.printf("Codigo Postal: %s\n", m[i][2]); // iterface que aparecera para o usuario
				System.out.printf("Bairro: %s\n", m[i][3]); // iterface que aparecera para o usuario
				System.out.printf("Telefone: %s\n", m[i][4]); // iterface que aparecera para o usuario
				System.out.printf("\n"); // String para quebrar linha
			}
		}
	}
}

