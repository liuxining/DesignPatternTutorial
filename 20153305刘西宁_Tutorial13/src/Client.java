
public class Client {
	public static void main(String[] args) {
		HLFlyWeight h1,h2;
		
		h1 = HLFlyWeightFactory.getInstance().getHLFlyWeight();
		h1.show("红色");
		
		h2 = HLFlyWeightFactory.getInstance().getHLFlyWeight();
		h2.show("蓝色");
		
		System.out.println("h1 == h2? " + (h1 == h2));
	}
}
