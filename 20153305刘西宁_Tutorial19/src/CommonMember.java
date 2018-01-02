
public class CommonMember extends Member {

	public CommonMember(String name){
		super(name);
	}
	
	@Override
	public void sendText(String to, String message) {
		System.out.println("普通会员发送消息：");
		chatroom.sendText(name, to, message);
		
	}

	@Override
	public void sendImage(String to, String message) {
		System.out.println("普通会员不能发送图片！");
		
	}

	@Override
	public void sendToEvery(String message) {
		System.out.println("普通会员发送消息（给每个人）：");
		chatroom.sendTextToEvery(name, message);
	}

}
