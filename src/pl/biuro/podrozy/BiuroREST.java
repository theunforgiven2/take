package pl.biuro.podrozy;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")

@Consumes({ "application/json" })
@Produces({ "application/json" })
public class BiuroREST implements Biuro {
	
	@EJB
	BiuroEJB bean;

	@Override
	@POST
	@Path("/wycieczka")
	public void stworzWycieczke(Wycieczka wycieczka) {
		bean.stworzWycieczke(wycieczka);
	}

	@Override
	@GET
	@Path("/wycieczka/{id}")	
	public Wycieczka znajdzWycieczke(@PathParam("id") int id) {
		return bean.znajdzWycieczke(id);
	}
	
	@Override
	@GET
	@Path("/wycieczka")
	public Wycieczki pobierzWycieczki() {
		List<Wycieczka> lWyc = bean.pobierzWycieczki();
		Wycieczki wyc = new Wycieczki(lWyc);
		return wyc;
	}
	
	@GET
	@Path("/wycieczka/{id}/rezerwacje")
	public Rezerwacje pobierzRezerwacjeWycieczki(@PathParam("id") int id) {
		List<Rezerwacja> listaRezerwacji = bean.pobierzRezerwacjeDoWycieczki(id);
		Rezerwacje rezerwacje = new Rezerwacje(listaRezerwacji);
		return rezerwacje;
	}
	
	@Override
	@GET
	@Path("/pobierz/wycieczka/z/katalog/{id}")
	public Wycieczki pobierzWycieczkiZKatalogu(@PathParam("id") int idKatalog)
	{
		List<Wycieczka> listaWycieczek = bean.pobierzWycieczkiZKatalogu(idKatalog);
		Wycieczki wyc = new Wycieczki(listaWycieczek);
		return wyc;
	}
	
	@Override
	@DELETE
	@Path("/wycieczka/{id}")
	public void usunWycieczke(@PathParam("id") int id) {
		bean.usunWycieczke(id);
	}
	
	@Override
	@PUT
	@Path("/wycieczka")
	public void aktualizujWycieczke(Wycieczka wycieczka)
	{
		bean.aktualizujWycieczke(wycieczka);
	}

	@Override
	@POST
	@Path("/katalog")
	public void stworzKatalog(Katalog katalog)
	{
		bean.stworzKatalog(katalog);
	}
	
	@Override
	@GET
	@Path("/katalog/{id}")
	public Katalog znajdzKatalog(@PathParam("id") int id)
	{
		return bean.znajdzKatalog(id);
	}
	
	@Override
	@GET
	@Path("/katalog")
	public Katalogi pobierzKatalogi()
	{
		List<Katalog> listaKatalogow = bean.pobierzKatalogi();
		Katalogi kat = new Katalogi(listaKatalogow);
		return kat;
	}
	
	@Override
	@DELETE
	@Path("/katalog/{id}")
	public void usunKatalog(@PathParam("id") int id)
	{
		bean.usunKatalog(id);
	}
	
	
	
	@Override
	@POST
	@Path("/rezerwacja")
	public void stworzRezerwacje(Rezerwacja rezerwacja)
	{
		bean.stworzRezerwacje(rezerwacja);
	}
	
//	@POST
//	@Path("/rezerwacja/wycieczka/{id}")
//	public void rezerwacjaDoWycieczki(Rezerwacja rezerwacja, @PathParam("id") int id){
//		bean.stworzRezerwacjeW(rezerwacja, id);
//	}
	
	@Override
	@GET
	@Path("/rezerwacja/{id}")
	public Rezerwacja znajdzRezerwacje(@PathParam("id") int id)
	{
		return bean.znajdzRezerwacje(id);
	}
	
	@Override
	@GET
	@Path("/rezerwacja")
	public Rezerwacje pobierzRezerwacje()
	{
		List<Rezerwacja> listaRezerwacji = bean.pobierzRezerwacje();
		Rezerwacje rez = new Rezerwacje(listaRezerwacji);
		return rez;
	}
	
