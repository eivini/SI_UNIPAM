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

<h1>Lista de Animes</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Título</th>
        <th>Descrição</th>
        <th>Ano</th>
        <th>Avaliação</th>
        <th>Votos</th>
        <th>Ações</th>
    </tr>
    <?php foreach ($animes as $anime): ?>
    <tr>
        <td><?= $anime->getId(); ?></td>
        <td><?= $anime->getTitle(); ?></td>
        <td><?= htmlspecialchars($anime->getDescription()); ?></td>
        <td><?= $anime->getYear(); ?></td>
        <td><?= $anime->getRating(); ?></td>
        <td><?= $anime->getVotes(); ?></td>
        <td>
            <a href="../views/edit.php?id=<?= $anime->getId(); ?>">Editar</a> |
            <a href="../views/delete.php?id=<?= $anime->getId(); ?>">Excluir</a>
        </td>
    </tr>
    <?php endforeach; ?>
</table>
<a href="../index.php">Voltar para Início</a>