package pl.biuro.podrozy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Uczestnictwa {
	
	private List<Uczestnictwo> listaUczestnictw = new ArrayList<Uczestnictwo>();

	public Uczestnictwa(List<Uczestnictwo> listaUczestnictw) {
		super();
		this.listaUczestnictw = listaUczestnictw;
	}

	public Uczestnictwa() {
		
	}
	
	public List<Uczestnictwo> getUczestnictwa() {
		return listaUczestnictw;
	}

	public void setUczestnictwa(List<Uczestnictwo> listaUczestnictw) {
		this.listaUczestnictw = listaUczestnictw;
	}

}
