package guiIntro;

import javax.swing.JOptionPane;

public class GUIntro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name"); //Caixa de diálogo para ler um valor.
		JOptionPane.showMessageDialog(null, "Hello "+name); //Caixa de diálogo que mostra na tela um valor.
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //Dialog return a string. so use Integer.parseInt()
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); //Para caso utilizar double, basta trocar o parseInt para parseDouble
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}

}
