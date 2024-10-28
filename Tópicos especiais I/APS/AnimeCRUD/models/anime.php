<?php
class Anime {
    private $id;
    private $title;
    private $description;
    private $year;
    private $rating;
    private $votes;

    public function __construct($id = null, $title = '', $description = '', $year = 0, $rating = 0.0, $votes = 0) {
        $this->id = $id;
        $this->title = $title;
        $this->description = $description;
        $this->year = $year;
        $this->rating = $rating;
        $this->votes = $votes;
    }

    public function hydrate(array $data) {
        $this->id = $data['id'] ?? null;
        $this->title = $data['title'] ?? '';
        $this->description = $data['description'] ?? '';
        $this->year = $data['year'] ?? 0;
        $this->rating = $data['rating'] ?? 0.0;
        $this->votes = $data['votes'] ?? 0;
    }

    public function getId() { return $this->id; }
    public function getTitle() { return $this->title; }
    public function getDescription() { return $this->description; }
    public function getYear() { return $this->year; }
    public function getRating() { return $this->rating; }
    public function getVotes() { return $this->votes; }
}
?>