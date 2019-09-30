Mixins
======
A diretiva @mixin permite definir estilos que podem ser reutilizados em toda a folha de estilo. Os mixins funcionam como uma função que retorna CSS em vez de um único valor

`style.scss` :
```
@mixin border-radius($radius) {
  -webkit-border-radius: $radius;
  -moz-border-radius: $radius;
  -ms-border-radius: $radius;
  border-radius: $radius;
}

@mixin title($size, $color: blue){
  color: $color;
  font-size: $size;
}

@mixin pad ($values...) {
  padding: $values;
}

.box {
  @include border-radius(10px);
  @include title(14px, green);
}

h1 {
  @include title(14px);
}

p {
  @include pad(20px);
}

p {
  @include pad(10px 20px);
}

```
`style.css` gerado :
```
.box {
  -webkit-border-radius: 10px;
  -moz-border-radius: 10px;
  -ms-border-radius: 10px;
  border-radius: 10px;
  color: green;
  font-size: 14px; }

h1 {
  color: blue;
  font-size: 14px; }

p {
  padding: 20px; }

p {
  padding: 10px 20px; 
  }
```