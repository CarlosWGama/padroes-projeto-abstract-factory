package exemplo.classes.linux;

import exemplo.classes.IBotao;
import exemplo.classes.IFabricaInterfaceGrafica;
import exemplo.classes.IInput;

public class FabricaInterfaceLinux implements IFabricaInterfaceGrafica {

	@Override
	public IBotao getBotao() {
		return new BotaoLinux();
	}

	@Override
	public IInput getInput() {
		return new InputLinux();
	}
}
