DROP TABLE IF EXISTS characters;
 
CREATE TABLE characters (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  info VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO characters (first_name, last_name, info) VALUES
  ('Bart', 'Simpson', 'The troublemaker'),
  ('Milhouse', 'Van Houten', 'Bart''s best friend'),
  ('Ralph', 'Wiggum', 'Chief Wiggum''s son');