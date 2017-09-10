package pl.take.biuro.podrozy;
import javax.persistence.*;
import pl.take.biuro.podrozy.Katalog;
import java.util.Collection;

@Entity
public class Miejsce {
	
	@Id
	@GeneratedValue
	private int id_miejsce;
	private String nazwa;
	private String opis;
	@OneToMany
	private Collection<Katalog> katalog;
	
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
	
	public Collection<Katalog> getKatalog() {
	    return katalog;
	}

	public void setKatalog(Collection<Katalog> param) {
	    this.katalog = param;
	}

}
