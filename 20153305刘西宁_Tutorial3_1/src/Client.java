import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要加密的字符串：");
		String str = scan.nextLine();
		scan.close();
		
		Factory factory = (Factory) XMLUtil.getBean();
		Encipherment ec = factory.createEncipherment();
		String strEn = str;
		try {
			strEn = ec.encrypt(str);
		} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException e) {
			e.printStackTrace();
		}
		System.out.println("加密后为：" + strEn);
	}
}
