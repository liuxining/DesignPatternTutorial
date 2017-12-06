
public class HunJieSuoProxy implements IHunJieSuo {

	private int age;
	private RealHunJieSuo realHunJieSuo = new RealHunJieSuo();
	
	@Override
	public void findObj() {
		System.out.println("你的年龄是：" + age);
		if(age < 18){
			System.out.println("对不起，不能早恋！");
		}
		else{
			realHunJieSuo.findObj();
		}
	}
	
	public HunJieSuoProxy(){
		
	}

	public HunJieSuoProxy(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
