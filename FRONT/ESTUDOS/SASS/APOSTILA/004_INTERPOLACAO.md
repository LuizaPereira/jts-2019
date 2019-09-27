Interpolação
============ 

- Em nomes de seletores:

`style.scss` :
```
$name: destaque;
$attr: border;

p.#{$name} {
  #{$attr}-color: blue;
}

```
`style.css` gerado:
```
p.destaque {
  border-color: blue;
}

```
--------------
- Em nomes de propriedades:

`style.scss` :
```
p {
  $font-size: 12px;
  $line-height: 30px;
  font: #{$font-size}/#{$line-height};
}
```
`style.css` gerado:
```
p {
  font: 12px/30px;
}
```
