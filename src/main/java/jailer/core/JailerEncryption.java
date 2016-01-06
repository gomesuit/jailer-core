package jailer.core;

public interface JailerEncryption {
	public byte[] encode(String src) throws Exception;
	public String decoded(byte[] src) throws Exception;
}
