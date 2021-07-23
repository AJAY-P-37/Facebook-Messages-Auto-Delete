package SE_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMsgDel {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJAY\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("m_login_email")).sendKeys("ajaykri3.7@gmail.com");
		driver.findElement(By.id("m_login_password")).sendKeys("********");
		driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='page']/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[5]/div[1]/button[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='page']/div[@id='rootcontainer']/div[@id='root']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();
		Thread.sleep(3000);

		int messagesDeleted = 0;
		try{
			while(true){
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/select[1]/option[3]")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Delete")).click();
				Thread.sleep(6000);

				messagesDeleted++;
				}
		}
		catch(Exception e){
			driver.quit();
			System.out.println(messagesDeleted + " messages were Deleted");
		}
	}
}
