package pl.take.biuro.podrozy;

import java.util.List;

public interface Biuro {
	
	public abstract void stworzWycieczke(Miejsce miejsce_pocz, Miejsce miejsce_kon, int wolne_miejsca);

	public abstract Wycieczka znajdzWycieczke(int id);

	public abstract List<Wycieczka> pobierzWycieczki();

	//public abstract void update(Car car);

	public abstract void usunWycieczke(int id);
		
	public abstract void dodajDoKatalogu(Wycieczka wycieczka);
	
	public abstract void usunZKatalogu(Wycieczka wycieczka);
	
	public abstract void stworzKatalog(Katalog katalog);
	
	public abstract Katalog znajdzKatalog(int id);
	
	public abstract void usunKatalog(Katalog katalog);
	
	public abstract void stworzMiejsce(Miejsce miejsce);
	
	public abstract void usunMiejsce(Miejsce miejsce);

}
