package pl.biuro.podrozy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	private String nazwa;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Wycieczka> wycieczka;
	
	public Katalog(){

	}

	public int getID()
	{
		return id_katalog;
	}
	
	public List<Wycieczka> getlistaWycieczek()
	{
		return wycieczka;
	}
	
	public void setlistaWycieczek(List<Wycieczka> lista)
	{
		this.wycieczka = lista;
	}
	

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajWycieczke(Wycieczka wycieczka)
	{
		this.wycieczka.add(wycieczka);
	}

}//end Katalog