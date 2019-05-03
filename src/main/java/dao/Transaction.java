/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 12/04/2019
Resumo: Interface DAO(Data Access Object) que mostra os métodos obrigatórios em relação as operações de transação
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package dao;

import dao.impl.EM;

public class Transaction {

	public static void begin() {
		EM.getLocalEm().getTransaction().begin();
	}
	
	public static void commit() {
		EM.getLocalEm().getTransaction().commit();
	}
	
	public static void rollback() {
		EM.getLocalEm().getTransaction().rollback();
	}
	
	public static boolean isActive() {
		return EM.getLocalEm().getTransaction().isActive();
	}
}
