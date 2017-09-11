package pl.biuro.podrozy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Miejsca {

	private List<Miejsce> listaMiejsc = new ArrayList<Miejsce>();

	public Miejsca(List<Miejsce> listaMiejsc) {
		super();
		this.listaMiejsc = listaMiejsc;
	}

	public Miejsca() {	}
	
	public List<Miejsce> getMiejsca() {
		return listaMiejsc;
	}

	public void setMiejsca(List<Miejsce> listaMiejsc) {
		this.listaMiejsc = listaMiejsc;
	}
}
