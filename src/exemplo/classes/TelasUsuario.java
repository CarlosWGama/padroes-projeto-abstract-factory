package exemplo.classes;

import exemplo.classes.linux.BotaoLinux;
import exemplo.classes.linux.InputLinux;
import exemplo.classes.windows.BotaoWindows;
import exemplo.classes.windows.InputWindows;

public class TelasUsuario {
	
	private final String SISTEMA_OPERACIONAL = "Windows";

	public void telaCadastro() {
		if (SISTEMA_OPERACIONAL.equals("Windows")) {
			InputWindows inputNome = new InputWindows();
			inputNome.exibirCampo();
			
			InputWindows inputSenha = new InputWindows();
			inputSenha.exibirCampo();
			
			BotaoWindows botao = new BotaoWindows();
			botao.setTexto("Cadastrar");
			botao.exibirBotao();
			
		} else if (SISTEMA_OPERACIONAL.equals("Linux")) {
			InputLinux inputNome = new InputLinux();
			inputNome.exibirCampo();
			
			InputLinux inputSenha = new InputLinux();
			inputSenha.exibirCampo();
			
			BotaoLinux botao = new BotaoLinux();
			botao.setTexto("Cadastrar");
			botao.exibirBotao();
		}
	}
	
	public void telaEdicao() {
		if (SISTEMA_OPERACIONAL.equals("Windows")) {
			InputWindows inputNome = new InputWindows();
			inputNome.exibirCampo();
			
			InputWindows inputSenha = new InputWindows();
			inputSenha.exibirCampo();
			
			BotaoWindows botao = new BotaoWindows();
			botao.setTexto("Editar");
			botao.exibirBotao();
			
		} else if (SISTEMA_OPERACIONAL.equals("Linux")) {
			InputLinux inputNome = new InputLinux();
			inputNome.exibirCampo();
			
			InputLinux inputSenha = new InputLinux();
			inputSenha.exibirCampo();
			
			BotaoLinux botao = new BotaoLinux();
			botao.setTexto("Editar");
			botao.exibirBotao();
		}
	}
}
