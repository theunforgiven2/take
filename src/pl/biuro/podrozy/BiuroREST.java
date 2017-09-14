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
	@Path("/wycieczka/miejscowosc/{mid}")
	public void stworzWycieczke(Wycieczka wycieczka, @PathParam("mid") int mid) {
		bean.stworzWycieczke(wycieczka, mid);
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
	
//	@GET
//	@Path("/wycieczka/{id}/rezerwacje")
//	public Rezerwacje pobierzRezerwacjeWycieczki(@PathParam("id") int id) {
//		List<Rezerwacja> listaRezerwacji = bean.pobierzRezerwacjeDoWycieczki(id);
//		Rezerwacje rezerwacje = new Rezerwacje(listaRezerwacji);
//		return rezerwacje;
//	}
	
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
	@Path("/katalog/wycieczka/{wid}/miejsce/{mid}")
	public void stworzKatalog(Katalog katalog, @PathParam("wid") int wid, @PathParam("mid") int mid)
	{
		bean.stworzKatalog(katalog, wid, mid);
	}
	
	@Override
	@GET
	@Path("/katalog/{id}")
	public Katalog znajdzKatalog(@PathParam("id") int id)
	{
		return bean.znajdzKatalog(id);
	}
	
	@GET
	@Path("/katalog/{id}/rezerwacje")
	public Rezerwacje rezerwacjeKatalogu(@PathParam("id") int id){
		List<Rezerwacja> lista = bean.pobierzRezerwacjeKatalogu(id);
		Rezerwacje rez = new Rezerwacje(lista);
		return rez;
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
	
	@POST
	@Path("/rezerwacja/katalog/{id}")
	public void stworzRezerwacje(Rezerwacja rezerwacja, @PathParam("id") int id)
	{
		bean.stworzRezerwacje(rezerwacja, id);
	}

	
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
	@DELETE
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
	@Path("/miejsce/{id}")
	public void aktualizujMiejsce(Miejsce miejsce, @PathParam("id") int id)
	{
		bean.aktualizujMiejsce(miejsce, id);
	}
	
	@PUT
	@Path("/rezerwacja/{id}")
	public void aktualizujRezerwacje(Rezerwacja rezerwacja, @PathParam("id") int id)
	{
		bean.aktualizujRezerwacje(rezerwacja, id);
	}
	
	@PUT
	@Path("/katalog/{id}")
	public void aktualizujKatalog(Katalog katalog, @PathParam("id") int id)
	{
		bean.aktualizujKatalog(katalog, id);
	}
	
	@PUT
	@Path("/wycieczka/{id}")
	public void aktualizujWycieczke(Wycieczka wycieczka, @PathParam("id") int id)
	{
		bean.aktualizujWycieczke(wycieczka, id);
	}
	
	@PUT
	@Path("/katalog/{idk}/wycieczka/{idw}/miejsce/{idm}")
	public void aktualizujWycieczkeMiejsceWKatalog(Katalog katalog, @PathParam("idk") int idKatalog, @PathParam("idw") int idWycieczka, @PathParam("idm") int idMiejsce)
	{
		bean.aktualizujWycieczkeMiejsceWKatalog(katalog, idKatalog, idWycieczka, idMiejsce);
	}
	
	@PUT
	@Path("/rezerwacja/{idr}/katalog/{idk}")
	public void aktualizujKatalogWRezerwacja(Rezerwacja rezerwacja, @PathParam("idr") int idRezerwacja, @PathParam("idk") int idKatalog)
	{
		bean.aktualizujKatalogWRezerwacja(rezerwacja, idRezerwacja, idKatalog);
	}
	
	@PUT
	@Path("/wycieczka/{idw}/miejsce/{idm}")
	public void aktualizujMiejsceWWycieczka(Wycieczka wycieczka, @PathParam("idw") int idWycieczka, @PathParam("idm") int idMiejsce)
	{
		bean.aktualizujMiejsceWWycieczka(wycieczka, idWycieczka, idMiejsce);
	}
	
	// TODO NIE DZIALAJO DO POPRAWY
	@Override
	@GET
	@Path("/katalog/{idk}/wycieczka")
	public Wycieczki pobierzWycieczkiZKatalogu(@PathParam("idk") int idKatalog)
	{
		List<Wycieczka> listaWycieczek = bean.pobierzWycieczkiZKatalogu(idKatalog);
		Wycieczki wyc = new Wycieczki(listaWycieczek);
		return wyc;
	}
	
	@GET
	@Path("/rezerwacja/{idr}/katalog")
	public Katalogi pobierzKatalogiZRezerwacji(@PathParam("idr") int idRezerwacja)
	{
		List<Katalog> kat = bean.pobierzKatalogiZRezerwacji(idRezerwacja);
		Katalogi katalogi = new Katalogi(kat);
		return katalogi;
	}
	
	@GET
	@Path("/katalog/{idk}/miejsce")
	public Miejsca pobierzMiejscaZKatalogu(@PathParam("idk") int idKatalog)
	{
		List<Miejsce> mi = bean.pobierzMiejscaZKatalogu(idKatalog);
		Miejsca miejsca = new Miejsca(mi);
		return miejsca;
	}
	
	@GET
	@Path("/wycieczka/{idw}/miejsce")
	public Miejsca pobierzMiejscaZWycieczki(@PathParam("idw") int idWycieczka)
	{
		List<Miejsce> mi = bean.pobierzMiejscaZWycieczki(idWycieczka);
		Miejsca miejsca = new Miejsca(mi);
		return miejsca;
	}
}
