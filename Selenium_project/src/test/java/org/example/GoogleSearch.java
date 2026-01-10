package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Collections;

public class GoogleSearch {
  public static void main(String[] args) throws InterruptedException {

    // オプションを作成
    ChromeOptions options = new ChromeOptions();

    // 「自動テストソフトウェアによって制御されています」というバーを非表示にする
    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    options.setExperimentalOption("useAutomationExtension", false);

    // 自動化の検出フラグ（navigator.webdriver）を隠す【重要】
    options.addArguments("--disable-blink-features=AutomationControlled");

    // オプションを適用してドライバを起動
    //Chromeブラウザを立ち上げ、Googleのトップページへ移動
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.google.com/");

    new WebDriverWait(driver, Duration.ofSeconds(5)).until(
            ExpectedConditions.presenceOfElementLocated(By.className("gLFyf"))
    );
    WebElement inputElement = driver.findElement(By.className("gLFyf"));
    inputElement.sendKeys("Selenium" + Keys.ENTER);

    //検索リンクの要素を追加
    //Seleniumを含むリンク要素を部分一致で取得
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(
            ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Selenium"))
    );
    WebElement link = driver.findElement(By.partialLinkText("Selenium"));
    link.click();

    //すぐブラウザが閉じないように検索結果が出た状態で 10秒間）何もしないで停止し、その後ブラウザを完全に閉じる
    Thread.sleep(10000);
    driver.quit();


  }

  }
