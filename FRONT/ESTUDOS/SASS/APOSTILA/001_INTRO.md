Pré-Processador
===============

O `Sass` precisa ser pré-processado antes de gerar o `CSS` que será renderizado pelo navegador, logo, 
o navegador nunca renderiza o código Sass diretamente, por este motivo utilizaremos o node-sass, 
este módulo compila o arquivo Sass e salva o resultado em um arquivo `CSS` que será renderizado pelo navegador.


## Instalação

Para utilizar o módulo node-sass, você precisa do `Node.js` instalado no seu computador.

```
sudo apt-get install nodejs
```

A seguir instalaremos o gerenciador de pacotes `NPM`:

```
sudo apt-get install npm
```

Finalmente instalamos o `node-sass` :

```
yarn add node-sass
```

------------

Gerar o `CSS` a partir do `SCSS` criado
-------------------------

```
yarn run node-sass scss/style.scss css/style.css
```