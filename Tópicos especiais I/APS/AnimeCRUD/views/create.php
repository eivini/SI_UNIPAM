<?php
require_once '../config.php';
require_once '../repositories/animeRepository.php';

$animeRepo = new AnimeRepository($pdo);

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $title = $_POST['title'];
    $description = $_POST['description'];
    $year = intval($_POST['year']);
    $rating = floatval($_POST['rating']);
    $votes = intval($_POST['votes']);

    $anime = new Anime(null, $title, $description, $year, $rating, $votes);

    $animeRepo->addAnime($anime);

    header("Location: listAnime.php");
    exit();
}
?>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Anime CRUD</title>
    <link rel="stylesheet" href="../css/style.css">
</head>

<h1>Criar Anime</h1>
<form method="POST" action="">
    <label for="title">Título:</label><br>
    <input type="text" id="title" name="title" required><br>

    <label for="description">Descrição:</label><br>
    <textarea id="description" name="description" required></textarea><br>

    <label for="year">Ano:</label><br>
    <input type="number" id="year" name="year" required><br>

    <label for="rating">Avaliação:</label><br>
    <input type="number" step="0.1" id="rating" name="rating" required><br>

    <label for="votes">Votos:</label><br>
    <input type="number" id="votes" name="votes" required><br>

    <input type="submit" value="Criar Anime">
</form>

<a href="listAnime.php">Voltar à lista de animes</a>
<a href="../index.php">Voltar para Início</a>