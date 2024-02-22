package unit;

import org.junit.jupiter.api.Test;

public class SystemUnitTest {
	@Test
	public void test() {
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.name"));
	}

}
