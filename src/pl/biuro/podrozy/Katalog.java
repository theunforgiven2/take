package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.Collection;
import java.util.List;

import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import pl.biuro.podrozy.Wycieczka;

/**
 * @author kp
 * @version 1.0
 * @created 14-maj-2017 01:33:45
 */
@Entity
@XmlRootElement
public class Katalog {

	@Id
	@GeneratedValue
	@XmlAttribute
	private int id_katalog;
	private long data_odjazdu;
	private long data_przyjazdu;
	private int cena;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	private Miejsce miejsce;
	@ManyToOne(cascade = CascadeType.DETACH)
	private Wycieczka wycieczka;
	
	public Katalog(){

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

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public Miejsce getMiejsce() {
		return miejsce;
	}

	public void setMiejsce(Miejsce miejsce) {
		this.miejsce = miejsce;
	}

	public Wycieczka getWycieczka() {
		return wycieczka;
	}

	public void setWycieczka(Wycieczka wycieczka) {
		this.wycieczka = wycieczka;
	}

	public int getId_katalog() {
		return id_katalog;
	}

	

}//end Katalog