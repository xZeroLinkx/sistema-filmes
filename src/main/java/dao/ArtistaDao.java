/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 12/04/2019
Resumo: Interface DAO(Data Access Object) que mostra os métodos obrigatórios em relação a classe Artista
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package dao;

import java.util.List;

import dominio.Artista;

public interface ArtistaDao {
	public void inserirAtualizar(Artista x);
	public void excluir(Artista x);
	public Artista buscar(int cod);
	public List<Artista> buscarTodos();
	
	public List<Artista> buscarTodosOrdenadosPorNome();
	public Artista buscaNomeExato(String nome);
	public Artista buscaNomeExatoDiferente(Integer codigo, String nome);
	public List<Artista> buscarPorNome(String trecho);
}
