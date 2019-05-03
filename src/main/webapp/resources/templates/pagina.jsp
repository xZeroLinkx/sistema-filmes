<!--  
Nome do autor: Elian Melo Morais 
Data de criação do arquivo: 10/04/2019 
Resumo: Template de página padrão
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

	<jsp:include page="navbar.jsp"/>

	<!-- Conteúdo da página -->
	<div class="container">
		<div class="page-header">
			<h1>Título da página</h1>
		</div>
		<p class="lead">
		Texto grande
		</p>
		<p>
		Texto menor
		</p>
	</div>

	<jsp:include page="rodape.jsp"/>

	<!-- Core JS (Corresponde ao núcleo de processamento do JavaScript)-->
	<!-- Conta com as bibliotecas do bootstrap e do jquery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>