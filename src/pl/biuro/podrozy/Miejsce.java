package pl.biuro.podrozy;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import pl.biuro.podrozy.Katalog;

import java.util.Collection;
import java.util.List;

@Entity
@XmlRootElement
public class Miejsce {
	
	@Id
	@GeneratedValue
	@XmlAttribute
	private int id_miejsce;
	private String miejscowosc;
	private String adres;
	
	public Miejsce()
	{
		
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getId_miejsce() {
		return id_miejsce;
	}
}
