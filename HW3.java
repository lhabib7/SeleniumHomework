package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//use xpath to complete this
//goto http://practice.syntaxtechs.net/basic-first-form-demo.php (edited)
//Syntax - Website to practice Syntax Automation Platform
//Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web applications around the world.
//enter the message in the text box
//click on show message
//Enter value of a (edited)
//Enter value of B
//click on the button get total
//also please print the value of the attribute type of the button GET TOTAL
public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement msg= driver.findElement(By.xpath("//input[contains(@name,'username')]"));
       msg.sendKeys("lhabib");
    }
}
