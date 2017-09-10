package pl.take.biuro.podrozy;

import java.util.List;

public interface Biuro {
	
	public abstract void stworzWycieczke(String nazwa, String opis, long dataOdjazdu, long dataPrzyjazdu);

	public abstract Wycieczka znajdzWycieczke(int id);

	public abstract List<Wycieczka> pobierzWycieczki();

	//public abstract void update(Car car);

	public abstract void usunWycieczke(int id);
		
	public abstract void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka);
	
	public abstract void usunZKatalogu(Katalog katalog, Wycieczka wycieczka);
	
	public abstract void stworzKatalog(int okres);
	
	public abstract Katalog znajdzKatalog(int id);
	
	public abstract void usunKatalog(Katalog katalog);
	
	public abstract void stworzMiejsce(String nazwa, String opis);
	
	public abstract void usunMiejsce(Miejsce miejsce);

}
