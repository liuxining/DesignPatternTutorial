
public class PhoneDectorstor implements Phone {

	private Phone phone;

	public PhoneDectorstor(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void cell() {
		phone.cell();
	}

}
