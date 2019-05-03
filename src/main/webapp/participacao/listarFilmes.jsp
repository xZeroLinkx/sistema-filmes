<!--  
Nome do autor: Elian Melo Morais 
Data de criaÃ§Ã£o do arquivo: 10/04/2019 
Objetivo sucinto do programa: Página de listagem de filmes
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
			<h1>Escolha um filme</h1>
		</div>
		
		<!-- Adiciona uma tabela -->
		<table class="table">
			<thead>
				<tr>
					<th>Código</th>
					<th>Título</th>
					<th>Duração</th>
					<th>Ano</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itens}" var="x">
					<tr>
						<td>${x.codFilme}</td>
						<td>${x.titulo}</td>
						<td>${x.duracao}</td>
						<td>${x.ano}</td>
						<td><a href="<%=request.getContextPath()%>/participacao/novo?codFilme=${x.codFilme}" 
						class="btn btn-primary btn-xs">Escolher</a></td>
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