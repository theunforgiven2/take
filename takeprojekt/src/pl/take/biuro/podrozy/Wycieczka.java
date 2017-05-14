package pl.take.biuro.podrozy;

import java.util.List;

import javax.persistence.*;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:41
 */

@Entity
public class Wycieczka {

	@Id
	@GeneratedValue
	private int id_wycieczki;
	private long data_odjazdu;
	private long data_przyjazdu;
	private String nazwa;
	private String opis;
	@OneToMany(mappedBy="m_Wycieczka")
	private List<Rezerwacja> m_Rezerwacje;

	public Wycieczka(){

	}

	public long getData_odjazdu() {
		return data_odjazdu;
	}

	public void setData_odjazdu(long data_odjazdu) {
		this.data_odjazdu = data_odjazdu;
	}

	public long getData_przyjazdu() {
		return data_przyjazdu;
	}

	public void setData_przyjazdu(long data_przyjazdu) {
		this.data_przyjazdu = data_przyjazdu;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
}//end Wycieczka