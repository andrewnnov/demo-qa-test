import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomeworkForDim {

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().driverVersion("125.0.6422.141").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        //System.out.println("Driver Path: " + driverPath);
    }

    @Test
    void fillFormTest() {
        Selenide.open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Pupkin");
        $("#userEmail").setValue("PupkinVasya@mail.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("1234567890");

        sleep(3000);



    }
}
