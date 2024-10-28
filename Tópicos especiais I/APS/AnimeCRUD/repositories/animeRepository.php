<?php
require_once __DIR__ . '/../models/Anime.php';

class AnimeRepository {
    private $pdo;

    public function __construct($pdo) {
        $this->pdo = $pdo;
    }

    public function getAllAnimes() {
        $stmt = $this->pdo->query("SELECT * FROM animes");
        $animeData = $stmt->fetchAll(PDO::FETCH_ASSOC);
    
        $animes = [];
        foreach ($animeData as $data) {
            $anime = new Anime();
            $anime->hydrate($data); 
            $animes[] = $anime; 
        }
    
        return $animes; 
    }    

    public function getAnimeById($id) {
        $stmt = $this->pdo->prepare("SELECT * FROM animes WHERE id = ?");
        $stmt->execute([$id]);
        $data = $stmt->fetch(PDO::FETCH_ASSOC);
        
        if ($data) {
            $anime = new Anime();
            $anime->hydrate($data);
            return $anime;
        }
        return null; 
    }
    
    public function updateAnime($id, $title, $description, $year, $rating, $votes) {
        $stmt = $this->pdo->prepare("UPDATE animes SET title = ?, description = ?, year = ?, rating = ?, votes = ? WHERE id = ?");
        return $stmt->execute([$title, $description, $year, $rating, $votes, $id]);
    }
    
    public function addAnime($anime) {
        $stmt = $this->pdo->prepare("INSERT INTO animes (title, description, year, rating, votes) VALUES (:title, :description, :year, :rating, :votes)");
        $stmt->execute([
            'title' => $anime->getTitle(),
            'description' => $anime->getDescription(),
            'year' => $anime->getYear(),
            'rating' => $anime->getRating(),
            'votes' => $anime->getVotes()
        ]);
    }

    public function deleteAnime($id) {
        $stmt = $this->pdo->prepare("DELETE FROM animes WHERE id = :id");
        $stmt->execute(['id' => $id]);
    }
}
?>