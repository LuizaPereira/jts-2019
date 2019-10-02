Condições
=========

Uso de `@if` | `@else if` | `@else`.

`style.scss` :
```
$template: dark;

header {
  @if ($template == dark) {
    color: #000;
  } @else if ($template == blue) {
    color: blue;
  } @else {
    color: red;
  }
}
```
`style.css` gerado :
```
header {
  color: #000; }

```