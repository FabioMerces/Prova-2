package service;

import javax.persistence.Query;

import Entidades.Autor;

public class AutorService extends Service <Autor,Integer> {
	
	
	public Autor getAutorByCPF(String CPF) {
		
		Query query = getEntityManager().
				createQuery(
			"select o from Autor o Where o.CPF = :CPF");
		query.setParameter("CPF", CPF);
		
		return  (Autor) query.getSingleResult();

		}
}
