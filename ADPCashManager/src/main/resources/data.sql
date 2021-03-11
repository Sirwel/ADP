DROP TABLE IF EXISTS Currency;

CREATE TABLE Currency (
  currency_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  currency_name VARCHAR(250) NOT NULL,
  currency_type VARCHAR(250) NOT NULL,
  currency_value DECIMAL NOT NULL,
  currency_availability BIGINT NOT NULL  
);

INSERT INTO Currency (currency_name, currency_type, currency_value,currency_availability) VALUES
  ('Dollar', 'Bill', 1,0),
  ('Dollar', 'Bill', 2,0),
  ('Dollar', 'Bill', 5,0),
  ('Dollar', 'Bill', 10,0),
  ('Dollar', 'Bill', 20,0),
  ('Dollar', 'Bill', 50,0),
  ('Dollar', 'Bill', 100,0),
  ('Dollar', 'Coin', 0.01,100),
  ('Dollar', 'Coin', 0.05,100),
  ('Dollar', 'Coin', 0.10,100),
  ('Dollar', 'Coin', 0.25,100);
  
  

  
  