Funções
=======
Criando uma função
------------------

`style.scss` :
```
@function calc-fluid ($target, $container) {
  @return ($target/$container) * 100%;
}

div {
 width: calc-fluid(500, 1000);
}
```
`style.css` gerado :
```
div {
  width: 50%; }
```

Funções nativas do SASS
-----------------------

### Funções com cor
-   `rgb`($red, $green, $blue) Retorna uma cor de acordo com os valores passados para o vermelho, verde e azul.  
-   `rgba`($red, $green, $blue, $alpha) Retorna uma cor de acordo com os valores passados para o vermelho, verde, azul e alpha.
-   `lighten`($color, $amount) Retorna a cor mais clara de acordo com a cor e porcentagem de claridade passada como argumento.
-   `darken`($color, $amount) Escurece a cor de acordo porcentagem passada como argumento.
    
### Funções com strings
-   `unquote`($string) Remove as aspas de uma string
-   `quote`($string) Adiciona aspas em uma string
-   `str-length`($string) Retorna a quantidade de caracteres de uma string
-   `to-upper-case`($string) Retorna a string em letras maiúsculas
-   `to-lower-case`($string) Retorna a string em letras minúsculas

### Funções com números
-   `percentage`($number) Converte um número sem unidade a uma percentagem
-   `round`($number) Arredonda um número para o número inteiro mais próximo
-   `ceil`($number) Arredonda um número até o próximo número inteiro
-   `floor`($number) Arredonda um número para baixo para o número inteiro anterior
    
### Funções com listas
-   `length`($list) Retorna a quantidade de itens de uma lista
-   `nth`($list, $n) Retorna um item específico em uma lista
-   `join`($list1, $list2, [$separator]) Junta duas listas em uma
-   `append`($list1, $val, [$separator]) Acrescenta um valor único no fim da lista
    
### Funções com maps
-   `map-merge`($map1, $map2) Une dois maps em um só map
-   `map-keys`($map) Retorna uma lista de todas as chaves de um map
-   `map-values`($map) Retorna uma lista de todos os valores de map

-------------------------------
`style.scss` :
```
$red: 100;
$green: 200;
$blue: 100;
$alpha: 0.8;
$color: #ddd;
$amount: 80%;
$font: Open Sans;
$weight: "bold";
$real_round: 2.2;
$real: 2.5;

body {
  background: rgb($red, $green, $blue);
}

section {
  background: rgba($red, $green, $blue, $alpha);
}

section div {
  background: lighten($color, $amount);
  background: darken($color, $amount);
  font-family: quote($font);
  font-weight: unquote($weight);
  padding: str-length($weight);
  font-family: to-upper-case($weight);
  font-family: to-lower-case($weight);
  width: percentage(str-length($weight));
  margin: round($real_round);
  margin: ceil($real);
  margin: floor($real);
}
```
`style.css` gerado :
```
body {
  background: #64c864; }

section {
  background: rgba(100, 200, 100, 0.8); }

section div {
  background: white;
  background: #111111;
  font-family: "Open Sans";
  font-weight: bold;
  padding: 4;
  font-family: "BOLD";
  font-family: "bold";
  width: 400%;
  margin: 2;
  margin: 3;
  margin: 2; }
```