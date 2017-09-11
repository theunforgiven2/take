package pl.biuro.podrozy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wycieczki {
	
	private List<Wycieczka> listaWycieczek = new ArrayList<Wycieczka>();

	public Wycieczki(List<Wycieczka> listaWycieczek) {
		super();
		this.listaWycieczek = listaWycieczek;
	}

	public Wycieczki() {	}
	
	public List<Wycieczka> getWycieczki() {
		return listaWycieczek;
	}

	public void setWycieczki(List<Wycieczka> listaWycieczek) {
		this.listaWycieczek = listaWycieczek;
	}
}
