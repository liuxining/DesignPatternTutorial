
public abstract class AbstractCommand {
	abstract int execute(int value);

	abstract int undo();

	abstract int redo();

}
