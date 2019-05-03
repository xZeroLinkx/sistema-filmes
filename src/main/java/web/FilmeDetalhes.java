/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 02/05/2019
Resumo: Servlet que encaminha para uma página de detalhes de um Filme
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Filme;
import servico.FilmeServico;

@WebServlet("/filme/detalhes")
public class FilmeDetalhes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/filme/detalhes.jsp";
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instanciamos a Service de Filme
		FilmeServico fs = new FilmeServico();
		
		// Pegamos o código enviado pelo front-end
		int cod = Integer.parseInt(request.getParameter("cod"));
		
		// Buscamos o filme no banco de dados
		Filme filme = fs.buscar(cod);
		
		// Enviamos para o JSP
		request.setAttribute("item", filme);
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}
