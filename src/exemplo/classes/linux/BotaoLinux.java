package exemplo.classes.linux;

public class BotaoLinux {
	
	public String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirBotao() {
		System.out.println("Exibe bot�o Linux com texto - " + texto);
	}
}
