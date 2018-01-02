
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		form.setCommand(command);
		
		form.compute(1);
		form.compute(2);
		form.compute(3);
		form.compute(4);
		
		form.undo();
		form.undo();
		

		form.redo();
		
	}
}
