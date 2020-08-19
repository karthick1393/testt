package projectprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\Desktop\\New folder\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x mobile phone");
        driver.findElement(By.xpath("//input[@type='submit']")).click();		
       List<WebElement> a= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for(int i=0;i<a.size();i++){
	if(i==4){
		WebElement b=a.get(i);
		System.out.println(b.getText());
	}
	System.out.println("one");
	System.out.println("test1");
	System.out.println("test2");

}
	}

}
