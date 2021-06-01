import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.concurrent.TimeUnit;

public class Enter_Insurant_Data {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDiverv2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
				
		
		
		WebElement firstname = driver.findElement(By.id("firstname"));
		WebElement lastname = driver.findElement(By.id("lastname"));
		WebElement birthdate = driver.findElement(By.id("birthdate"));
		WebElement radioM = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		WebElement radioF = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
		WebElement streetaddress = driver.findElement(By.id("streetaddress"));
		WebElement country = driver.findElement(By.id("country"));
		WebElement zipcode = driver.findElement(By.id("zipcode"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement occupation = driver.findElement(By.id("occupation"));
		WebElement radioSpeeding = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		WebElement radioBungeeJumpingg = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span"));
		WebElement radioCliffDiving = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span"));
		WebElement radioSkydiving = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span"));
		WebElement radioOther = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span"));
		WebElement website = driver.findElement(By.id("website"));
		WebElement text = driver.findElement(By.id("text"));
		WebElement nextenterproductdata = driver.findElement(By.id("nextenterinsurantdata"));
		
		
		
		
		
		firstname.sendKeys("Audi");
		lastname.sendKeys("Scooter");
		birthdate.sendKeys("21/10/2021");
		radioM.click();
		radioF.click();
		streetaddress.sendKeys("123");
		country.sendKeys("CUBA");
		zipcode.sendKeys("04848410");
		city.sendKeys("São Paulo");
		occupation.sendKeys("Qualidade");
		radioSpeeding.click();
		radioBungeeJumpingg.click();
		radioCliffDiving.click();
		radioSkydiving.click();
		radioOther.click();
		website.sendKeys("https://cucumber.io/");
		text.sendKeys("caminho");
		nextenterproductdata.click();		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

