Operações
=========

Operações com Números
---------------------

- Adição e multiplicação :
```
h1 {
    font-size: 2em + 22px; // unidades incompatíveis

    font-size: 5px + 2; // 7px

    font-size: 5px * 2px; // unidade inválida
}
```
- Subtração , número snegativos e `-`

    - Um operador de subtração (como na 5px - 3px)
    - O início de um número negativo (como em -3px)
    - Um operador de negação unária (como em - $var)
    - Parte de um identificador (fonte-size)

- Divisão e `/`

`style.scss` :
```
$width: 1000px;
$base-size: 20px;
$line-height: 22px;

p {
  font: 10px/8px bold italic serif; // Imprime CSS
  width: $width/2; // Divisão pois usa uma variável
  width: round(1.5)/2; // Divisão pois usa uma função
  height: (500px/2); // Divisão pois usa parênteses
  margin-left: 5px + 8px/2px;  // Divisão pois usa uma expressão aritimética
  font: (italic bold 10px/8px); Imprime um erro, pois o parênteses estão em volta de uma lista
  font-size: #{$base-size} / #{$line-height}; // Usa interpolção e imprime CSS 
}
```
`style.css` gerado :
```
p {
  font: 10px/8px bold italic serif;
  width: 500px;
  height: 250px;
  margin-left: 9px; 
  font-size: 20px/22px;
}
```
- Módulo

`style.scss` :
```
$font-size: 27px; 

p {
	font-size: $font-size % 2;
}
```
`style.css` gerado :
```
p {
	font-size: 1px;
}
```

Operações com Cores
-------------------
`style.scss` :
```
p {
	color1: #010203 + #040506;
    color2: #010203 * 2;
    color3: rgba(255, 0, 0, 0.75) + rgba(0, 255, 0, 0.75);
}
```
`style.css` gerado :
```
p {
	color1: #050709;
    color2: #020406;
    color3: rgba(255, 255, 0, 0.75);
}
```

Operações com Strings
---------------------
`style.scss` :
```
p {
	cursor: e + -resize;
    content1: "Teste " + Teste;
    font-family: sans- + "serif";
    content2: "Eu tenho #{2 + 10} moedas.";
}
```
`style.css` gerado :
```
p {
	cursor: e-resize;
    content1: "Teste Teste";
    font-family: sans-serif;
    content2: "Eu tenho 12 moedas.";
}
```