<!--  
Nome do autor: Elian Melo Morais 
Data de criaÃ§Ã£o do arquivo: 10/04/2019 
Objetivo sucinto do programa: View principal do programa
Referencia ao enunciado/origem do exercicio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
-->

<%@ page language="java" contentType="text/html; charsert=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sistema de Filmes</title>
	<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
</head>

<body>

	<jsp:include page="resources/templates/navbar.jsp"/>

	<!-- Conteúdo da página -->
	<div class="container">
		<div class="page-header">
			<h1>Página inicial</h1>
		</div>
		<p class="lead">
		Sistema didático Java para web.
		</p>
		<p>
		Educandoweb - <a href="https://www.youtube.com/user/educandoweb/">youtube.com/educandoweb</a>
		</p>
	</div>

	<jsp:include page="resources/templates/rodape.jsp"/>

	<!-- Core JS (Corresponde ao núcleo de processamento do JavaScript)-->
	<!-- Conta com as bibliotecas do bootstrap e do jquery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>
