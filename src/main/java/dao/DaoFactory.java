/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 12/04/2019
Resumo: Classe DAO(Data Access Object) que cria objetos que implementaram o DAO
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package dao;

import dao.impl.ArtistaDaoImpl;
import dao.impl.FilmeDaoImpl;
import dao.impl.ParticipacaoDaoImpl;

public class DaoFactory {
	
	public static ArtistaDao criarArtistaDao() {
		return new ArtistaDaoImpl();
	}
	
	public static FilmeDao criarFilmeDao() {
		return new FilmeDaoImpl();
	}
	
	public static ParticipacaoDao criarParticipacaoDao() {
		return new ParticipacaoDaoImpl();
	}

}
