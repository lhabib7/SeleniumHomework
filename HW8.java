package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW8 {
    public static void main(String[] args) throws InterruptedException {
        //1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        //username=Admin
        //password=Hum@nhrm123
        //2. click on PIM option
        //3. from the table select Any  value of id and click the check box associated with it
        //make sure that ur code is dynamic i.e
        //changing the id doesnt effect the logic or xpath
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;//create an instance of WebDriver
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[@id='continue-with-click']")).click();
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

        List<WebElement> table= driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i <table.size() ; i++) {
            String id=table.get(i).getText();
           // System.out.println(id);
            if (id.equalsIgnoreCase("51852A")){
                System.out.println(i);
               driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[2]")).click();
            }
        }



    }
}
