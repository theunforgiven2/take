package pl.take.biuro.podrozy;

import javax.persistence.*;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:46
 */

@Entity
public class Cennik {

	@Id
	@GeneratedValue
	private int id_cennik;
	private double cena;
	private long okres_do;
	private long okres_od;

	public Cennik(){

	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public long getOkres_do() {
		return okres_do;
	}

	public void setOkres_do(long okres_do) {
		this.okres_do = okres_do;
	}

	public long getOkres_od() {
		return okres_od;
	}

	public void setOkres_od(long okres_od) {
		this.okres_od = okres_od;
	}
}//end Cennik