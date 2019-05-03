/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 12/04/2019
Resumo: Classe de Implementação do Entity Manager Factory (criador de Entity Manager)
Referência ao enunciado/origem do exercício: https://www.youtube.com/user/educandoweb/videos?view=0&sort=da&flow=grid
*/

package dao.impl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("meujpa");
	
	public static EntityManagerFactory get() {
		return emf;
	}
}
