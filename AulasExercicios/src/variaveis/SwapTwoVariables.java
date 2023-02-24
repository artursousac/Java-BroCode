package variaveis;

public class SwapTwoVariables {

	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		
		//Abaixo como realizar a troca de x <> y.
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
