package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.ArrayList;
//import pl.take.biuro.podrozy.Rezerwacja;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:41
 */

@Entity
public class Wycieczka  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wid;
	private String nazwa;
	private String opis;
	private long data_odjazdu;
	private long data_przyjazdu;
	
	public Wycieczka(){

	}
	
	public int getID()
	{
		return wid;
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