package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Tricentis {
	WebDriver driver;
	
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
	}
	
	
	
	@Given("que esteja no site: {string}")
	public void que_esteja_no_site(String url) {
		driver.get(url);
		
	}

	@When("esteja na pagina de Enter Vehicle Data preencho os {string}")
	public void esteja_na_pagina_de_enter_vehicle_data_preencho_os(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("esteja na pagina de Enter Insurant Data preencho os {string}")
	public void esteja_na_pagina_de_enter_insurant_data_preencho_os(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a cotacao sera realizada")
	public void a_cotacao_sera_realizada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}
