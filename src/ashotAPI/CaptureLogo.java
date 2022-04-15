package ashotAPI;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogo {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\Desktop\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com"); 
		WebElement logo =	driver.findElement(By.xpath("//div[@class='login_logo']"));
			
		Screenshot logoImgScreenShot	=new AShot().takeScreenshot(driver, logo);
        ImageIO.write(logoImgScreenShot.getImage(),"png",new File("C:\\Users\\kk\\Desktop\\File\\sause.png"));
		File f = new File("C://Users/kk/Desktop/File/sause.png");
		if(f.exists())
		{
			System.out.println("image is captured");
		}
		
		else
		{
			System.out.println("Image file does not exit");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}


}
