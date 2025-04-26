import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class firstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.navigator.ba");
        System.out.println("Title: " + driver.getTitle());

        WebElement searchField = driver.findElement(By.className("ember-text-field"));
        searchField.click();
        searchField.sendKeys("Atlantbh");

        WebDriverWait delay = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement suggestion = delay.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p")));
        suggestion.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addressElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.address")));
        String address = addressElement.getText();

        if (address.equals("Milana Preloga 12A - Bosmal City Center")) {
            System.out.print("You've successfully located Atlantbh!");
        } else {
            System.out.print("Atlantbh not found at a specified address!");
        }
    }
}