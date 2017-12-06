
public class HLFlyWeightFactory {
	HLFlyWeight hlFlyWeight;
	private static HLFlyWeightFactory hlFlyWeightFactory;

	private HLFlyWeightFactory() {
		
	}
	
	public static HLFlyWeightFactory getInstance(){
		if(hlFlyWeightFactory == null){
			hlFlyWeightFactory = new HLFlyWeightFactory();
		}
		return hlFlyWeightFactory;
	}
	
	public HLFlyWeight getHLFlyWeight(){
		if(hlFlyWeight == null){
			hlFlyWeight = new HLConcreteFlyWeight();
		}
		return hlFlyWeight;
	}
	
}
