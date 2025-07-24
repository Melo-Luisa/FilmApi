# 7 Days Of Code in Java
<h2> ✅ 1º Dia</h2>
<li>Construir um código acessando os request da API</li>
<li>Cadastras chava na TMDB e acessá-la</li>
<li>Pegar as respostas e mostrar no console</li>
<h3>📌 Note</h3>
Abrimos o projeto pelo VsCode. Por inicio toda código está na main, mais para frente iremos otimizá-lo.</br>
Colocamos um .gitignore para que a chave API não apareça.

<h2>✅2º Dia</h2>
<li>Objetivo: parsear respostas do Json</li>
<li>Adicionando em lista e as separando para que possamos trabalhar com informações separadas</li>
<h3>Elementos Separados</h3>
<li>Id</li>
<li>Título do filme</li>
<li>Resenha</li>
<li>Nota</li>
<h3>⚠️Problems of the day</h3>
GIT PULL. Não se esqueça de puxar informações ques estão no remoto ou vice-versa


<h2>✅3º Dia</h2>
<li>Objetivo: POO - organizar o código e deixá-lo mais intuitivo para amnuntenção</li>
<li>Tivemos que filtrar melhor nossa API. Deixando mais objetivo para impressão no console</li>
<li>Um ponto necessário era a adição da class Movie para que nela filtra-se os filmes pelos elementos separados no dia 2</li>

<h3>💀 Problems of the day</h3>
1. Uso do split em list é muito fraco para um API com uma lista grande
<p> Por conta disso temos que melhorar o manuseio do array já que temos 3 array e juntamos eles</p>
2. Usamos o <strong>Gson</strong> para fazer a análise mais rapida</br>
3. Organização da POO
<h3>Separamos por:</h3>
<li>HttpService</li>
<li>Movie</li>
<li>MovieParser</li>
<li>MovieResponse</li>
<li>App</li>

<h3>📌 Note</h3>
<p>Hoje foi hard!! Muita pesquisa e problemas de instalação de pacotes e pastas</p>

<h2>✅4º Dia</h2>
<li>Objetivo: Trazer informações filtradas para uma HTML</li>
<li>Faze o HTML e CSS é relativamente fácil o problema maior seria conectar com o java</li>
<li>Pros: já tinhamos tudo em um lista com os itens separados</li>

<h3> ⚠️ Problems of the day</h3>
1º tentei fazer com que o index.html abrisse direto mas 0 sucess
2º parti para puxar as informações da lista para o HTML
3º o HTML já é uma linguagem de marcação então ela é meio chata, acabou que fazer isso em java não ajudou muito você pode dar uma verificada no arquivo HTMLGenerator e podemos ver como o index.html ficou caos.
4º Esse é um pro pois consegui deixar o CSS externo o que facilitou a edição

<h3> 📌 Note </h3>
<p>Com todas as minhas força tinha me negado a colocar a data de lançamento já que a maioria seria 2025 mas coloquei no final, o que digo que a alteração do dia 3 foi muito prática nessa adição</p>
<p>No mais muito datisfatório ver os dados sendo só manipulados sem muito "esforço"</p>

<h3>Future Ideias</h3>
<li>Trazer um filtro do idioma da API já que podemos usar qualquer um.</li>

<h3>Video</h3>
[![Assista ao vídeo](https://youtu.be/UMfRoBLRuN4)](https://youtu.be/UMfRoBLRuN4)



<h2>⛔5º Dia</h2>
<h2>⛔6º Dia</h2>
<h2>⛔7º Dia</h2>
