package com.nozama.test;
// Generated by Selenium IDE
// import des modules qui pourront etre utilis�s ensuite
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

//creation d'une suite comprenant les trois tests
/*@RunWith(Suite.class)
@SuiteClasses({SuiteNozama26Test3suite.class})*/

public class Produitdanspanier {

  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void testGoogleSearch() throws InterruptedException {
	// Optional. If not specified, WebDriver searches the PATH for chromedriver.
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://127.0.0.1/nozama/");
    driver.manage().window().setSize(new Dimension(746, 798));
	
	
  }
  
 @After
  public void tearDown() {
    //driver.quit();
  }
  

  @Test
  public void produitdanspanier() {
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#edit-name-wrapper > label"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-name")).click();
    driver.findElement(By.id("edit-name")).sendKeys("demo1");
    
    driver.findElement(By.id("edit-pass")).click();
    driver.findElement(By.id("edit-pass")).sendKeys("demo1");
    {
      List<WebElement> elements = driver.findElements(By.id("edit-submit"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-submit")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Jeux vid�o"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Jeux vid�o")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Wii & DS"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Wii & DS")).click();
    driver.findElement(By.linkText("Nintendo Wii")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("edit-submit-18"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-submit-18")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("edit-continue-shopping"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-continue-shopping")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("edit-search-theme-form-header"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-search-theme-form-header")).sendKeys("nintendo");
    {
      List<WebElement> elements = driver.findElements(By.id("edit-submit-2"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-submit-2")).click();
    driver.findElement(By.linkText("Nintendo DS Lite")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("edit-submit-17"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-submit-17")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("edit-checkout"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.id("edit-checkout")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Se d�connecter"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Se d�connecter")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#edit-name-wrapper > label"));
      assert(elements.size() > 0);
    }
  }
}
