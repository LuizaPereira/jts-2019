Variáveis
===================


`style.scss` :
```
//Tipos de Variaveis
$width: 100%;
$font_size: 1.2rem;
$background: #962acd;
$color: #fff;
$border_style: solid 1px $color;

//Numericas
$width_rem: 3.5rem;
$width_px: 300px;
$width: 300;

//Strings
$font: "Lucida Grande";
$weight: bold;

//Cores
$bg: red;
$bg_section: rgb(100, 100, 100);
$font_color: #ffffff;

//Listas
$animals: puma, sea-slug, salamander;
$margin: 10px 20px 15px 20px;

//Maps
$social: (
    facebook: #3b5998,
    flickr: #0063db,
    gihub: #4183c4,
    googleplus: #dd4b39,
    instagram: #b31e63,
    linkedin: #007bb6,
    pinterest: #cb2027,
    soundcloud: #f60,
    twitter: #00aced,
    youtube: #b00
);

nav {
    background: $background;
    color: $color;
    width: $width;
    font-size: $font_size;
}

aside {
    width: $width;
}

section {
    font-family: $font;
    font-weight: $weight;
    background: $bg_section;
    margin: $margin;
}

body {
    background: $bg;
    color: $font_color;
}
```

`style.css` gerado:
```
nav {
  background: #962acd;
  color: #fff;
  width: 300;
  font-size: 1.2rem; }

aside {
  width: 300; }

section {
  font-family: "Lucida Grande";
  font-weight: bold;
  background: #646464;
  margin: 10px 20px 15px 20px; }

body {
  background: red;
  color: #ffffff; }
```