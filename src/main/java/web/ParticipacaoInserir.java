/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 02/05/2019
Resumo: Servlet que adiciona uma nova participa��o no banco de dados
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
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
import dominio.Filme;
import dominio.Participacao;
import servico.ArtistaServico;
import servico.FilmeServico;
import servico.ParticipacaoServico;
import servico.ServicoException;
import servico.ValidacaoException;

@WebServlet("/participacao/inserir")
public class ParticipacaoInserir extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/filme/detalhesCompleto.jsp";
	private static String FORM = "/participacao/formInserir.jsp";
	private static String ERRO = "/publico/erro.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FilmeServico fs = new FilmeServico();
		ParticipacaoServico ps = new ParticipacaoServico();
		ArtistaServico as = new ArtistaServico();
		
		Participacao x = Instanciar.participacao(request);
		try {
			// Valida os dados da participacao
			ps.validar(x);
			
			// Persiste no banco de dados
			ps.inserir(x);
			
			// Envia para o JSP o filme da participacao
			Filme filme = fs.buscar(x.getFilme().getCodFilme());
			request.setAttribute("item", filme);
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch(ServicoException e) {
			// Envia para a p�gina de erro
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher(ERRO).forward(request, response);
		} catch(ValidacaoException e) {
			// Envia de volta para o formul�rio
			List<Artista> artistas = as.buscarTodos();
			request.setAttribute("erros", e.getErros());
			request.setAttribute("item", x);
			request.setAttribute("artistas", artistas);
			request.setAttribute("artistaSelecionado", x.getArtista());
			request.getRequestDispatcher(FORM).forward(request, response);
		}
	}

}
