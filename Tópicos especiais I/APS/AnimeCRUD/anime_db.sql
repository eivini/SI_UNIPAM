CREATE DATABASE IF NOT EXISTS anime_db;
USE anime_db;

CREATE TABLE animes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    year YEAR,
    rating DECIMAL(3, 1),
    votes INT DEFAULT 0
);

INSERT INTO animes (title, description, year, rating, votes) VALUES
('Naruto', 'Um jovem ninja que busca reconhecimento e sonha em se tornar Hokage.', 2002, 8.3, 0),
('One Piece', 'As aventuras de Luffy e sua tripulação em busca do tesouro One Piece.', 1999, 9.0, 0),
('Attack on Titan', 'A humanidade luta contra gigantes que ameaçam sua existência.', 2013, 9.1, 0),
('Death Note', 'Um estudante descobre um caderno que concede o poder de matar qualquer pessoa.', 2006, 8.6, 0),
('Fullmetal Alchemist: Brotherhood', 'Dois irmãos tentam restaurar seus corpos após uma transmutação proibida.', 2009, 9.2, 0);