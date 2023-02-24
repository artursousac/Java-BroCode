package variaveis;

public class JavaVariaveis {

	public static void main(String[] args) {
		int x = 1234;
		long y = 1231231829371823L; // Para caso o número seja muito grande, deve utilizar o Long
		float z = 123.4f;// Para utilizar casas decimais, porém necessita de "f" no final. 
		double a = 123.4;// Armazena mais que o float e não necessita do "f" no final.
		boolean b = true;// só aceita true ou false.
		char symbol = '@';// Armazena 1 caractere e tem que estar entre ' '.
		String name = "Artur";// Armazena vários chars e tem que estar entre " ".
		System.out.println("My number is: "+x);
		System.out.println("My long number is: "+y);
		System.out.println("My float number is: "+z);
		System.out.println("My double number is: "+a);
		System.out.println("My boolean is: "+b);
		System.out.println("My char and String is: "+symbol+" and "+name);

	}

}
