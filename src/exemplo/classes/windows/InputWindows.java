package exemplo.classes.windows;

import java.util.Scanner;

public class InputWindows {
	private Scanner reader = new Scanner(System.in);
	
	public void exibirCampo() {
		System.out.println("Exibe campo Input do Windows");
	}
	
	public String getTexto() {
		return reader.nextLine();
	}
}
