import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Udemy {

	public static void main(String[] args) {
		
		//Faça um programa para ler dois valores inteiros, 
		// e depois mostrar na tela a soma desses números com uma
		// mensagem explicativa.
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("A soma de A+B é : " + soma);
		
		sc.close();

	}

}
