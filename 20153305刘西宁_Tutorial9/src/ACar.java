
public abstract class ACar {
	protected Road road;
	public abstract void run();
	public Road getRoad() {
		return road;
	}
	public void setRoad(Road road) {
		this.road = road;
	}
	
}
