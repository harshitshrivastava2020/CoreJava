package in.co.rays.CustomRuntimeException;

public class TestLoginException {
	public static void main(String[] args) {
		String UserId = "user@gmail.com";

		if (UserId == "admin") {
			System.out.println("user not found");
		} else {
			try {
				throw new LoginException();
			} catch (LoginException e) {
				System.out.println("Custom Login Exception" + e.getMessage());
				e.printStackTrace();
			}
		}

	}
}
