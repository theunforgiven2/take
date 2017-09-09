package pl.take.biuro.podrozy;

import java.util.List;

import javax.persistence.*;

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
	public List<Cennik> m_Cennik;
	//@OneToMany
	//public List<Wycieczka> m_Wycieczka;

	public Katalog(){

	}


	public int getOkres() {
		return okres;
	}

	public void setOkres(int okres) {
		this.okres = okres;
	}
}//end Katalog