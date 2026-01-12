# partialLinkTextを変更して自動でリンク先に飛ぶように修正

## 自動でリンク先に飛ばなかった時のコード
### a7a7980
## 修正して自動でリンク先に飛ぶようにした時にコード
### a8e8bde

## なぜリンク先に飛ばなかったのか？
`By.partialLinkText("Selenium") `が原因だった。
最初は部分一致でヒットしたリンクに飛ぶようにコードを書いていたが、どうやらクロム内で検索しようとしていた。


By.partialLinkText("Selenium") で探したHTML
`<a href="...">Selenium</a>`
<a>タグで囲まれたテキストの中に「Selenium」という文字があるリンクを探した

しかし、
Google検索結果のHTMLはこうなってる

```
<a href="https://www.selenium.dev/">
  <h3>Selenium</h3>
</a>


```

「Selenium」という文字は <a> の直接の中身ではなく、<h3>タグの中にある
partialLinkText は <a> タグの直下のテキストしか見ないので、<h3>の中のテキストは見つけられない

## コード修正
```
By.cssSelector("div#search a")
「検索結果エリア（`div#search`）の中にあるリンク」を探し
テキストの内容は関係なく、**HTML構造だけ**で探しているので確実に見つかる
```
