package pl.take.biuro.podrozy;

import javax.persistence.*;

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
	public Rezerwacja m_Rezerwacja;

	public Uczestnictwo(){

	}

	public void finalize() throws Throwable {

	}

	public int getLiczba_osob() {
		return liczba_osob;
	}

	public void setLiczba_osob(int liczba_osob) {
		this.liczba_osob = liczba_osob;
	}
}//end Uczestnictwo