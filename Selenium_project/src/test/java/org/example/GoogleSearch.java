package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.Keys;

public class GoogleSearch {
  public static void main(String[] args) throws InterruptedException {
    //Chromeブラウザを立ち上げ、Googleのトップページへ移動
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

    //すぐブラウザが閉じないように検索結果が出た状態で 10秒間）何もしないで停止し、その後ブラウザを完全に閉じる
    Thread.sleep(10000);
    driver.quit();


  }

  }
