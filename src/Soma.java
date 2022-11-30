
public class Soma implements Command {

	Cauculadora cauc;
	int numero = 0;

	public Soma(Cauculadora cauc) {
		this.cauc = cauc;
	
	}

	@Override
	public void execute(int valor) {
		cauc.somar(numero + valor);

	}

	@Override
	public void undo() {
		cauc.undo();
		
	}

}
