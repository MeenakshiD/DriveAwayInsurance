package StepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyStepdefs {


    WebDriver driver;

    @Given("user on vwfsinsuranceportal page")
    public void userOnVwfsinsuranceportalPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/abhishekdixit/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");

    }

    @When("user enters vehicle registration number")
    public void userEntersVehicleRegistrationNumber() {

    driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");

    }

    @And("Clicks Find Vehicle button")
    public void clicksFindVehicleButton() {


    driver.findElement(By.xpath("//button[@name='btnfind' and @type='button']")).click();

    }

    @Then("it displays result for registered vehicle")
    public void itDisplaysResultForRegisteredVehicle() throws InterruptedException {



       Thread.sleep(3000);
       List<WebElement> links= driver.findElements(By.xpath("//*[@class='resultDate-bold']//parent::span[@class='resultDate']"));

        System.out.println("Total number of Result"+links.size());

      for (WebElement e:links){
       System.out.println(e.getText());
      }


    }
}
