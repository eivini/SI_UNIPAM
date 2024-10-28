<?php
require_once '../config.php';
require_once '../repositories/animeRepository.php';

$animeRepo = new AnimeRepository($pdo);
$animes = $animeRepo->getAllAnimes();
?>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Anime CRUD</title>
    <link rel="stylesheet" href="../css/style.css">
</head>

<h1>Batalha de Animes</h1>
<form method="POST" action="">
    <label for="anime1">Escolha o primeiro anime:</label>
    <select id="anime1" name="anime1">
        <?php foreach ($animes as $anime): ?>
            <option value="<?= $anime->getId(); ?>"><?= $anime->getTitle(); ?></option>
        <?php endforeach; ?>
    </select>

    <label for="anime2">Escolha o segundo anime:</label>
    <select id="anime2" name="anime2">
        <?php foreach ($animes as $anime): ?>
            <option value="<?= $anime->getId(); ?>"><?= $anime->getTitle(); ?></option>
        <?php endforeach; ?>
    </select>

    <input type="submit" value="Comparar Animes">
</form>

<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $anime1Id = intval($_POST['anime1']);
    $anime2Id = intval($_POST['anime2']);

    $anime1 = $animeRepo->getAnimeById($anime1Id);
    $anime2 = $animeRepo->getAnimeById($anime2Id);

    if ($anime1->getRating() > $anime2->getRating()) {
        $winner = $anime1;
        $loser = $anime2;
    } elseif ($anime1->getRating() < $anime2->getRating()) {
        $winner = $anime2;
        $loser = $anime1;
    } else {
        echo "<h3>Os animes têm a mesma avaliação!</h3>";
        exit();
    }

    echo "<h3>Resultado da Batalha!</h3>";
    echo "<p>Vencedor: " . htmlspecialchars($winner->getTitle()) . " com avaliação " . $winner->getRating() . "!</p>";
    echo "<p>Perdedor: " . htmlspecialchars($loser->getTitle()) . " com avaliação " . $loser->getRating() . ".</p>";
}
?>
<a href="../index.php">Voltar para Início</a>