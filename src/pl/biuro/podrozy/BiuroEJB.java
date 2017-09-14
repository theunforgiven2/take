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
	

	public void stworzWycieczke(Wycieczka wycieczka) {
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

	public void stworzKatalog(Katalog katalog)
	{
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
	
	public List<Wycieczka> pobierzWycieczkiZKatalogu(int idKatalog)
	{
		Query q = em.createQuery("select w from Wycieczka w where w.katalog.idKatalog LIKE :idKatalog").setParameter("idKatalog", idKatalog);
		@SuppressWarnings("unchecked")
		List<Wycieczka> list = q.getResultList();
		return list;
	}
	
	public void stworzRezerwacje(Rezerwacja rezerwacja)
	{
		em.persist(rezerwacja);
	}
	
	public void stworzRezerwacjeW(Rezerwacja rezerwacja, int id)
	{
		Wycieczka wyc = this.znajdzWycieczke(id);
		rezerwacja.setWycieczka(wyc);
		em.persist(rezerwacja);
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
	
	public void stworzUczestnictwo(Uczestnictwo uczestnictwo)
	{
		em.persist(uczestnictwo);
	}
	
	public Uczestnictwo znajdzUczestnictwo(int id)
	{
		return em.find(Uczestnictwo.class, id);
	}
	
	public List<Uczestnictwo> pobierzUczestnictwa()
	{
		Query q = em.createQuery("select u from Uczestnictwo u");
		@SuppressWarnings("unchecked")
		List<Uczestnictwo> list = q.getResultList();
		return list;
	}
	
	public void usunUczestnictwo(int id)
	{
		Uczestnictwo ucz = em.find(Uczestnictwo.class, id);
		em.remove(ucz);
	}
	
	public void aktualizujUczestnictwo(Uczestnictwo uczestnictwo)
	{
		uczestnictwo = em.merge(uczestnictwo);
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
	
	public void aktualizujMiejsce(Miejsce miejsce)
	{
		miejsce = em.merge(miejsce);
	}
//	public void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka) {
//		Katalog kat = em.find(Katalog.class, katalog.getID()); 
//		kat.setWycieczka(wycieczka);
//		em.persist(kat);
//	}
//
//	@Override
//	public void usunZKatalogu(Katalog katalog, Wycieczka wycieczka) {
//		Katalog kat = em.find(Katalog.class, katalog.getID());
//		kat.usunWycieczke(wycieczka);
//		em.persist(kat);
//	}
//
//	@Override
//	public void stworzKatalog(int okres) {
//		Katalog kat = new Katalog();
//		kat.setOkres(okres);
//		em.persist(kat);
//	}
//
//	@Override
//	public Katalog znajdzKatalog(int id) {
//		Katalog kat = em.find(Katalog.class, id);
//		return kat;
//	}
//
//	@Override
//	public void usunKatalog(Katalog katalog) {
//		Katalog kat = em.find(Katalog.class, katalog);
//		em.remove(kat);
//		//em.remove(katalog);
//	}
//
//	@Override
//	public void stworzMiejsce(String nazwa, String opis) {
//		Miejsce m = new Miejsce();
//		m.setNazwa(nazwa);
//		m.setOpis(opis);
//		em.persist(m);
//	}
//
//	@Override
//	public void usunMiejsce(Miejsce miejsce) {
//		Miejsce m = em.find(Miejsce.class, miejsce);
//		em.remove(m);
//		//em.remove(miejsce);
//	}

}
