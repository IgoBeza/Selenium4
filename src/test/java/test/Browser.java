package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://google.com");
        String originalWindows = driver.getWindowHandle();
        driver.navigate().to("https://www.selenium.dev/");

        //busca o titulo do site
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        /*
        driver.navigate().back();
        Thread.sleep(2000); //tempo de espera para cada ação
        driver.navigate().forward();
        Thread.sleep(2000); //tempo de espera para cada ação
        driver.navigate().refresh();
        Thread.sleep(2000); //tempo de espera para cada ação
         */

        driver.switchTo().window(originalWindows);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window(originalWindows);

        Thread.sleep(1000);
        driver.close();
    }
}
