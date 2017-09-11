package pl.biuro.podrozy;

import java.util.List;

import javax.ejb.Local;

@Local
public interface Biuro {
	// Wycieczka
	
	public abstract void stworzWycieczke(Wycieczka wycieczka);

	public abstract Wycieczka znajdzWycieczke(int id);

	public abstract Wycieczki pobierzWycieczki();

	public abstract void aktualizujWycieczke(Wycieczka wycieczka);

	public abstract void usunWycieczke(int id);
		
	//public abstract void dodajDoKatalogu(Katalog katalog, Wycieczka wycieczka);
	
	//public abstract void usunZKatalogu(Katalog katalog, Wycieczka wycieczka);
	
	// Katalog
	
	public abstract void stworzKatalog(Katalog katalog);
	
	public abstract Katalog znajdzKatalog(int id);
	
	public abstract Katalogi pobierzKatalogi();
	
	public abstract void usunKatalog(int id);
	
	public abstract Wycieczki pobierzWycieczkiZKatalogu(int id);
	
	//Rezerwacja
	
	public abstract void stworzRezerwacje(Rezerwacja rezerwacja);
	
	public abstract Rezerwacja znajdzRezerwacje(int id);
	
	public abstract Rezerwacje pobierzRezerwacje();
	
	public abstract void usunRezerwacje(int id);
	
	public abstract void aktualizujRezerwacje(Rezerwacja rezerwacja);
	
	//Uczestnictwo
	
	public abstract void stworzUczestnictwo(Uczestnictwo uczestnictwo);
	
	public abstract Uczestnictwo znajdzUczestnictwo(int id);
	
	public abstract Uczestnictwa pobierzUczestnictwa();
	
	public abstract void usunUczestnictwo(int id);
	
	public abstract void aktualizujUczestnictwo(Uczestnictwo uczestnictwo);
	
	//Miejsce
	
	public abstract void stworzMiejsce(Miejsce miejsce);
	
	public abstract Miejsce znajdzMiejsce(int id);
	
	public abstract Miejsca pobierzMiejsca();
	
	public abstract void usunMiejsce(int id);
	
	public abstract void aktualizujMiejsce(Miejsce miejsce);
	
	//public abstract void stworzMiejsce(String nazwa, String opis);
	
	//public abstract void usunMiejsce(Miejsce miejsce);

}
