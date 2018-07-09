package exemplo.classes.linux;

public class BotaoLinux {
	
	public String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirBotao() {
		System.out.println("Exibe botão Linux com texto - " + texto);
	}
}
