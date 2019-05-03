/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 02/05/2019
Resumo: Servlet que encaminha para um formulário de pesquisa
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filme/pesquisar")
public class FilmePesquisar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/filme/formPesquisar.jsp";
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
	
}
