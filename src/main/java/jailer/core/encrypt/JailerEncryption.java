package jailer.core.encrypt;

public interface JailerEncryption {
	public byte[] encrypt(String src) throws JailerEncryptException;
	public String decrypt(byte[] src) throws JailerEncryptException;
}
