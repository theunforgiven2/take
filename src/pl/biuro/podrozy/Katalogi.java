package pl.biuro.podrozy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Katalogi {
	
	private List<Katalog> listaKatalogow = new ArrayList<Katalog>();

	public Katalogi(List<Katalog> listaKatalogow) {
		super();
		this.listaKatalogow = listaKatalogow;
	}

	public Katalogi() {	}
	
	public List<Katalog> getKatalogi() {
		return listaKatalogow;
	}

	public void setKatalogi(List<Katalog> listaKatalogow) {
		this.listaKatalogow = listaKatalogow;
	}
}
