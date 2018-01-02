
public class CalculatorForm {
	private AbstractCommand command;

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void compute(int value){
		int result = command.execute(value);
		System.out.println("执行运算，操作数为" + value + ",计算结果为：" + result);
	}
	
	public void undo(){
		int result = command.undo();
		if(result != 65535){
			System.out.println("执行撤销,计算结果为：" + result);
		}
	}
	
	public void redo(){
		int result = command.redo();
		if(result != 65535){
			System.out.println("执行恢复,计算结果为：" + result);
		}
	}
	
	
	

}
