import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelPath {
    public static void main(String[] args) throws InterruptedException{

        //where is geckodriver executable is
        System.setProperty("webdriver.gecko.driver","/Users/haru/Downloads/sele/geckodriver");

        //create an instance of firefox driver
        FirefoxDriver driver=new FirefoxDriver();

        //visiting wikipedia page
        driver.get("https://en.wikipedia.org");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        driver.quit();
    }
}
