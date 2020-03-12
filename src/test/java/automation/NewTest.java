package automation;

import com.sun.deploy.association.Action;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class NewTest {
    @Test
    /*public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath ("//img[@alt = 'Printed Dress']")));
        element.click();

     */
   /* public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(800, 600));

        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.get ("http://the-internet.herokuapp.com/windows");
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Click Here')]")));
        element.click();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        driver.close();



    */
   /* public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement search = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        search.sendKeys("Blouse");
        search.sendKeys(Keys.ENTER);
        WebElement found = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'result']")));
        String text = found.getText();
        if ((found.isDisplayed())) {
            System.out.println("'элемент отобразился");
            System.out.println(text);
        }
    }


}
*/
    /*public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Your content goes here.']")));
        element.clear();
        driver.switchTo().defaultContent();
        WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Your content goes here.']")));
    }
}

     */
   /* public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button['Click for JS Alert']")));
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement element1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']")));
        element1.click();
        alert = driver.switchTo().alert();
        alert.accept();
        WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Click for JS Prompt']")));
        element2.click();
        alert = driver.switchTo().alert();
        alert.sendKeys("test");
        alert.accept();
    }
}
*/
   /* public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
        System.out.println("Get text method:"+ element.getText());
        System.out.println("Get text by JS:"+ getTextByJavascript(driver, element));
    }

    public String getTextByJavascript(WebDriver driver, final WebElement element) {
        String script = "var element = arguments[0]; return element.textContent";
        return (String) ((JavascriptExecutor) driver).executeScript(script, element);
    }
}*/
    public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement hot = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[id='hot-spot']")));
        Actions builder = new Actions(driver);
        builder.contextClick(hot).build().perform();
    }
}