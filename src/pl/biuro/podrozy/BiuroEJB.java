package pl.biuro.podrozy;

import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import sun.nio.ch.Net;

@Stateless
public class BiuroEJB{
	
	@PersistenceContext(name="biuro")
	EntityManager em;
	

	public void stworzWycieczke(Wycieczka wycieczka, int mid) {
		Miejsce miejsce = this.znajdzMiejsce(mid);
		wycieczka.setMiejsce(miejsce);
		em.persist(wycieczka);
	}

	
	public Wycieczka znajdzWycieczke(int id) {
		Wycieczka wyc = em.find(Wycieczka.class, id);
		return wyc;
	}


	public List<Wycieczka> pobierzWycieczki() {
		Query q = em.createQuery("SELECT w FROM Wycieczka w");
		@SuppressWarnings("unchecked")
		List<Wycieczka> listaWycieczek = q.getResultList();
		return listaWycieczek;
	}

	public List<Rezerwacja> pobierzRezerwacjeDoWycieczki(int id){
		List<Rezerwacja> rezerwacje = em.createQuery(
			    "select r " +
			    "from Rezerwacja r " +
			    "where r.wycieczka.id = :id_wycieczki", Rezerwacja.class)
			.setParameter( "id_wycieczki", id)
			.getResultList();
		return rezerwacje;
	}
	
	public void usunWycieczke(int id) {
		Wycieczka wyc = em.find(Wycieczka.class, id);
		em.remove(wyc);
	}
	
	public void aktualizujWycieczke(Wycieczka wycieczka)
	{
		wycieczka = em.merge(wycieczka);
	}

	public void stworzKatalog(Katalog katalog, int wid, int mid)
	{
		Wycieczka wycieczka = this.znajdzWycieczke(wid);
		Miejsce miejsce = this.znajdzMiejsce(mid);
		katalog.setMiejsce(miejsce);
		katalog.setWycieczka(wycieczka);
		em.persist(katalog);
	}
	
	public Katalog znajdzKatalog(int id)
	{
		Katalog kat = em.find(Katalog.class, id);
		return kat;
	}
	
	public List<Katalog> pobierzKatalogi()
	{
		Query q = em.createQuery("SELECT k FROM Katalog k");
		@SuppressWarnings("unchecked")
		List<Katalog> listaKatalogow = q.getResultList();
		return listaKatalogow;
	}
	
	public void usunKatalog(int id)
	{
		Katalog kat = em.find(Katalog.class, id);
		em.remove(kat);
	}
	
//	public List<Wycieczka> pobierzWycieczkiZKatalogu(int idKatalog)
//	{
//		List<Wycieczka> wycieczki = em.createQuery(
//			    "select w " +
//			    "from Wycieczka w " +
//			    "where w.katalog.id = :id_katalog", Wycieczka.class)
//			.setParameter( "id_katalog", idKatalog)
//			.getResultList();
//		return wycieczki;
//	}
	public List<Rezerwacja> pobierzRezerwacjeKatalogu(int idKatalog){
		List<Rezerwacja> rezerwacje = em.createQuery(
			    "select r " +
			    "from Rezerwacja r " +
			    "where r.katalog.id_katalog = :idKatalog", Rezerwacja.class)
			.setParameter( "idKatalog", idKatalog)
			.getResultList();
		return rezerwacje;
		
	}
	public List<Katalog> pobierzKatalogiZRezerwacji(int idRezerwacja)
	{
		List<Katalog> katalogi = em.createQuery(
			    "select k " +
			    "from Katalog k " +
			    "where k.rezerwacja.id = :id_rezerwacja", Katalog.class)
			.setParameter( "id_rezerwacja", idRezerwacja)
			.getResultList();
		return katalogi;
	}
	
	public List<Miejsce> pobierzMiejscaZKatalogu(int idKatalog)
	{
		List<Miejsce> miejsca = em.createQuery(
			    "select m " +
			    "from Miejsce m " +
			    "where m.katalog.id = :id_katalog", Miejsce.class)
			.setParameter( "id_katalog", idKatalog)
			.getResultList();
		return miejsca;
	}
	
	public List<Wycieczka> pobierzWycieczkiZKatalogu(int idKatalog)
	{
		List<Wycieczka> wycieczki = em.createQuery(
			    "select w " +
			    "from Wycieczka w " +
			    "where w.katalog.id = :id_katalog", Wycieczka.class)
			.setParameter( "id_katalog", idKatalog)
			.getResultList();
		return wycieczki;
	}
	
