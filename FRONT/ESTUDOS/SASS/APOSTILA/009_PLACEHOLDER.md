Placeholder
===========

`style.scss` :
```
%center {
    display: block;
    margin: 0 auto;
}

div {
    @extend %center;
}

.container {
    @extend %center;
}
```
`style.css` gerado :
```
div, .container {
    display: block;
    margin: 0 auto;
}
```