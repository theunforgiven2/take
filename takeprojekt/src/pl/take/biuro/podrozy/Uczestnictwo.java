package pl.take.biuro.podrozy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import pl.take.biuro.podrozy.Rezerwacja;
import java.util.Collection;
import javax.persistence.OneToMany;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:42
 */

@Entity
public class Uczestnictwo {

	@Id
	@GeneratedValue
	private int id_uczestnictwa;
	private int liczba_osob;
	@OneToMany
	private Collection<Rezerwacja> rezerwacja;
	public Uczestnictwo(){

	}

	public int getLiczba_osob() {
		return liczba_osob;
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}

	public Collection<Rezerwacja> getRezerwacja() {
	    return rezerwacja;
	}

	public void setRezerwacja(Collection<Rezerwacja> param) {
	    this.rezerwacja = param;
	}
}//end Uczestnictwo