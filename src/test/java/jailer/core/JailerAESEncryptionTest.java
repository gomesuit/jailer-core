package jailer.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class JailerAESEncryptionTest {

	@Test
	public void test() throws Exception {
		String str = "TESTTESTTEST";
		JailerEncryption encryption = new JailerAESEncryption();
		assertEquals(str, encryption.decoded(encryption.encode(str)));
	}
}