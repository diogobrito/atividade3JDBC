package com.atividade3.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaAtividade3Jdbc");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}