/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 30/04/2019
Resumo: Service que faz a validação dos dados recebidos
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package servico;

import java.util.List;

public class ValidacaoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private List<String> erros;
	
	public ValidacaoException(String msg, List<String> erros) {
		super(msg);
		this.erros = erros;
	}
	
	public List<String> getErros() {
		return erros;
	}
}
