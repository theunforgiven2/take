package pl.take.biuro.podrozy;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/podrozy")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })
public class BiuroREST implements Biuro {
	
	@EJB
	BiuroEJB bean;

	@Override
	@Path("/stworz/wycieczka/{nazwa}/{opis}/{dataod}/{datap}")
	public void stworzWycieczke(@PathParam("nazwa") String nazwa,@PathParam("opis") String opis,@PathParam("dataod") long dataOdjazdu,@PathParam("datap") long dataPrzyjazdu) {
		bean.stworzWycieczke(nazwa, opis, dataPrzyjazdu, dataOdjazdu);
	}

	@Override
	@GET
	@Path("/znajdz/wycieczka/{id}")	
	public Wycieczka znajdzWycieczke(@PathParam("id") int id) {
		return bean.znajdzWycieczke(id);
	}
	
	
	@GET
    @Path("/test")
	public String testujo() {
		
		return "teeeeeeeeeeeeeeeestujo";
	}

	@Override
	public List<Wycieczka> pobierzWycieczki() {
		return bean.pobierzWycieczki();
	}

	@Override
	public void usunWycieczke(int id) {
		bean.usunWycieczke(id);
	}

	@Override
	public void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka) {
		bean.dodajDoKatalogu(katalog, wycieczka);
	}

	@Override
	public void usunZKatalogu(Katalog katalog, Wycieczka wycieczka) {
		bean.usunZKatalogu(katalog, wycieczka);
	}

	@Override
	public void stworzKatalog(int okres) {
		bean.stworzKatalog(okres);
	}

	@Override
	public Katalog znajdzKatalog(int id) {
		return bean.znajdzKatalog(id);
	}

	@Override
	public void usunKatalog(Katalog katalog) {
		bean.usunKatalog(katalog);
	}

	@Override
	public void stworzMiejsce(String nazwa, String opis) {
		bean.stworzMiejsce(nazwa, opis);
	}

	@Override
	public void usunMiejsce(Miejsce miejsce) {
		bean.usunMiejsce(miejsce);
	}

}
