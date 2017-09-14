package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:44
 */

@Entity
public class Rezerwacja {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private int liczba_osob;
	private boolean stan;
	private double zaliczka;
	
<<<<<<< HEAD
	@ManyToOne(cascade = CascadeType.DETACH)
=======
	@ManyToOne
>>>>>>> origin/master
	private Katalog katalog;

	public int getLiczba_osob() {
		return liczba_osob;
<<<<<<< HEAD
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}

=======
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}

>>>>>>> origin/master
	public boolean isStan() {
		return stan;
	}

	public void setStan(boolean stan) {
		this.stan = stan;
	}

	public double getZaliczka() {
		return zaliczka;
	}

	public void setZaliczka(double zaliczka) {
		this.zaliczka = zaliczka;
	}

	public Katalog getKatalog() {
		return katalog;
	}

	public void setKatalog(Katalog katalog) {
		this.katalog = katalog;
	}

	public int getRid() {
		return rid;
	}
	
	

}//end Rezerwacja