package memento;

import java.util.Stack;

public class CareTaker {
	private Stack<Memento> mementos = new Stack<Memento>();

	public Memento getMemento() {
		return mementos.isEmpty() ? null : mementos.pop();
	}

	public void addMemento(Memento memento) {
		mementos.push(memento);
	}

}
