package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver99.0.4844.51.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
