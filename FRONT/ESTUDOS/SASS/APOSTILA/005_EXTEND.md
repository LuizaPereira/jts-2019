@extend
=========

Com @extend é possível herdar estilos de outras classes, sua utilização evita a duplicação de estilos no arquivo final.

---------------------------
- A classe .msg receberá as características semelhantes e estendemos a classe .msg nas classes de erro específicas.

`style.scss` :
```
.msg {
  border: 1px solid;
  padding: 4px;
  text-align: center;
}

.msg-error {
  @extend .msg;
  border-color: #ff0000;
  color: #ff0000;
}

.msg-alert {
  @extend .msg ;
  border-color: #ff8e00;
  color: #ff8e00;
}
```

`style.css` gerado :

```
.msg, .msg-error,  .msg-alert{
  border: 1px solid;
  padding: 4px;
  text-align: center;
}

.msg-error {
 border-color: #ff0000;
 color: #ff0000;
}

.msg-alert {
 border-color: #ff8e00;
 color: #ff8e00;
}
```
----------------
Também é possível herdar estilos de pseudo-elementos:

`style.scss` :

```
a:hover {
   text-decoration: underline;
}

.hoverlink {
    @extend a:hover;
     color: #000;
}
```

`style.css` gerado :

```
a:hover, .hoverlink {
  text-decoration: underline; }

.hoverlink {
  color: #000;
}
```