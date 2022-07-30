DROP TABLE IF EXISTS postnumber;
CREATE TABLE postnumber (
  code INT,
  postalcode TEXT,
  town TEXT,
  city TEXT,
  pref TEXT
);

INSERT INTO postnumber VALUES
  (13101, '1020072', '”Ñ“c‹´', 'ç‘ã“c‹æ', '“Œ‹ž“s'),
  (13101, '1010044', '’b–è’¬', 'ç‘ã“c‹æ', '“Œ‹ž“s'),
  (13120, '1760005', 'ˆ®‹u',   '—û”n‹æ'  , '“Œ‹ž“s'),
  (13207, '1960025', '’©“ú’¬', 'º“‡Žs'  , '“Œ‹ž“s'),
  (13213, '1890012', '”‹ŽR’¬', '“Œ‘ºŽRŽs', '“Œ‹ž“s'),
  (13103, '1070061', '–kÂŽR', '`‹æ'    , '“Œ‹ž“s'),
  (13101, '1020071', '•xŽmŒ©', 'ç‘ã“c‹æ', '“Œ‹ž“s'),
  (13103, '1060041', '–ƒ•z‘ä', '`‹æ'    , '“Œ‹ž“s'),
  (13120, '1760002', '÷‘ä'  , '—û”n‹æ'  , '“Œ‹ž“s'),
  (4101,  '9800002', '•Ÿ‘ò’¬', 'Â—t‹æ'  , '‹{éŒ§');