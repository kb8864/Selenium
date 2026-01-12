# [da847ff](https://github.com/kb8864/QA_Automation_Lab/pull/2/commits/da847ff86c76f099bfa90d0ebca9331858c4d1bc)

https://github.com/user-attachments/assets/39680809-e45b-4ff9-9a92-ba7284b0d47a

- クロムを開いて特定の用語「Selenium」と自動で入力されて、ブラウザ検索できるような動きを追加
- コードでは 「検索ボックスが出るまで待つ」という待機を追加。

```    new WebDriverWait(driver, Duration.ofSeconds(5)).until(
            ExpectedConditions.presenceOfElementLocated(By.className("gLFyf"))
    );
```
