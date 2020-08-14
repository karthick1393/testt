package projectprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\Desktop\\sel\\New folder\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone mobile phones");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List<WebElement> a=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        int w=a.size();
        System.out.println(w);
        for(int i=0;i<a.size();i++){
        	WebElement b=a.get(i);
        	String s=b.getText();
        	//System.out.println("iphone price list" + s);
        	String n=s.replaceAll(",","");
        	int p=Integer.parseInt(n);
        	if(p>50000){
        		System.out.println(p);
        	}
        	
	}
        }
}