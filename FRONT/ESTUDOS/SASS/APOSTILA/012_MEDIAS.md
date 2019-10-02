Media Queries
=============

`style.scss` :
```
.sidebar {
  width: 30%;
  @media screen and (orientation: landscape) {
     width: 40%;
  }
}

.container {
  width: 90%;
  @media screen and (orientation: landscape) {
     width: 100%;
  }
}
```
`style.css` gerado :
```
.sidebar {
   width: 30%; 
}

.container {
   width: 90%; 
}

@media screen and (orientation: landscape) {
 .sidebar {
    width: 40%; 
 } 
 
 .container {
    width: 90%;
 } 
}
```

mixins + media + interpolation + @content
-----------------------------------------
`style.scss` :
```
.$tablet-width: 768px;
$desktop-width: 1024px;

@mixin landscape {
   @media screen and (orientation: landscape) {
       @content;
   }
}

@mixin tablet {
   @media (min-width: #{$tablet-width}) {
       @content;
   }
}

@mixin desktop {
   @media (min-width: #{$desktop-width}) {
       @content;
   }
}

header {
    padding: 3em;	
  
    @include tablet {
        padding: 2em;
    }
}
```
`style.css` gerado :
```
header {
  padding: 3em;	
}

@media (min-width: 768px ) {
  header {
		padding: 2em;	
  }
}
```

