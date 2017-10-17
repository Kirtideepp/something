package judu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver d= new FirefoxDriver();
	  d.get("http://www.google.com");
	  d.quit();
  }
}
