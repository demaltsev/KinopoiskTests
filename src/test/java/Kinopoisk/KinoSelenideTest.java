//package Kinopoisk;
//
//import Base.BaseSelenideTest;
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Selenide;
//import io.qameta.allure.Description;
//import io.qameta.allure.Owner;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static com.codeborne.selenide.Selenide.$$x;
//import static com.codeborne.selenide.Selenide.$x;
//
//public class KinoSelenideTest extends BaseSelenideTest {
//
//    @Test
//    @DisplayName("Проверка расширенного поиска через Selenide")
//    @Owner("Denis Maltsev")
//    @Description("Выполняется проверка поиска")
//    public void checkFilms(){
//        Selenide.open("https://www.kinopoisk.ru/s/");
//        $x("//*[@id='find_film']").sendKeys("Twilight");
//        $x("//form[@id='formSearchMain']//input[@value='поиск']").click();
//        $$x("//div[@class='search_results search_results_last']//p[@class='name']/a")
//                .forEach(x-> System.out.println(x.getText()));
//        $x("//div[@class='element most_wanted']//span[@class='year']")
//                .shouldHave(Condition.text("2000"));
//
//    }
//}
