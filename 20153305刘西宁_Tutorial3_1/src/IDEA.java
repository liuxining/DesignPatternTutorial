
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.*;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * 
 */
public class IDEA implements Encipherment {

    /**
     * Default constructor
     */
    public IDEA() {
    }
    
    


	@Override
	public String encrypt(String data) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		String result = "";
		try {
			Security.addProvider(new BouncyCastleProvider());
			
			// 生成key
			KeyGenerator keyGenerator = KeyGenerator.getInstance("IDEA");

			keyGenerator.init(128);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] keyBytes = secretKey.getEncoded();

			// 转换密钥
			Key key = new SecretKeySpec(keyBytes, "IDEA");

			// 加密
			Cipher cipher = Cipher.getInstance("IDEA/ECB/ISO10126Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] r = cipher.doFinal(data.getBytes());

			result = new String(r);
		} catch (Exception e) {
			e.printStackTrace();
			result = "系统异常";
		}
		return result;	
	}

}