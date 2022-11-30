
public class User {

	Command current;
	
	public User() {
		
	}
	
	public void setCommand(Command command) {
		current = command;
	}
	
	public void computeCommand(int num) {
		current.execute(num);
	}
	
	public void levelCommand() {
		current.undo();
	}
	

}
