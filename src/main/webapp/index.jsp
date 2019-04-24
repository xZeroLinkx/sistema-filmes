<!--  
Nome do autor: Elian Melo Morais 
Data de criaÃ§Ã£o do arquivo: 10/04/2019 
Objetivo sucinto do programa: View principal do programa
ReferÃªncia ao enunciado/origem do exercÃ­cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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

	<!-- Fixed navbar -->
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
				<a class="navbar-brand" href="<%=request.getContextPath()%>/">Sistema de Filmes</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="<%=request.getContextPath()%>/artista/listar">Cadastro de Artistas</a></li>
					<li><a href="<%=request.getContextPath()%>/filmes/pesquisar">Pesquisar Filmes</a></li>
					<li><a href="<%=request.getContextPath()%>/participacao/filmes">Inserir Participação</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<!-- Begin page content -->
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

	<footer class="footer">
		<div class="container">
			<p class="text-muted">Educandoweb - <a href="https://www.youtube.com/user/educandoweb/">youtube.com/educandoweb</a> </p>
		</div>
	</footer>

	<!-- Core JS -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</body>
</html>
