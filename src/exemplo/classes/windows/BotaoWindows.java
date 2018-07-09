package exemplo.classes.windows;

public class BotaoWindows {
	
	public String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirBotao() {
		System.out.println("Exibe botão Windows com texto - " + texto);
	}
}
