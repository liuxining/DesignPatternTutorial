
public class HLConcreteFlyWeight implements HLFlyWeight {

	private String str = "Hello World!";
	
	@Override
	public void show(String color) {
		System.out.println(color + " 的 " + str);
	}

}
