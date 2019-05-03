<!--  
Nome do autor: Elian Melo Morais 
Data de criação do arquivo: 03/05/2019 
Resumo: Formulário HTML que insere uma Participacao
Referencia ao enunciado/origem do exercicio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<!-- Corresponde a uma página completa padrão/modelo -->
<%@ page language="java" contentType="text/html; charsert=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Filmes</title>
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp" />

	<!-- Conteúdo da página -->
	<div class="container">
		<div class="page-header">
			<h1>Inserir nova participacao para o filme: ${item.filme.titulo}</h1>
		</div>

		<form method="post" name="myform" class="form-horizontal"
			action="<%=request.getContextPath()%>/participacao/inserir">

			<!-- Importante! Nao esqueca de repassar o codigo do filme -->
			<input type="hidden" name="codFilme" value="${item.filme.codFilme}" />

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<ul>
						<c:forEach items="${erros}" var="msg">
							<li style="color: red; font-weight: bold;">${msg}</li>
						</c:forEach>
					</ul>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="personagem">Nome
					do personagem: </label>
				<div class="col-sm-5">
					<input type="text" name="personagem" id="personagem"
						value="${item.personagem}" class="form-control" />
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="artista">Selecione
					o artista:</label>

				<div class="col-sm-5">
					<!-- Cria um campo de seleção de opções -->
					<select name="codArtista" class="form-control">
						<!-- Cria uma opção com valor nulo -->
						<option value="">-- Selecione o artista --</option>
						<!-- Percorre a lista de artista de todos os artistas -->
						<c:forEach items="${artistas}" var="x">
							<!-- Para cada artista geramos uma opção -->
							<!-- Utilizando o c:if -->
							<option value="${x.codArtista}"
								<c:if test="${x == artistaSelecionado}">selected="selected"</c:if>>
								<!-- Cada opção irá mostrar o nome e o cache --> ${x.nome},
								<fmt:setLocale value="pt_BR" /><fmt:formatNumber type="currency"
									value="${x.cache}" />
							</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="desconto">Desconto
					no cache:</label>
				<div class="col-sm-5">
					<input type="text" name="desconto" id="desconto"
						value="${item.desconto}" class="form-control" />
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Inserir</button>
					<a href="<%=request.getContextPath()%>/participacao/filmes"
						class="btn btn-default">Voltar</a>
				</div>
			</div>

		</form>

	</div>

	<jsp:include page="/resources/templates/rodape.jsp" />

	<!-- Core JS (Corresponde ao núcleo de processamento do JavaScript)-->
	<!-- Conta com as bibliotecas do bootstrap e do jquery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>