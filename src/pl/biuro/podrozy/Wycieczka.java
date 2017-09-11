package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import pl.take.biuro.podrozy.Rezerwacja;
import java.util.Collection;
import java.util.List;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:41
 */

@Entity
@XmlRootElement
public class Wycieczka {

	@Id
	@GeneratedValue
	@XmlAttribute
	private int id_wycieczka;
	private String nazwa;
	private String opis;
	private long data_odjazdu;
	private long data_przyjazdu;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Rezerwacja> rezerwacja;
	
	
	public Wycieczka(){

	}
	
	public int getID()
	{
		return id_wycieczka;
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

	public List<Rezerwacja> getRezerwacja() {
	    return rezerwacja;
	}

	public void setRezerwacja(List<Rezerwacja> param) {
	    this.rezerwacja = param;
	}

}//end Wycieczka