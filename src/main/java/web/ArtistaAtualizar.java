/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 30/04/2019
Resumo: Servlet que atualiza os dados de um Artista
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
import servico.ServicoException;
import servico.ValidacaoException;

@WebServlet("/artista/atualizar")
public class ArtistaAtualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String DESTINO = "/artista/listar.jsp";
	private static String FORM = "/artista/formEditar.jsp";
	private static String ERRO = "/publico/erro.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Cria um Service de Artista
		ArtistaServico as = new ArtistaServico();
		
		Artista x = Instanciar.artista(request);
		
		try {
			// Aplica o método de verificação da Service Artista
			as.validar(x);
			
			// Tenta persistir o Artista x no banco de dados
			as.atualizar(x);
			
			// Busca o artista
			List<Artista> itens = as.buscarTodosOrdenadosPorNome();
			
			// Envia dados para o JSP
			request.setAttribute("itens", itens);
			
			// Vamos encaminhar para o destino, passando o request e o response
			request.getRequestDispatcher(DESTINO).forward(request, response);
		} catch (ServicoException e) {
			// Envia para o JSP a mensagem de erro gerada pelo servidor
			request.setAttribute("msg", e.getMessage());
			
			// Vamos encaminhar para a pagina de erro, passando o request e o response
			request.getRequestDispatcher(ERRO).forward(request, response);
		} catch(ValidacaoException e) {
			// Envia para o JSP as mensagens de erro de digitação
			request.setAttribute("erros", e.getErros());
			
			// Envia para o JSP o Artista x com os dados preenchidos corretamente, evitando repetição do usuario
			request.setAttribute("item", x);
			
			// Vamos encaminhar para a página de formulário, passando o request e o response
			request.getRequestDispatcher(FORM).forward(request, response);
		}

	}

}
