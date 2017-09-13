package pl.biuro.podrozy;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/podrozy")

@Consumes({ "application/json" })
@Produces({ "application/json" })
public class BiuroREST implements Biuro {
	
	@EJB
	BiuroEJB bean;

	@Override
	@POST
	@Path("/stworz/wycieczka/")
	public void stworzWycieczke(Wycieczka wycieczka) {
		bean.stworzWycieczke(wycieczka);
	}

	@Override
	@GET
	@Path("/znajdz/wycieczka/{id}")	
	public Wycieczka znajdzWycieczke(@PathParam("id") int id) {
		return bean.znajdzWycieczke(id);
	}
	
	@Override
	@GET
	@Path("/pobierz/wycieczki")
	public Wycieczki pobierzWycieczki() {
		List<Wycieczka> lWyc = bean.pobierzWycieczki();
		Wycieczki wyc = new Wycieczki(lWyc);
		return wyc;
	}

	@Override
	@GET
	@Path("/usun/wycieczka/{id}")
	public void usunWycieczke(@PathParam("id") int id) {
		bean.usunWycieczke(id);
	}
	
	@Override
	@POST
	@Path("/aktualizuj/wycieczka")
	public void aktualizujWycieczke(Wycieczka wycieczka)
	{
		bean.aktualizujWycieczke(wycieczka);
	}

	@Override
	@POST
	@Path("/stworz/katalog")
	public void stworzKatalog(Katalog katalog)
	{
		bean.stworzKatalog(katalog);
	}
	
	@Override
	@GET
	@Path("/znajdz/katalog/{id}")
	public Katalog znajdzKatalog(@PathParam("id") int id)
	{
		return bean.znajdzKatalog(id);
	}
	
	@Override
	@GET
	@Path("/pobierz/katalogi")
	public Katalogi pobierzKatalogi()
	{
		List<Katalog> listaKatalogow = bean.pobierzKatalogi();
		Katalogi kat = new Katalogi(listaKatalogow);
		return kat;
	}
	
	@Override
	@GET
	@Path("/usun/katalog/{id}")
	public void usunKatalog(@PathParam("id") int id)
	{
		bean.usunKatalog(id);
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
	@POST
	@Path("/stworz/rezerwacja")
	public void stworzRezerwacje(Rezerwacja rezerwacja)
	{
		bean.stworzRezerwacje(rezerwacja);
	}
	
	@Override
	@GET
	@Path("/znajdz/rezerwacja/{id}")
	public Rezerwacja znajdzRezerwacje(@PathParam("id") int id)
	{
		return bean.znajdzRezerwacje(id);
	}
	
	@Override
	@GET
	@Path("/pobierz/rezerwacje")
	public Rezerwacje pobierzRezerwacje()
	{
		List<Rezerwacja> listaRezerwacji = bean.pobierzRezerwacje();
		Rezerwacje rez = new Rezerwacje(listaRezerwacji);
		return rez;
	}
	
	@Override
	@GET
	@Path("/usun/rezerwacja/{id}")
	public void usunRezerwacje(@PathParam("id") int id)
	{
		bean.usunRezerwacje(id);
	}
	
	@Override
	@POST
	@Path("/aktualizuj/rezerwacja")
	public void aktualizujRezerwacje(Rezerwacja rezerwacja)
	{
		bean.aktualizujRezerwacje(rezerwacja);
	}
	
	@Override
	@POST
	@Path("/stworz/uczestnictwo")
	public void stworzUczestnictwo(Uczestnictwo uczestnictwo)
	{
		bean.stworzUczestnictwo(uczestnictwo);
	}
	
	@Override
	@GET
	@Path("/znajdz/uczestnictwo/{id}")
	public Uczestnictwo znajdzUczestnictwo(@PathParam("id") int id)
	{
		return bean.znajdzUczestnictwo(id);
	}
	
	@Override
	@GET
	@Path("/pobierz/uczestnictwa")
	public Uczestnictwa pobierzUczestnictwa()
	{
		List<Uczestnictwo> listaUczestnictw = bean.pobierzUczestnictwa();
		Uczestnictwa ucz = new Uczestnictwa(listaUczestnictw);
		return ucz;
	}
	
	@Override
	@GET
	@Path("/usun/uczestnictwo/{id}")
	public void usunUczestnictwo(@PathParam("id") int id)
	{
		bean.usunUczestnictwo(id);
	}
	
	@Override
	@POST
	@Path("/aktualizuj/uczestnictwo")
	public void aktualizujUczestnictwo(Uczestnictwo uczestnictwo)
	{
		bean.aktualizujUczestnictwo(uczestnictwo);
	}
	
	@Override
	@POST
	@Path("/stworz/miejsce")
	public void stworzMiejsce(Miejsce miejsce)
	{
		bean.stworzMiejsce(miejsce);
	}
	
	@Override
	@GET
	@Path("/znajdz/miejsce/{id}")
	public Miejsce znajdzMiejsce(@PathParam("id") int id)
	{
		return bean.znajdzMiejsce(id);
	}
	
	@Override
	@GET
	@Path("/pobierz/miejsca")
	public Miejsca pobierzMiejsca()
	{
		List<Miejsce> listaMiejsc = bean.pobierzMiejsca();
		Miejsca miejsca = new Miejsca(listaMiejsc);
		return miejsca;
	}
	
	@Override
	@GET
	@Path("/usun/miejsce/{id}")
	public void usunMiejsce(@PathParam("id") int id)
	{
		bean.usunMiejsce(id);
	}
	
	@Override
	@POST
	@Path("/aktualizuj/miejsce")
	public void aktualizujMiejsce(Miejsce miejsce)
	{
		bean.aktualizujMiejsce(miejsce);
	}

}
