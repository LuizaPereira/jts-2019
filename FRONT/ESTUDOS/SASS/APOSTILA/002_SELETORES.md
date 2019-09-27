Seletores Aninhados
===================

Os seletores aninhados ou nested selectors, permitem que as regras CSS fiquem aninhadas uma dentro da outra. 

`style.scss` :
```
nav {

	width: 100%;
	background: #000;
	
	ul {
		list-style: none
	}
	
	li {
		color: #fff;
		display: inline-block;
	}
	
}

```

`style.css` gerado:
```
nav {
	width: 100%;
	background: #000;
}

nav ul {
	list-style: none
}

nav li {
	color: #fff;
	display: inline-block;
}

```

---------------
Pseudo-elementos e o &
======================

O caractere & é utilizado fara fazer referência ao seletor pai.

`style.scss` :
```
a {
	color: #ffa;
  &:hover {
	  color: #faf;
  }
}

`style.css` gerado:
```
Será compilado para:
```
a {
	color: #ffa;
}

a:hover {
	color: #faf;
}

```
