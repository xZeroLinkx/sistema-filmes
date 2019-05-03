/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 12/04/2019
Resumo: Interface DAO(Data Access Object) que mostra os métodos obrigatórios em relação a classe Participacao
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package dao;

import java.util.List;

import dominio.Artista;
import dominio.Filme;
import dominio.Participacao;

public interface ParticipacaoDao {
	public void inserirAtualizar(Participacao x);
	public void excluir(Participacao x);
	public Participacao buscar(int cod);
	public List<Participacao> buscarTodos();
	
	public Participacao buscarExato(String personagem, Artista artista, Filme filme);
	public Participacao buscarExatoDiferente(Integer codigo, String personagem, Artista artista, Filme filme);
	
}
