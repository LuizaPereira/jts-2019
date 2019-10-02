Iterações
=========

Uso de `@for` | `@each` | `@while`

@for
----
A diretiva `@for` pode ser utilizada de duas formas:

`through` : O loop irá iniciar e finalizará até o número indicado.
```
@for $var from <start> through <end>
```
`to` : O loop não incluirá a última iteração.
```
@for $var from <start> to <end>
```

`style.scss` :
```
@for $i from 1 through 3 {
  .item-#{$i} {
    width: 2em * $i;
  }
}

@for $i from 1 to 3 {
  .object-#{$i} {
    width: 2em * $i;
  }
}
```
`style.css` gerado :
```
.item-1 {
  width: 2em; }

.item-2 {
  width: 4em; }

.item-3 {
  width: 6em; }

.object-1 {
  width: 2em; }

.object-2 {
  width: 4em; }
```

@Each
-----
A diretiva `@each` trabalha com listas.
`style.scss` :
```
@each $animal in puma, sea-slug, egret, salamander {
  .#{$animal}-icon {
    background-image: url('/images/#{$animal}.png');
  }
}
```
`style.css` gerado :
```
.puma-icon {
   background-image: url('/images/puma.png');
}
.sea-slug-icon {
   background-image: url('/images/sea-slug.png'); }
.egret-icon {
   background-image: url('/images/egret.png');
}
.salamander-icon {
   background-image: url('/images/salamander.png'); 
}
```

@While
------
A diretiva `@while` recebe uma expressão e imprime um o bloco de estilos até que a expressão seja falsa.

`style.scss` :
```
$i: 6;

@while $i > 0 {
  .item-#{$i} { 
	width: 2em * $i; 
  }
  $i: $i - 2;
}
```
`style.css` gerado :
```
.item-6 {
  width: 12e
}

.item-4 {
  width: 8em; 
}

.item-2 {
  width: 4em;
}
```