<!--  
Nome do autor: Elian Melo Morais 
Data de criação do arquivo: 10/04/2019 
Resumo: Template do menu de navegação
Referencia ao enunciado/origem do exercicio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<!-- Corresponde a barra de navegação de nossa aplicação -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="<%=request.getContextPath()%>/">Sistema
				de Filmes</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath()%>/artista/listar">Cadastro
						de Artistas</a></li>
				<li><a href="<%=request.getContextPath()%>/filme/pesquisar">Pesquisar
						Filmes</a></li>
				<li><a href="<%=request.getContextPath()%>/participacao/filmes">Inserir
						Participação</a></li>
			</ul>
		</div>
	</div>
</nav>