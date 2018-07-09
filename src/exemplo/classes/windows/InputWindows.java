package exemplo.classes.windows;

import java.util.Scanner;

import exemplo.classes.IInput;

public class InputWindows implements IInput {
	private Scanner reader = new Scanner(System.in);
	
	public void exibirCampo() {
		System.out.println("Exibe campo Input do Windows");
	}
	
	public String getTexto() {
		return reader.nextLine();
	}
}
