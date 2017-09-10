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


	public int getOkres() {
		return okres;
	}

	public void setOkres(int okres) {
		this.okres = okres;
	}


	public Collection<Wycieczka> getWycieczka() {
	    return wycieczka;
	}


	public void setWycieczka(Collection<Wycieczka> param) {
	    this.wycieczka = param;
	}

}//end Katalog