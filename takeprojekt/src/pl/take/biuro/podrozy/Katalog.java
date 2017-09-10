package pl.take.biuro.podrozy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import pl.take.biuro.podrozy.Wycieczka;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:45
 */
@Entity
public class Katalog {

	@Id
	@GeneratedValue
	private int id_katalog;
	private int okres;
	@OneToMany
	private Collection<Wycieczka> wycieczka;
	
	public Katalog(){

	}

	public int getID()
	{
		return id_katalog;
	}
	public int getOkres() {
		return okres;
	}

	public void setOkres(int okres) {
		this.okres = okres;
	}

	public Wycieczka getWycieczka(int id) {
		Wycieczka[] arr = (Wycieczka[])wycieczka.toArray();
	    return arr[id];
	}

	public void setWycieczka(Wycieczka wycieczka) {
	    this.wycieczka.add(wycieczka);
	}
	
	public Collection<Wycieczka> getlistaWycieczek()
	{
		return wycieczka;
	}
	
	public void setlistaWycieczek(Collection<Wycieczka> lista)
	{
		this.wycieczka = lista;
	}
	
	public void usunWycieczke(Wycieczka wyc)
	{
		for(Wycieczka w : wycieczka)
		{
			if (w.getID() == wyc.getID())
					{
						wycieczka.remove(w);
						break;
					}	
		}
	}

}//end Katalog