package exemplo.classes.linux;

import java.util.Scanner;

import exemplo.classes.IInput;

public class InputLinux implements IInput {
	private Scanner reader = new Scanner(System.in);
	
	public void exibirCampo() {
		System.out.println("Exibe campo Input do Linux");
	}
	
	public String getTexto() {
		return reader.nextLine();
	}
}
