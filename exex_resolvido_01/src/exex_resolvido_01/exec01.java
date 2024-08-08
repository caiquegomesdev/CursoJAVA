package exex_resolvido_01;

import java.util.Scanner;

public class exec01 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1, d2, saida;
		
		
		d1 = sc.nextInt();
		d2 = sc.nextInt();
		
		saida = d1 + d2 ;
		
		System.out.println("ENTRADA DE DADOS DIGITADOS: " );
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("A SOMA DOS DADOS DIGITADOS: " );
		System.out.println("SOMA = " + saida);
		System.out.println();
		
		sc.close();
	}
}
