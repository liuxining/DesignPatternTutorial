import java.util.Hashtable;
import java.util.Set;

public class ChatGroup extends AbstractChatroom {

	private Hashtable<String, Member> members = new Hashtable<String, Member>();

	@Override
	public void register(Member member) {
		members.put(member.getName(), member);
		member.setChatroom(this);
	}

	@Override
	public void sendText(String from, String to, String message) {
		Member member = members.get(to);
		String newMessage = message.replaceAll("日", "*");
		member.receiveText(from, newMessage);
	}

	@Override
	public void sendImage(String from, String to, String image) {
		Member member = members.get(to);
		if(image.length() > 5){
			System.out.println("图片太大，发送失败！");
		}
		else{
			member.receiveImage(from, image);
		}
		
	}

	@Override
	public void sendTextToEvery(String from, String message) {
		Set<String> keySet = members.keySet();
		for (String key : keySet) {
			Member member = members.get(key);
			member.receiveText(from, message);
		}
	}

}
