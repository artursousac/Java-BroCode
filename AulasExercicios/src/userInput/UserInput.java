package userInput;

import java.util.Scanner; //Realizamos a importação da biblioteca Scanner.

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); /* Estamos declarando a variável "scanner" como sendo do tipo classe Scanner
		e estamos fazendo "new Scanner", pois falamos que a scanner será um objeto desse tipo.*/
		
		System.out.println("What is your name?: ");
		String name = scanner.nextLine(); //Agora estamos utilizando o scanner, variável, para fazer a leitura do input.
		System.out.println("How old are you?: ");
		int age = scanner.nextInt(); //Utilizamos nextInt, pois é um número inteiro.
		scanner.nextLine(); /*É necessário utilizar este scanner nextLine (em caso de o proximo scanner ser uma string) após um nextInt.
		Em caso de o próximo scanner ser diferente de string, não é necessário esse scanner.*/
		System.out.println("What is your favorite food?: ");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);

	}

}
