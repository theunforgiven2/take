package pl.take.biuro.podrozy;

import javax.persistence.*;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:44
 */

@Entity
public class Rezerwacja {

	@Id
	@GeneratedValue
	private int id_rezerwacji;
	private int liczba_osob;
	private boolean stan;
	private double zaliczka;
	@ManyToOne
	public Wycieczka m_Wycieczka;

	public Rezerwacja(){

	}

	public boolean isStan() {
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
}//end Rezerwacja