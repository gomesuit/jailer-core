package jailer.core.encrypt;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class JailerNonEncryption implements JailerEncryption{
	private static final Charset charset = StandardCharsets.UTF_8;

	@Override
	public byte[] encrypt(String str) {
		if(str == null) return null;
		
		byte[] encodedBytes = str.getBytes(charset);
		return encodedBytes;
	}

	@Override
	public String decrypt(byte[] src) {
		if(src == null) return null;
		
		return new String(src, charset);
	}

}
