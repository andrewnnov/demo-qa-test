
import com.codeborne.selenide.Configuration;


import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestBoxTest {

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().driverVersion("125.0.6422.141").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        System.out.println("Driver Path: " + driverPath);
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").sendKeys("Alex Petrov");
        $("#userEmail").sendKeys("AlexPetrov@mail.com");
        $("#currentAddress").sendKeys("Paris, Av.Lib");
        $("#permanentAddress").sendKeys("pr Paris");
        $("#submit").click();
        $("#output").shouldHave(
                text("Alex Petrov"),
                text("AlexPetrov@mail.com"),
                text("Paris, Av.Lib"));
    }
}
