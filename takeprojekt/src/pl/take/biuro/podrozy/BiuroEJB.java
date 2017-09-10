package pl.take.biuro.podrozy;

import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateful
public class BiuroEJB implements Biuro {
	
	@PersistenceContext(name="takeprojekt")
	EntityManager em;
	
	@Override
	public void stworzWycieczke(String nazwa, String opis, long dataOdjazdu, long dataPrzyjazdu) {
		Wycieczka wyc = new Wycieczka();
		wyc.setNazwa(nazwa);
		wyc.setOpis(opis);
		wyc.setData_przyjazdu(dataPrzyjazdu);
		wyc.setData_odjazdu(dataOdjazdu);
		//wyc.setRezerwacja(param);
//		em.getTransaction().begin();
		em.persist(wyc);
//		em.getTransaction().commit();
//		em.close();
	}

	@Override
	public Wycieczka znajdzWycieczke(int id) {
		Wycieczka wyc = em.find(Wycieczka.class, id);
		return wyc;
	}

	@Override
	public List<Wycieczka> pobierzWycieczki() {
		Query q = em.createQuery("SELECT w FROM Wycieczka w");
		@SuppressWarnings("unchecked")
		List<Wycieczka> listaWycieczek = q.getResultList();
		return listaWycieczek;
	}

	@Override
	public void usunWycieczke(int id) {
		Wycieczka wyc = em.find(Wycieczka.class, id);
		em.remove(wyc);
	}

	@Override
	public void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka) {
		Katalog kat = em.find(Katalog.class, katalog.getID()); 
		kat.setWycieczka(wycieczka);
		em.persist(kat);
	}

	@Override
	public void usunZKatalogu(Katalog katalog, Wycieczka wycieczka) {
		Katalog kat = em.find(Katalog.class, katalog.getID());
		kat.usunWycieczke(wycieczka);
		em.persist(kat);
	}

	@Override
	public void stworzKatalog(int okres) {
		Katalog kat = new Katalog();
		kat.setOkres(okres);
		em.persist(kat);
	}

	@Override
	public Katalog znajdzKatalog(int id) {
		Katalog kat = em.find(Katalog.class, id);
		return kat;
	}

	@Override
	public void usunKatalog(Katalog katalog) {
		Katalog kat = em.find(Katalog.class, katalog);
		em.remove(kat);
		//em.remove(katalog);
	}

	@Override
	public void stworzMiejsce(String nazwa, String opis) {
		Miejsce m = new Miejsce();
		m.setNazwa(nazwa);
		m.setOpis(opis);
		em.persist(m);
	}

	@Override
	public void usunMiejsce(Miejsce miejsce) {
		Miejsce m = em.find(Miejsce.class, miejsce);
		em.remove(m);
		//em.remove(miejsce);
	}

}
