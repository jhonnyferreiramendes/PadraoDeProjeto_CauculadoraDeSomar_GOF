import java.util.ArrayList;


public class Cauculadora {

	public int valor;
	public ArrayList<Integer> atual = new ArrayList<>();

	public Cauculadora(int valor) {
		this.valor = valor;

	}

	public void somar(int numero) {
		valor = valor + numero;
		atual.add(numero);
		System.out.println("Soma efetuada com sucesso, Valor do numero: " + valor + "\n");
	}

	public void undo() {
		if (atual.size() <= 0) {
			System.out.println("Nao e possivel mais desfazer o valor \n");
		} else {
			valor -= atual.get(atual.size() - 1);
			atual.remove(atual.size() - 1);
			System.out.println("Valor Desfeito com sucesso");
			System.out.println("Valor atual do numero é: " + valor + "\n");
		}

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
