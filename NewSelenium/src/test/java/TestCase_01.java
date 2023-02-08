import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TestCase_01 {
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
        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("(//input[@id='id_gender2'])[1]")).click();
        driver.findElement(By.xpath("(//input[@id='password'])[1]")).click();
        Select day = new Select(driver.findElement(By.xpath("(//select[@id='days'])[1]")));
        day.selectByValue("4");
        Select month = new Select(driver.findElement(By.xpath("(//select[@id='months'])[1]")));
        month.selectByVisibleText("May");
        Select year = new Select(driver.findElement(By.xpath("(//select[@id='years'])[1]")));
        year.selectByValue("1999");

        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    }
}
