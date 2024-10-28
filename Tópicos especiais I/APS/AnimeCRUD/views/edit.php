<?php
require_once '../config.php';
require_once '../repositories/AnimeRepository.php';

$animeRepo = new AnimeRepository($pdo);

if (!isset($_GET['id'])) {
    die("ID do anime não especificado.");
}

$animeId = intval($_GET['id']);
$anime = $animeRepo->getAnimeById($animeId);

if (!$anime) {
    die("Anime não encontrado.");
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $title = $_POST['title'];
    $description = $_POST['description'];
    $year = intval($_POST['year']);
    $rating = floatval($_POST['rating']);
    $votes = intval($_POST['votes']);

    $animeRepo->updateAnime($animeId, $title, $description, $year, $rating, $votes);

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

<h1>Editar Anime</h1>
<form method="POST" action="">
    <label for="title">Título:</label><br>
    <input type="text" id="title" name="title" value="<?= htmlspecialchars($anime->getTitle()); ?>" required><br>

    <label for="description">Descrição:</label><br>
    <textarea id="description" name="description" required><?= htmlspecialchars($anime->getDescription()); ?></textarea><br>

    <label for="year">Ano:</label><br>
    <input type="number" id="year" name="year" value="<?= htmlspecialchars($anime->getYear()); ?>" required><br>

    <label for="rating">Avaliação:</label><br>
    <input type="number" step="0.1" id="rating" name="rating" value="<?= htmlspecialchars($anime->getRating()); ?>" required><br>

    <label for="votes">Votos:</label><br>
    <input type="number" id="votes" name="votes" value="<?= htmlspecialchars($anime->getVotes()); ?>" required><br>

    <input type="submit" value="Atualizar Anime">
</form>
<a href="listAnime.php">Voltar à lista de animes</a>