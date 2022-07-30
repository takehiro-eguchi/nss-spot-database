DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  id INT PRIMARY KEY,
  date DATE,
  userid INT
);

INSERT INTO orders VALUES
  (1, '2014/01/01', 1),
  (2, '2014/01/02', 2),
  (3, '2014/02/01', 1),
  (4, '2014/02/10', 3),
  (5, '2014/05/05', 4);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id INT PRIMARY KEY,
  name TEXT,
  pref TEXT
);

INSERT INTO users VALUES
  (1, '生駒里奈', '秋田県'),
  (2, '生田絵梨花', '東京都'),
  (3, '白石麻衣', '群馬県'),
  (4, '西野七瀬', '大阪府'),
  (5, '橋本奈々未', '北海道'),
  (6, '秋元真夏', '埼玉県'),
  (7, '桜井玲香', '神奈川県'),
  (8, '高山一実', '千葉県'),
  (9, '深川麻衣', '静岡県'),
  (10, '若月佑美', '静岡県');

DROP TABLE IF EXISTS details;
CREATE TABLE details (
  orderid INT,
  itemid INT,
  quantity INT
);

INSERT INTO details VALUES
  (1, 1, 1),
  (1, 2, 2),
  (2, 1, 9),
  (3, 3, 2),
  (4, 5, 100),
  (5, 4, 3);

DROP TABLE IF EXISTS items;
CREATE TABLE items (
  id INT PRIMARY KEY,
  name TEXT,
  price INT
);

INSERT INTO items VALUES
  (1, 'マウス', 1000),
  (2, 'キーボード', 10000),
  (3, 'LANケーブル', 2000),
  (4, 'USBフラッシュメモリ', 500),
  (5, 'dynabook R73/W4M', 181440);

