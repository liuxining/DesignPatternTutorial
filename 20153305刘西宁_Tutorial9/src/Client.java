
public class Client {
	public static void main(String[] args) {
		ACar aCar = (ACar) XMLUtil.getBean("ACar");
		Road road = (Road) XMLUtil.getBean("Road");
		aCar.setRoad(road);
		aCar.run();
	}
}
