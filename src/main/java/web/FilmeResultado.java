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

@WebServlet("/filme/resultado")
public class FilmeResultado extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/filme/resultadoBusca.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instancia a Service de Filme
		FilmeServico fs = new FilmeServico();
		
		// Pegamos os parâmetros passados pelo usuário (front-end)
		String titulo = request.getParameter("titulo");
		int anoMin = Integer.parseInt(request.getParameter("anoMin"));
		int anoMax = Integer.parseInt(request.getParameter("anoMax"));
		
		// Fazemos uma busca utilizando os dados fornecidos, e criamos uma lista
		List<Filme> itens = fs.buscarPorNomeAno(titulo, anoMin, anoMax);
		
		// Enviamos para o JSP
		request.setAttribute("itens", itens);
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}

}
