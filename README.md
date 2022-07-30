# nss-spot-database
NSSのスポット講義（データベース）で利用するレポジトリです。

# 前提条件
## PostgreSQLのインストール
PostgresSQLをインストールしてください。以下の条件でインストールしてください。

|項目|設定値|
|---|---|
|スーパーユーザパスワード|postgres|
|ポート番号|5432|

## 利用テーブルの作成
コマンドプロンプトより以下のコマンドを実行し、テーブルの作成を行う。

```
psql -U postgres -f dml1_create.sql
psql -U postgres -f dml1_create2.sql
psql -U postgres -f transaction.sql
```