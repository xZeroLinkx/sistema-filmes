package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;
import servico.ArtistaServico;
import servico.FilmeServico;

@WebServlet("/participacao/novo")
public class ParticipacaoNovo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static String DESTINO = "/participacao/formInserir.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instancia as Services de Filme e Artista
		FilmeServico fs = new FilmeServico();
		ArtistaServico as = new ArtistaServico();
		
		// Pega o código enviado como parametro pelo front-end e busca no banco de dados o seu respectivo filme
		int codFilme = Integer.parseInt(request.getParameter("codFilme"));
		Filme filme = fs.buscar(codFilme);
		
		// Cria uma nova Participação passando o filme que nós escolhemos
		Participacao nova = new Participacao();
		nova.setFilme(filme);
		
		// Cria uma lista com todos os artistas (para o usuário escolher)
		List<Artista> artistas = as.buscarTodos();
		
		// Cria dois atributos que serão enviados ao JSP
		// item representa a nova participação e artistas todos os artistas
		// Assim, encaminhamos para o JSP
		request.setAttribute("item", nova);
		request.setAttribute("artistas", artistas);
		request.setAttribute("artistaSelecionado", null);
		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}
