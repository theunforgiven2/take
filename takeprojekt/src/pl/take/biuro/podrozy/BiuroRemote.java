package pl.take.biuro.podrozy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BiuroRemote implements Biuro {
	
	String url = "http://localhost:8080/";
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("takeprojekt");
	private static EntityManager em = factory.createEntityManager();

	@Override
	public void stworzWycieczke(String nazwa, String opis, long dataPrzyjazdu, long dataOdjazdu) {
		em.getTransaction().begin();
		Wycieczka wycieczka = new Wycieczka();
		wycieczka.setNazwa(nazwa);
		wycieczka.setOpis(opis);
		wycieczka.setData_odjazdu(dataOdjazdu);
		wycieczka.setData_przyjazdu(dataPrzyjazdu);
		wycieczka.setRezerwacja(null);
		em.persist(wycieczka);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Wycieczka znajdzWycieczke(int id) {
		//Query q = em.createQuery("SELECT * FROM 'wycieczka' where id_wycieczki=" + id);
		Query q = em.createQuery("SELECT w FROM Wycieczka AS w WHERE w.id_wycieczki=" + id);
		
		return (Wycieczka)q.getSingleResult();
	}

	@Override
	public List<Wycieczka> pobierzWycieczki() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void usunWycieczke(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka) {
		// TODO Auto-generated method stub

	}

	@Override
	public void usunZKatalogu(Katalog katalog, Wycieczka wycieczka) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stworzKatalog(int okres) {
		// TODO Auto-generated method stub

	}

	@Override
	public Katalog znajdzKatalog(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void usunKatalog(Katalog katalog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stworzMiejsce(String nazwa, String opis) {
		// TODO Auto-generated method stub

	}

	@Override
	public void usunMiejsce(Miejsce miejsce) {
		// TODO Auto-generated method stub

	}

}
