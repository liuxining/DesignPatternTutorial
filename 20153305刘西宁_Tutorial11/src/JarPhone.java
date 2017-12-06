
public class JarPhone extends PhoneDectorstor {

	public JarPhone(Phone phone) {
		super(phone);
	}

	@Override
	public void cell() {
		super.cell();
		System.out.println("响铃+震动");
	}

}