	public List<Miejsce> pobierzMiejscaZWycieczki(int idWycieczka)
	{
		List<Miejsce> miejsca = em.createQuery(
			    "select m " +
			    "from Miejsce m " +
			    "where m.wycieczka.id = :id_wycieczka", Miejsce.class)
			.setParameter( "id_wycieczka", idWycieczka)
			.getResultList();
		return miejsca;
	}
	
	public void stworzRezerwacje(Rezerwacja rezerwacja, int id)
	{
		Katalog kat = this.znajdzKatalog(id);
		rezerwacja.setKatalog(kat);
		em.persist(rezerwacja);
	}
	
	
	public void dodajWycieczkeDoKatalogu(int idWycieczka, int idKatalog)
	{
		Wycieczka wyc = em.find(Wycieczka.class, idWycieczka);
		Katalog kat = em.find(Katalog.class, idKatalog);
		kat.setWycieczka(wyc);
		em.persist(kat);
	}
	
	public void dodajMiejsceDoKatalogu(int idMiejsce, int idKatalog)
	{
		Miejsce mi = em.find(Miejsce.class, idMiejsce);
		Katalog kat = em.find(Katalog.class, idKatalog);
		kat.setMiejsce(mi);
		em.persist(kat);
	}
	
	public void dodajMiejsceDoWycieczki(int idMiejsce, int idWycieczka)
	{
		Miejsce mi = em.find(Miejsce.class, idMiejsce);
		Wycieczka wyc = em.find(Wycieczka.class, idWycieczka);
		wyc.setMiejsce(mi);
		em.persist(wyc);
	}
	
	public void dodajKatalogDoRezerwacji(int idKatalog, int idRezerwacja)
	{
		Rezerwacja rez = em.find(Rezerwacja.class, idRezerwacja);
		Katalog kat = em.find(Katalog.class, idKatalog);
		rez.setKatalog(kat);
		em.persist(rez);
	}
		
	public Rezerwacja znajdzRezerwacje(int id)
	{
		return em.find(Rezerwacja.class, id);
	}
	
	public List<Rezerwacja> pobierzRezerwacje()
	{
		Query q = em.createQuery("select r from Rezerwacja r");
		@SuppressWarnings("unchecked")
		List<Rezerwacja> list = q.getResultList();
		return list;
	}
	
	public void usunRezerwacje(int id)
	{
		Rezerwacja rez = em.find(Rezerwacja.class, id);
		em.remove(rez);
	}
	
	public void aktualizujRezerwacje(Rezerwacja rezerwacja)
	{
		rezerwacja = em.merge(rezerwacja);
	}
	
	public void stworzMiejsce(Miejsce miejsce)
	{
		em.persist(miejsce);
	}
	
	public Miejsce znajdzMiejsce(int id)
	{
		return em.find(Miejsce.class, id);
	}
	
	public List<Miejsce> pobierzMiejsca()
	{
		Query q = em.createQuery("select m from Miejsce m");
		@SuppressWarnings("unchecked")
		List<Miejsce> list = q.getResultList();
		return list;
	}
	
	public void usunMiejsce(int id)
	{
		Miejsce miejsce = em.find(Miejsce.class, id);
		em.remove(miejsce);
	}
	
	public void aktualizujMiejsce(Miejsce miejsce, int id)
	{
		Miejsce m = em.find(Miejsce.class, id);
		m.setAdres(miejsce.getAdres());
		m.setMiejscowosc(miejsce.getMiejscowosc());
	}
	
	public void aktualizujRezerwacje(Rezerwacja rezerwacja, int id)
	{
		Rezerwacja rez = em.find(Rezerwacja.class, id);
		rez.setLiczba_osob(rezerwacja.getLiczba_osob());
		rez.setStan(rezerwacja.isStan());
		rez.setZaliczka(rezerwacja.getZaliczka());
		rez.setKatalog(rezerwacja.getKatalog());
	}
	
	public void aktualizujKatalog(Katalog katalog, int id)
	{
		Katalog kat = em.find(Katalog.class, id);
		kat.setCena(katalog.getCena());
		kat.setData_odjazdu(katalog.getData_odjazdu());
		kat.setData_przyjazdu(katalog.getData_przyjazdu());
		kat.setMiejsce(katalog.getMiejsce());
		kat.setWycieczka(katalog.getWycieczka());
	}
	
	public void aktualizujWycieczke(Wycieczka wycieczka, int id)
	{
		Wycieczka wyc = em.find(Wycieczka.class, id);
		wyc.setNazwa(wycieczka.getNazwa());
		wyc.setOpis(wycieczka.getOpis());
		wyc.setMiejsce(wycieczka.getMiejsce());
	}
}
