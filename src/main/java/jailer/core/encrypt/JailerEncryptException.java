package jailer.core.encrypt;

public class JailerEncryptException extends Exception {

	static final long serialVersionUID = -7724719337974677648L;

	public JailerEncryptException() {
		super();
	}

	public JailerEncryptException(String message) {
		super(message);
	}

	public JailerEncryptException(String message, Throwable cause) {
		super(message, cause);
	}

	public JailerEncryptException(Throwable cause) {
		super(cause);
	}
}