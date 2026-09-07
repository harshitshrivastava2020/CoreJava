package in.co.rays.Interface;

public class ProgrammingLanguage extends Language implements Coding {

	@Override
	public void getName(String name) {
		System.out.println("Programming Language: " + name);

	}

}
