import java.util.Stack;

public class AddCommand extends AbstractCommand {

	private Adder adder = new Adder();

	Stack<Integer> commandHis = new Stack<Integer>();
	Stack<Integer> reCommandHis = new Stack<Integer>();

	@Override
	int execute(int value) {
		commandHis.push(value);
		if (!reCommandHis.isEmpty()) {
			reCommandHis.clear();
		}
		return adder.compute(value);
	}

	@Override
	int undo() {
		if (!commandHis.isEmpty()) {
			int t = commandHis.pop();
			reCommandHis.push(t);
			return adder.compute(-t);
		} else {
			System.out.println("没有历史记录，不能undo");
			return 65535;
		}
	}

	@Override
	int redo() {
		if (!reCommandHis.isEmpty()) {
			int t = reCommandHis.pop();
			commandHis.push(t);
			return adder.compute(t);
		} else {
			System.out.println("没有历史记录，不能redo");
			return 65535;
		}

	}

}
