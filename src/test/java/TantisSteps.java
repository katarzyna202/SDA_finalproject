import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class TantisSteps {
    private WebDriver driver;

    @Given("Użytkownik znajduje sie na stronie Tantis i akceptuje cookies")
    public void użytkownikZnajdujeSieNaStronieTantis() {
        System.setProperty("webdriver.gecko.driver","C:\\BDD\\cucumber-java-skeleton\\maven\\src\\test\\resources\\geckodriver.exe");
    driver=new FirefoxDriver();
      driver.get("https://tantis.pl/rejestracja");
      driver.findElement(By.id("acceptCookies")).click();
      sleep();
    }

    private void sleep() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Użytkownik wpisuje imię w pole imię")
    public void użytkownikWpisujeImięWPoleImię() {
        driver.findElement(By.id("registrationFirstName")).sendKeys("Kacper");
        sleep();
    }

    @And("Użytkownik wpisuje nazwisko w polu nazwisko")
    public void użytkownikWpisujeNazwiskoWPoluNazwisko() {
        driver.findElement(By.id("registrationLastName")).sendKeys("Soja");
        sleep();
    }

    @And("Użytkownik wpisuje e-mail w pole e-mail")
    public void użytkownikWpisujeEMailWPoleEMail() {
        driver.findElement(By.name("userEmail")).sendKeys("ali@gmail.com");
        sleep();
    }

    @And("Użytkownik wpisuje hasło w pole hasło")
    public void użytkownikWpisujeHasłoWPoleHasło() {
        driver.findElement(By.name("userPassword")).sendKeys("Karzyna85");
        sleep();

    }

    @And("Użytkownik akceptuje regulamin")
    public void użytkownikAkceptujeRegulamin() {
        driver.findElement(By.id("acceptTermsLabel")).click();
        sleep();

    }

    @Then("Użytkownik rejestruje sie")
    public void użytkownikRejestrujeSie() {
        driver.findElement(By.id("registerUserBtn")).click();
        sleep();
    }

    //id="registrationFirstName"
    //registrationLastName
    //userEmail
    //name="userPassword"
    //acceptTermsLabel
}
