import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEG {

    public static org.openqa.selenium.WebDriver driver;

    @BeforeAll
    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/minas/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Get WebElement")
    public void WebDriverGetElement() {
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Web Element" + Keys.ENTER);
    }

    @Test
    @DisplayName("Find WebElement 1")
    public void WebDriverFindElement(){
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("somemail@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("somepassword");
        WebElement log = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
        log.click();
        WebElement error = driver.findElement(By.xpath("//body/div[@id='u_0_2_IH']/div[@id='globalContainer']/div[@id='content']/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]"));
        System.out.println(error.getText());
    }

    @Test
    @DisplayName("Find WebElement 2")
    public void WebDriverFindElementForIMAUA(){
        driver.get("https://im.aua.am/Account/Login");
        WebElement email = driver.findElement(By.id("UserName"));
        email.sendKeys("somemthing@gmail.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("auapassword");
        WebElement log = driver.findElement(By.className("t-button t-normal-button aua_form_btn right uppercase"));
        log.click();
        WebElement error = driver.findElement(By.cssSelector("#divError"));
        System.out.println(error.getText());
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}