/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 02/05/2019
Resumo: Servlet que faz uma listagem de filmes
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

import dominio.Filme;
import servico.FilmeServico;

@WebServlet("/participacao/filmes")
public class ParticipacaoFilmes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String DESTINO = "/participacao/listarFilmes.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instanciamos a Service de Filme
		FilmeServico fs = new FilmeServico();
		
		// Buscamos todos os filmes no banco de dados
		List<Filme> itens = fs.buscarTodos();
		
		// Enviamos para o JSP
		request.setAttribute("itens", itens);
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}

}
