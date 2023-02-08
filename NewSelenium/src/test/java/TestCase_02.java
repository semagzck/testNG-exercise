import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase_02 {
    public static void main(String[] args) {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com/");
        //3. Verify that home page is visible successfully
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        Assert.assertTrue(logo.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        //5. Verify 'New User Signup!' is visible
        WebElement text = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
        Assert.assertTrue(text.isDisplayed());
        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sema");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("semagzckk@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement text1 = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
        Assert.assertTrue(text1.isDisplayed());
        //9. Click 'Delete Account' button
        driver.findElement(By.xpath(""));
        //10. Verify that 'ACCOUNT DELETED!' is visible
    }
}