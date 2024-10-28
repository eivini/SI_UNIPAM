<?php
require_once 'config.php';
require_once 'repositories/AnimeRepository.php';

$animeRepo = new AnimeRepository($pdo);
$animes = $animeRepo->getAllAnimes();
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Anime CRUD</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Bem-vindo ao Anime CRUD</h1>
    <nav>
        <a href="./views/listAnime.php">Listar Animes</a> |
        <a href="views/create.php">Adicionar Anime</a> |
        <a href="views/battle.php">Batalha de Animes</a>
    </nav>
</body>
</html>