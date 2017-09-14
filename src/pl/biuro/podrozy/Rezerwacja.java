package pl.biuro.podrozy;

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
	@ManyToOne
	private Wycieczka wycieczka;
	
	public Rezerwacja(){

	}

	public boolean getStan() {
		return stan;
	}

	public void setStan(boolean stan) {
		this.stan = stan;
	}

	public int getLiczba_osob() {
		return liczba_osob;
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}

	public double getZaliczka() {
		return zaliczka;
	}

	public void setZaliczka(double zaliczka) {
		this.zaliczka = zaliczka;
	}
	
	public Wycieczka getWycieczka() {
		return wycieczka;
	}

	public void setWycieczka(Wycieczka wycieczka) {
		this.wycieczka = wycieczka;
	}

}//end Rezerwacja