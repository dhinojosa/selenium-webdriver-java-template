package com.xyzcorp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    private ChromeDriver chromeDriver;

    @BeforeAll
    public void setup() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\danno\\chrome-drivers\\98\\chromedriver_win32\\chromedriver");
       chromeDriver = new ChromeDriver();
    }

    @Test
    public void testPage() {
        chromeDriver.get("https://www.google.com/");
        chromeDriver.manage().window().setSize(new Dimension(1758, 1070));
        chromeDriver.findElement(By.name("q")).click();
        chromeDriver.findElement(By.name("q")).sendKeys("Behavior Driven Development");
        chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @AfterAll
    public void cleanup() {
        chromeDriver.close();
    }
}
