import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepSearch {

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().driverVersion("125.0.6422.141").setup();
        String driverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
        System.out.println("Driver Path: " + driverPath);
    }

    @Test
    void pageShouldContText() {
        open("https://github.com/");
        $(byText("Search or jump to...")).click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid='results-list'] li a").first().click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));
    }


    @Test
    void firstContributor() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors")).shouldBe(Condition.visible)
                .closest("h2")
                .sibling(0)
                .$$("li")
                .first().hover();
        Selenide.sleep(5000);

    }
}





