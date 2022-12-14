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
  (1, 'Άξ’ή', 'Hc§'),
  (2, 'ΆcGΤ', 's'),
  (3, 'Ξί', 'Qn§'),
  (4, 'Όμ΅£', 'εγ{'),
  (5, '΄{ήX’', 'kCΉ'),
  (6, 'H³^Δ', 'ιΚ§'),
  (7, 'χδζ', '_ήμ§'),
  (8, 'Rκΐ', 'ηt§'),
  (9, '[μί', 'Γͺ§'),
  (10, 'αCό', 'Γͺ§');

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
  (1, '}EX', 1000),
  (2, 'L[{[h', 10000),
  (3, 'LANP[u', 2000),
  (4, 'USBtbV', 500),
  (5, 'dynabook R73/W4M', 181440);

