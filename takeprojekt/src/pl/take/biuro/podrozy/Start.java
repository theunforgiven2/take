package pl.take.biuro.podrozy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Start {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("takeprojekt");
		EntityManager em = factory.createEntityManager();
		
		Miejsce mp = new Miejsce();
		em.getTransaction().begin();
		mp.setNazwa("NazwaMiejsca");
		mp.setOpis("opisMiejsca");
		em.persist(mp);
		em.getTransaction().commit();
		em.close();
		//System.out.println("Blblblbl");
	}
}
