package pl.biuro.podrozy;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

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
	private String nazwa;
	private String opis;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Katalog> katalog;
	
	public Miejsce()
	{
		
	}
	
	public String getNazwa()
	{
		return nazwa;
	}
	
	public void setNazwa(String nazwa)
	{
		this.nazwa = nazwa;
	}
	
	public String getOpis()
	{
		return opis;
	}
	
	public void setOpis(String opis)
	{
		this.opis = opis;
	}
	
	public List<Katalog> getKatalog() {
	    return katalog;
	}

	public void setKatalog(List<Katalog> param) {
	    this.katalog = param;
	}

}
