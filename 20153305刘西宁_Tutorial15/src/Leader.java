
public abstract class Leader {
	protected String name;
	protected Leader successor;
	

	public Leader(String name) {
		this.name = name;
	}
	
	public abstract void handleRequest(Order order);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Leader getSuccessor() {
		return successor;
	}

	public void setSuccessor(Leader successor) {
		this.successor = successor;
	}

}
