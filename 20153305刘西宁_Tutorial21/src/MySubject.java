import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
	protected List<MyObserver> observers = new ArrayList<MyObserver>();

	public void attach(MyObserver obs) {
		observers.add(obs);
	}

	public void detach(MyObserver obs) {
		observers.remove(obs);
	}

	public abstract void notify(String args);

}
