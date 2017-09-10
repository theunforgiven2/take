package pl.take.biuro.podrozy;

public interface Klient {

	public abstract void dodajRezerwacje(Rezerwacja rezerwacja);

	public abstract void usunRezerwacje(Rezerwacja rezerwacja);
	
	public abstract void modyfikujRezerwacje(Rezerwacja rezerwacja);
	
	public abstract Rezerwacja pobierzRezerwacje(int id);

	public abstract void dodajUczestnictwo(Uczestnictwo uczestnictwo);

	public abstract void usunUczestnictwo(Uczestnictwo uczestnictwo);
	
	public abstract void modyfikujUczestnictwo(Uczestnictwo uczestnictwo);
	
	public abstract Uczestnictwo pobierzUczestnictwo(int id);

}
