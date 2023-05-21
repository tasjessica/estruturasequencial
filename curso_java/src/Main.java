import java.util.Scanner;

public class Main {

	//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
	//mensagem explicativa, conforme exemplos.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int resultado = a + b;
		
		System.out.println("Os numeros digitados foram: " + a + " e " + b);
		System.out.println("O resultado da soma dos números é: " + resultado);
		
		
		
		
		sc.close();
		
	}

}
