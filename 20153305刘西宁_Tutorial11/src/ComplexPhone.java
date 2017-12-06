
public class ComplexPhone extends PhoneDectorstor {

	public ComplexPhone(Phone phone) {
		super(phone);
	}

	@Override
	public void cell() {
		super.cell();
		System.out.println("响铃+震动+灯光闪烁");
	}

}
