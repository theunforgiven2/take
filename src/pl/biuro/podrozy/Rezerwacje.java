package pl.biuro.podrozy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rezerwacje {

	private List<Rezerwacja> listaRezerwacji = new ArrayList<Rezerwacja>();

	public Rezerwacje(List<Rezerwacja> listaRezerwacji) {
		super();
		this.listaRezerwacji = listaRezerwacji;
	}

	public Rezerwacje() {	}
	
	public List<Rezerwacja> getRezerwacje() {
		return listaRezerwacji;
	}

	public void setRezerwacje(List<Rezerwacja> listaRezerwacji) {
		this.listaRezerwacji = listaRezerwacji;
	}
}
