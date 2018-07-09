package exemplo.classes.linux;

import exemplo.classes.IBotao;

public class BotaoLinux implements IBotao {
	
	public String texto;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibirBotao() {
		System.out.println("Exibe botão Linux com texto - " + texto);
	}
}
