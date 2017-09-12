package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Collection;
import java.util.List;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import pl.biuro.podrozy.Rezerwacja;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:42
 */

@Entity
@XmlRootElement
public class Uczestnictwo {

	@Id
	@GeneratedValue
	@XmlAttribute
	private int id_uczestnictwa;
	private int liczba_osob;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Rezerwacja> rezerwacja;
	public Uczestnictwo(){

	}

	public int getLiczba_osob() {
		return liczba_osob;
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}

	public List<Rezerwacja> getRezerwacja() {
	    return rezerwacja;
	}

	public void setRezerwacja(List<Rezerwacja> param) {
	    this.rezerwacja = param;
	}
}//end Uczestnictwo