	@Override
	@GET
	@Path("/rezerwacja/{id}")
	public void usunRezerwacje(@PathParam("id") int id)
	{
		bean.usunRezerwacje(id);
	}
	
	@Override
	@PUT
	@Path("/rezerwacja")
	public void aktualizujRezerwacje(Rezerwacja rezerwacja)
	{
		bean.aktualizujRezerwacje(rezerwacja);
	}
	
	//@Override
//	@POST
//	@Path("/stworz/uczestnictwo")
//	public void stworzUczestnictwo(Uczestnictwo uczestnictwo)
//	{
//		bean.stworzUczestnictwo(uczestnictwo);
//	}
//	
//	@Override
//	@GET
//	@Path("/znajdz/uczestnictwo/{id}")
//	public Uczestnictwo znajdzUczestnictwo(@PathParam("id") int id)
//	{
//		return bean.znajdzUczestnictwo(id);
//	}
	
//	@Override
//	@GET
//	@Path("/pobierz/uczestnictwa")
//	public Uczestnictwa pobierzUczestnictwa()
//	{
//		List<Uczestnictwo> listaUczestnictw = bean.pobierzUczestnictwa();
//		Uczestnictwa ucz = new Uczestnictwa(listaUczestnictw);
//		return ucz;
//	}
//	
//	@Override
//	@GET
//	@Path("/usun/uczestnictwo/{id}")
//	public void usunUczestnictwo(@PathParam("id") int id)
//	{
//		bean.usunUczestnictwo(id);
//	}
//	
//	@Override
//	@POST
//	@Path("/aktualizuj/uczestnictwo")
//	public void aktualizujUczestnictwo(Uczestnictwo uczestnictwo)
//	{
//		bean.aktualizujUczestnictwo(uczestnictwo);
//	}
	
	@Override
	@POST
	@Path("/miejsce")
	public void stworzMiejsce(Miejsce miejsce)
	{
		bean.stworzMiejsce(miejsce);
	}
	
	@Override
	@GET
	@Path("/miejsce/{id}")
	public Miejsce znajdzMiejsce(@PathParam("id") int id)
	{
		return bean.znajdzMiejsce(id);
	}
	
	@Override
	@GET
	@Path("/miejsce")
	public Miejsca pobierzMiejsca()
	{
		List<Miejsce> listaMiejsc = bean.pobierzMiejsca();
		Miejsca miejsca = new Miejsca(listaMiejsc);
		return miejsca;
	}
	
	@Override
	@DELETE
	@Path("/miejsce/{id}")
	public void usunMiejsce(@PathParam("id") int id)
	{
		bean.usunMiejsce(id);
	}
	
	@Override
	@PUT
	@Path("/miejsce")
	public void aktualizujMiejsce(Miejsce miejsce)
	{
		bean.aktualizujMiejsce(miejsce);
	}
	
	@GET
	@Path("/miejsce/{idm}/katalog/{idk}")
	public void dodajMiejsceDoKatalogu(@PathParam("idm") int idMiejsce, @PathParam("idk") int idKatalog)
	{
		bean.dodajMiejsceDoKatalogu(idMiejsce, idKatalog);
	}
	
	@GET
	@Path("/wycieczka/{idw}/katalog/{idk}")
	public void dodajWycieczkeDoKatalogu(@PathParam("idw") int idWycieczka, @PathParam("idk") int idKatalog)
	{
		bean.dodajWycieczkeDoKatalogu(idWycieczka, idKatalog);
	}

	@GET
	@Path("/katalog/{idk}/rezerwacja/{idr}")
	public void dodajKatalogDoRezerwacji(@PathParam("idk") int idKatalog, @PathParam("idr") int idRezerwacja)
	{
		bean.dodajKatalogDoRezerwacji(idKatalog, idRezerwacja);
	}
	
	@GET
	@Path("/miejsce/{idm}/wycieczka/{idw}")
	public void dodajMiejsceDoWycieczki(@PathParam("idm") int idMiejsce, @PathParam("idw") int idWycieczka)
	{
		bean.dodajMiejsceDoWycieczki(idMiejsce, idWycieczka);
	}
}
