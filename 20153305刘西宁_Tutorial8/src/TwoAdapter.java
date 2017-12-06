
public class TwoAdapter implements ICat, IDog {

	private ICat cat;
	private IDog dog;

	public TwoAdapter(ICat cat) {
		this.cat = cat;
	}

	public TwoAdapter(IDog dog) {
		this.dog = dog;
	}

	public ICat getCat() {
		return cat;
	}

	public void setCat(ICat cat) {
		this.cat = cat;
	}

	public IDog getDog() {
		return dog;
	}

	public void setDog(IDog dog) {
		this.dog = dog;
	}

	@Override
	public void dogTalk() {
		System.out.println("我是一只猫");
	}

	@Override
	public void dark() {
		System.out.println("我是一只猫，我在狗叫。。。。。。");

	}

	@Override
	public void catTalk() {
		System.out.println("我是一只狗");

	}

	@Override
	public void zhuo() {
		System.out.println("我是一只狗，我在抓老鼠");

	}

}
