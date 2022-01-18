import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automation {



public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
driver.get("https://www.savaari.com/");
driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[2]/label")).click();





driver.findElement(By.xpath("//*[@id=\"fromCityList\"]")).sendKeys("Chennai");
Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id=\"fromCityList\"]")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[2]/div/input")).sendKeys("NewDelhi");
Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[2]/div/input")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"pickUpTime\"]")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[4]/div/button")).click();




	}

}
