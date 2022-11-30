
public class Main {

	public static void main(String[] args) {
		
		Cauculadora cauc = new Cauculadora(2);
		
		Soma soma = new Soma(cauc);
		
		soma.execute(50);
		soma.execute(100);
		soma.execute(200);
		
		
		
		User user = new User();
		
		user.setCommand(soma);
		user.computeCommand(50);
		user.levelCommand();
		user.levelCommand();
		user.levelCommand();
		user.levelCommand();
		user.levelCommand();
		
		
		
		

	}

}
