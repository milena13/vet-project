DROP TABLE IF EXISTS dog;

CREATE TABLE dog (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  dog_name VARCHAR(250) NOT NULL,
  dog_breed VARCHAR(250) NOT NULL,
);

INSERT INTO dog (dog_name, dog_breed) VALUES
  ('Catita', 'Bichon Bolognese'),
  ('Missy', 'Yorkshire Terrier'),
  ('Culita', 'Bichon Maltese');