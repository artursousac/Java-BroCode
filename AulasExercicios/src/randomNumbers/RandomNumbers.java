package randomNumbers;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1; //Como o computador inicia com 0, então ele irá fazer random de números entre 0 e 5. Para resolver isso, fazemos (6)+1.
		double y = random.nextDouble();
		boolean z = random.nextBoolean(); //Irá retornar true or false.
		
		
		System.out.println(z+"\n"+x+"\n"+y);

	}

}
