package in.co.rays.CustomRuntimeException;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("User not Found");
	}

}
