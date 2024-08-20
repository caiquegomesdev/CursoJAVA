package exec_resolvido_02;
import java.util.Locale;
import java.util.Scanner;

public class exec_04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMERO = " + numero);
	    System.out.printf("SALARIO = U$ %.2f%n", salario);
		
		sc.close();
	}
}
