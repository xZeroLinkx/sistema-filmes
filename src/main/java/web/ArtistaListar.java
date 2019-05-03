/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 25/04/2019
Resumo: Servlet que lista os Artistas
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;
import servico.ArtistaServico;

@WebServlet("/artista/listar")
public class ArtistaListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/artista/listar.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Busca os Artistas
		ArtistaServico as = new ArtistaServico();
		List<Artista> itens = as.buscarTodosOrdenadosPorNome();
		
		// Envia dados para o JSP
		request.setAttribute("itens", itens);
		
		// Vamos encaminhar para o destino, passando o request e o response
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}

}
