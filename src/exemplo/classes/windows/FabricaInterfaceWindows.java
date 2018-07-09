package exemplo.classes.windows;

import exemplo.classes.IBotao;
import exemplo.classes.IFabricaInterfaceGrafica;
import exemplo.classes.IInput;

public class FabricaInterfaceWindows implements IFabricaInterfaceGrafica {

	@Override
	public IBotao getBotao() {
		return new BotaoWindows();
	}

	@Override
	public IInput getInput() {
		return new InputWindows();
	}
}
