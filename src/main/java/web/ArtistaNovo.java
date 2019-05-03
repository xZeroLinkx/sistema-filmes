/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 26/04/2019
Resumo: Servlet que insere um novo artista
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;

@WebServlet("/artista/novo")
public class ArtistaNovo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/artista/formInserir.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Envia dados para o JSP
		request.setAttribute("item", new Artista());
		
		// Vamos encaminhar para o destino, passando o request e o response
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}

}
