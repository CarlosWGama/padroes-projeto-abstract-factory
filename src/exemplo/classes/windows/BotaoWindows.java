package exemplo.classes.windows;

import exemplo.classes.IBotao;

public class BotaoWindows implements IBotao {
	
	public String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirBotao() {
		System.out.println("Exibe bot�o Windows com texto - " + texto);
	}
}
