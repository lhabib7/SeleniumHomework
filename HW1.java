package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//HW1:
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;//create an instance of WebDriver
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        ////  send in the username customer.address.street
        //        driver.findElement(By.id("email")).sendKeys("moazzam");
        driver.findElement(By.id("customer.firstName")).sendKeys("lhabib");
        driver.findElement(By.id("customer.lastName")).sendKeys("bella");
        driver.findElement(By.id("customer.address.street")).sendKeys("1101 Main St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Cortlandt Manor");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10567");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9143824556");
        driver.findElement(By.id("customer.ssn")).sendKeys("212667896");
        driver.findElement(By.id("customer.username")).sendKeys("bouvain");
        driver.findElement(By.id("customer.password")).sendKeys("72361243");
        driver.findElement(By.id("repeatedPassword")).sendKeys("72361243");
        driver.findElement(By.className("button")).click();
        driver.quit();

        }
    }


