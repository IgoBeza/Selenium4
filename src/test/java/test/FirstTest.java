package test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {


    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver99.0.4844.51.exe");
        //WebDriverManager.firefoxdriver().setup();

        WebDriverManager.chromedriver().setup();

        //Escolher a versão que quer usar do Chrome
        WebDriverManager.chromedriver().driverVersion("99.0.4844.51").setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
