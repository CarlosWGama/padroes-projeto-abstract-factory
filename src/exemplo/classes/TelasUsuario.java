package exemplo.classes;

import exemplo.classes.linux.BotaoLinux;
import exemplo.classes.linux.FabricaInterfaceLinux;
import exemplo.classes.linux.InputLinux;
import exemplo.classes.windows.BotaoWindows;
import exemplo.classes.windows.FabricaInterfaceWindows;
import exemplo.classes.windows.InputWindows;

public class TelasUsuario {
	
	private final String SISTEMA_OPERACIONAL = "Windows";
	private IFabricaInterfaceGrafica fabrica;
	
	public TelasUsuario() {
		if (SISTEMA_OPERACIONAL.equals("Windows"))
			fabrica = new FabricaInterfaceWindows(); 
		else
			fabrica = new FabricaInterfaceLinux(); 
	}

	public void telaCadastro() {
			IInput inputNome = fabrica.getInput();
			inputNome.exibirCampo();
			
			IInput inputSenha = fabrica.getInput();
			inputSenha.exibirCampo();
			
			IBotao botao = fabrica.getBotao();
			botao.setTexto("Cadastrar");
			botao.exibirBotao();
	}
	
	public void telaEdicao() {
		IInput inputNome = fabrica.getInput();
		inputNome.exibirCampo();
		
		IInput inputSenha = fabrica.getInput();
		inputSenha.exibirCampo();
		
		IBotao botao = fabrica.getBotao();
		botao.setTexto("Cadastrar");
		botao.exibirBotao();
	}
}
