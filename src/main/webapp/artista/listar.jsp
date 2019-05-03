<!--  
Nome do autor: Elian Melo Morais 
Data de criação do arquivo: 25/04/2019 
Resumo: Página HTML de listagem de dados
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
	<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
</head>

<body>

	<jsp:include page="/resources/templates/navbar.jsp"/>

	<!-- Conteúdo da página -->
	<div class="container">
		<div class="page-header">
			<h1>Artistas</h1>
		</div>
		
		<!-- Botão de Inserção e Campo de Busca -->
		<div class="row">
			<div class="col-sm-2">
				<form class="navbar-form" action="<%=request.getContextPath()%>/artista/novo">
					<button type="submit" class="btn btn-primary">Inserir novo</button>
				</form>
			</div>
			<div class="col-sm-6">
				<form class="navbar-form" action="<%=request.getContextPath()%>/artista/filtrar">
					<div class="form-group">
						<input type="text" name="busca" placeholder="Digite um nome" class="form-control"/>
					</div>
					<button type="submit" class="btn btn-success">Filtrar</button>
				</form>
			</div>
		</div>
		
		<!-- Adiciona uma tabela -->
		<table class="table">
			<thead>
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>Nacionalidade</th>
					<th>Cache</th>
					<th>Nascimento</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itens}" var="x">
					<tr>
						<td>${x.codArtista}</td>
						<td>${x.nome}</td>
						<td>${x.nacionalidade}</td>
						<td><fmt:setLocale value="pt_BR"/><fmt:formatNumber type="currency" value="${x.cache}"/></td>
						<td><fmt:formatDate type="date" pattern="dd/MM/yyyy" value="${x.nascimento}"/></td>
						<td><a href="<%=request.getContextPath()%>/artista/editar?cod=${x.codArtista}" class="btn btn-primary btn-xs">Editar</a>
						<a href="<%=request.getContextPath()%>/artista/remover?cod=${x.codArtista}" class="btn btn-danger btn-xs">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<jsp:include page="/resources/templates/rodape.jsp"/>

	<!-- Core JS (Corresponde ao núcleo de processamento do JavaScript)-->
	<!-- Conta com as bibliotecas do bootstrap e do jquery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>