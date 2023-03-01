package expressions;

public class Expressions {

	public static void main(String[] args) {
		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %
		
		int friends = 10;
		
		//friends = friends %2;
		//friends++; (ocorre o incremento de 1. o mesmo vale para friends --)
		/*friends = friends / 3; vai gerar uma divisão INTEIRA, truncando o valor e ignorando a parte decimal.
		uma maneira de gerar divisão decimal é utilizando friends = (double) friends / 3, que vai gerar resultado do tipo double*/
		System.out.println(friends);

	}

}
