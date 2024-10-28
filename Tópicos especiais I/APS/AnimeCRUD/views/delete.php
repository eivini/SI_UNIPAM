<?php
require_once '../config.php';
require_once '../repositories/animeRepository.php';

$repo = new AnimeRepository($pdo);
$repo->deleteAnime($_GET['id']);
header("Location: ../index.php");
exit;
?>