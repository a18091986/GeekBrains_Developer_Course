<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>1. Основы PHP (семинары)</title>
</head>
<body>
<?php
$a = 5;
$b = '05';
var_dump($a == $b);
echo 'Результат TRUE потому, что сравнение по значению, а не по типу, переменная  b была приведена к INT';
echo '<br>';

var_dump((int)'012345');
echo '<br>';
echo 'Приведение к десятичному числу';

var_dump((float)123.0 === (int)123.0);
echo '<br>';
echo 'Результат FALSE потому, что сравнение по по типу';

var_dump(0 == 'hello, world');
echo 'Результат FALSE потому, что строка не пуста';

echo '<br>';
echo '<hr>';

$a = 10;
$b = 25;
echo 'Переменная a до замены: ' . $a . "</ br>";
echo 'Переменная b до замены: ' . $b . "</ br>";

$a = $a + $b;
$b = $a - $b;
$a = $a - $b;
echo '<hr>';

echo 'Переменная a после замены: ' . $a . "</ br>";
echo 'Переменная b после замены: ' . $b . "</ br>"

?>
</body>
</html>