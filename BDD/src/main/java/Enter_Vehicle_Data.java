import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import java.util.concurrent.TimeUnit;

public class Enter_Vehicle_Data {
	
	public static void main(String[] args) throws SikuliException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDiverv2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		
		Screen screen = new Screen();
		
		Pattern imagem1 = new Pattern("C:\\Users\\Mauricio\\Documents\\Curso Git\\nomearquivo.png");
		Pattern imagem2 = new Pattern("C:\\Users\\Mauricio\\Documents\\Curso Git\\abrirarquivo.png");
		Pattern imagem3 = new Pattern("C:\\Users\\Mauricio\\Documents\\Curso Git\\finalizar.png");
				
		
		WebElement make = driver.findElement(By.id("make"));
		WebElement model = driver.findElement(By.id("model"));
		WebElement cylindercapacity = driver.findElement(By.id("cylindercapacity"));
		WebElement engineperformance = driver.findElement(By.id("engineperformance"));
		WebElement dateofmanufacture = driver.findElement(By.id("dateofmanufacture"));
		WebElement numberofseats = driver.findElement(By.id("numberofseats"));
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
		WebElement numberofseatsmotorcycle = driver.findElement(By.id("numberofseatsmotorcycle"));
		WebElement fuel = driver.findElement(By.id("fuel"));
		WebElement payload = driver.findElement(By.id("payload"));
		WebElement listprice = driver.findElement(By.id("listprice"));
		WebElement totalweight = driver.findElement(By.id("totalweight"));
		WebElement licenseplatenumber = driver.findElement(By.id("licenseplatenumber"));
		WebElement annualmileage = driver.findElement(By.id("annualmileage"));
		WebElement nextenterinsurantdata = driver.findElement(By.id("nextenterinsurantdata"));
		
		
		
		
		
		
		make.sendKeys("Audi");
		model.sendKeys("Scooter");
		cylindercapacity.sendKeys("123");
		engineperformance.sendKeys("123");
		dateofmanufacture.sendKeys("01/05/2021");
		numberofseats.sendKeys("1");
		numberofseatsmotorcycle.sendKeys("2");
		radio2.click();
		radio1.click();
		fuel.sendKeys("Petrol");
		payload.sendKeys("500");
		totalweight.sendKeys("500");
		listprice.sendKeys("500");
		licenseplatenumber.sendKeys("500");
		annualmileage.sendKeys("500");
		nextenterinsurantdata.click();		
				
		

		
		
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
		WebElement arquivo = driver.findElement(By.id("open"));
		WebElement nextenterproductdata = driver.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]"));
		
		
		
		
		
		firstname.sendKeys("Audi");
		lastname.sendKeys("Scooter");
		birthdate.sendKeys("03/10/1990");
		radioM.click();
		radioF.click();
		streetaddress.sendKeys("123");
		country.sendKeys("CUBA");
		zipcode.sendKeys("04848410");
		city.sendKeys("São Paulo");
		occupation.sendKeys("Farmer");
		radioSpeeding.click();
		radioBungeeJumpingg.click();
		radioCliffDiving.click();
		radioSkydiving.click();
		radioOther.click();
		website.sendKeys("https://cucumber.io/");
		arquivo.click();
		screen.type(imagem1,"C:\\Users\\Mauricio\\Pictures\\lily.png");
		screen.click(imagem2);
		nextenterproductdata.click();
	
		
		WebElement startdate = driver.findElement(By.id("startdate"));
		WebElement insurancesum = driver.findElement(By.id("insurancesum"));
		WebElement meritrating = driver.findElement(By.id("meritrating"));
		WebElement damageinsurance = driver.findElement(By.id("damageinsurance"));
		WebElement euro = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
		WebElement legaldef = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span"));
		WebElement courtesycar = driver.findElement(By.id("courtesycar"));
		WebElement nextselectpriceoption = driver.findElement(By.id("nextselectpriceoption"));
		
		
		
		startdate.sendKeys("01/21/2023");
		insurancesum.sendKeys("30.000.000,00");
		meritrating.sendKeys("Bonus 8");
		damageinsurance.sendKeys("Full Coverage");
		legaldef.click();
		euro.click();
		courtesycar.sendKeys("Yes");
		nextselectpriceoption.click();
		
		
		
		WebElement silver = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span"));
		WebElement gold = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span"));
		WebElement platinun = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"));
		WebElement utimeite = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));
		WebElement nextsendquote = driver.findElement(By.xpath("//*[@id=\"nextsendquote\"]"));
		
		
		
		silver.click();
		gold.click();
		platinun.click();
		utimeite.click();
		Thread.sleep(3000);
		nextsendquote.click();
		
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement phone = driver.findElement(By.id("phone"));
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement confirmpassword = driver.findElement(By.id("confirmpassword"));
		WebElement comments = driver.findElement(By.id("Comments"));
		WebElement sendemail = driver.findElement(By.id("sendemail"));
		
		
		
		email.sendKeys("teste@teste.com");
		phone.sendKeys("5511987458512");
		username.sendKeys("Teste");
		password.sendKeys("85Q4152ewq");
		confirmpassword.sendKeys("85Q4152ewq");
		comments.sendKeys("sadfsadasdadateste");
		sendemail.click();
		Thread.sleep(10000);
		screen.click(imagem3);
		
		
		
		
	}
	
	
}
