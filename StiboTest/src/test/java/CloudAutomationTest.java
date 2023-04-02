import org.junit.Test;
import org.junit.Before;
import org.junit.After;
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
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.safari.SafariDriver.WindowType;
 
/**
 *
 * @author Lasse
 */
public class CloudAutomationTest {

       public CloudAutomationTest() {
    }
       
    private WebDriver driver;
    private Map <String,Object> vars;
     
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lasse\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        vars = new HashMap<String, Object>();
        
    }
 
    @After
    public void tearDown() {
        driver.quit();
    }
 
  @Test
  public void completeTest() throws InterruptedException {
    // Test name: CompleteTest
    // Step # | name | target | value
    // 1 | open | https://www.sherwin-williams.com/ | 
    driver.get("https://www.sherwin-williams.com/");
    // 2 | setWindowSize | 1265x1176 | 
    driver.manage().window().setSize(new Dimension(1265, 1176));
    // 3 | mouseOver | css=#tab-1 > .cmp-nav__tab-item--text | 
    {
      WebElement element = driver.findElement(By.cssSelector("#tab-1 > .cmp-nav__tab-item--text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | click | css=#tab-1 > .cmp-nav__tab-item--text | 
    driver.findElement(By.cssSelector("#tab-1 > .cmp-nav__tab-item--text")).click();
    // 5 | mouseOut | css=#tab-1 > .cmp-nav__tab-item--text | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 6 | mouseOver | id=tab-1-sublink-3 | 
    {
      WebElement element = driver.findElement(By.id("tab-1-sublink-3"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 7 | click | css=#container-7c376eebc0 .linklist:nth-child(2) .cmp-linklist__item:nth-child(1) .cmp-linklist__item--text | 
    driver.findElement(By.cssSelector("#container-7c376eebc0 .linklist:nth-child(2) .cmp-linklist__item:nth-child(1) .cmp-linklist__item--text")).click(); 
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 8 | click | id=SimpleSearchForm_SearchTerm |
    driver.findElement(By.id("SimpleSearchForm_SearchTerm")).click();
    // 9 | type | id=SimpleSearchForm_SearchTerm | tuberose paint
    driver.findElement(By.id("SimpleSearchForm_SearchTerm")).sendKeys("tuberose paint");
    // 10 | sendKeys | id=SimpleSearchForm_SearchTerm | ${KEY_ENTER}
    driver.findElement(By.id("SimpleSearchForm_SearchTerm")).sendKeys(Keys.ENTER);
     
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 11 | click | id=title-6578 |
    driver.findElement(By.id("title-6578")).click(); 
    
    if(driver.getCurrentUrl().endsWith("https://www.sherwin-williams.com/en-us/color/color-family/red-paint-colors/SW6578-tuberose"))
    {
      System.out.println("URL is correct");
    }
    
    else
    {
        System.out.println("URL is not correct");
    }
    
    driver.switchTo().newWindow(WindowType.TAB);
     
    driver.get("https://www.sherwin-williams.com/en-us/color/color-family/red-paint-colors/SW6578-tuberose");
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 12 | click | css=.breadcrumb:nth-child(1) |
    driver.findElement(By.cssSelector(".breadcrumb:nth-child(1)")).click();
    // 13 | verifyText | css=.cmp-breadcrumb__item:nth-child(3) | SW 6578 Tuberose
    assertThat(driver.findElement(By.cssSelector(".cmp-breadcrumb__item:nth-child(3)")).getText(), is("SW 6578 Tuberose"));
    // 14 | click | css=.tw-pt-16\.5 .ib | 
    driver.findElement(By.cssSelector(".tw-pt-16\\.5 .ib")).click(); 
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 15 | click | css=.tw-mb-0:nth-child(3) |
    driver.findElement(By.cssSelector(".tw-mb-0:nth-child(3)")).click();
    // 16 | assertText | css=.tw-mb-0:nth-child(3) | Hex Value: #D47C8C
    assertThat(driver.findElement(By.cssSelector(".tw-mb-0:nth-child(3)")).getText(), is("Hex Value: #D47C8C"));
    // 17 | click | css=.tw-pt-16\.5 .group-cta-buttons--four-buttons:nth-child(1) > .cta-button__text | 
    vars.put("window_handles", driver.getWindowHandles());
    // 18 | storeWindowHandle | root | 
    driver.findElement(By.cssSelector(".tw-pt-16\\.5 .group-cta-buttons--four-buttons:nth-child(1) > .cta-button__text")).click();
    // 19 | selectWindow | handle=${win4072} | 
    vars.put("win4072", waitForWindow(2000));
    // 20 | click | css=.OptionsModal__close-btn | 
    vars.put("root", driver.getWindowHandle());
    // 21 | assertText | css=.p-2\.5 | Tuberose\nSW 6578\nOrder samples
    driver.switchTo().window(vars.get("win4072").toString());
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 22 | close |  | 
    driver.findElement(By.cssSelector(".OptionsModal__close-btn")).click(); 
    
    Thread.sleep(Long.parseLong("5000"));
    
    // 23 | click | css=.ml-0\.5 > span | 
    driver.findElement(By.cssSelector(".ml-0\\.5 > span")).click();
    // 24 | type | id=SearchBarInput1 | tuberose
    driver.findElement(By.id("SearchBarInput1")).sendKeys("tuberose");
    // 25 | click | css=.p-2\.5 | 
    
    Thread.sleep(Long.parseLong("5000"));
    
    driver.findElement(By.cssSelector(".p-2\\.5")).click();
    // 26 | assertText | css=.p-2\.5 | Tuberose\nSW 6578\nOrder samples
   assertThat(driver.findElement(By.cssSelector(".p-2\\.5")).getText(), is("SW 6578\\n\\nTuberose\\n\\nOrder samples"));
    // 27 | close |  | 
    driver.close();   
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
}