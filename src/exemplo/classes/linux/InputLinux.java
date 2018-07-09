package exemplo.classes.linux;

import java.util.Scanner;

public class InputLinux {
	private Scanner reader = new Scanner(System.in);
	
	public void exibirCampo() {
		System.out.println("Exibe campo Input do Linux");
	}
	
	public String getTexto() {
		return reader.nextLine();
	}
}
