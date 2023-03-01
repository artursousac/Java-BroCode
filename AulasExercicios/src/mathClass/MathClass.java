package mathClass;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); //Compara dois valores e retorna o valor.
		//double z = Math.abs(x, y); //Pega o maior valor absoluto.
		//double z = Math.sqrt(y); //Retorna a raíz de y.
		//double z = Math.floor(x); //Arredonda o valor inteiro para baixo.
		//double z = Math.ceil(x); //Arredonda o valor inteiro para cima.
		//double z = Math.round(x); //Arredonda o valor para o inteiro mais próximo, seja para cima ou para baixo.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: "+z);
		
		scanner.close();
	}

}
