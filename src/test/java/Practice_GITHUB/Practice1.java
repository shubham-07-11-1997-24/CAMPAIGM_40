package Practice_GITHUB;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
	@Test
	public void TestPractice() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		
		Reporter.log("browser is-----"+browser, true);
		Reporter.log("url is-----"+url, true);
		
	}
	

}
