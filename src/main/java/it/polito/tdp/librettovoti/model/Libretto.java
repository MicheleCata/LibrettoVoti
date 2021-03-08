package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> listaVoti;
	
	public Libretto () {
		listaVoti = new ArrayList <Voto>();
	}
	
	public void add(Voto v) {
		listaVoti.add(v);
	}
	
	public String toString() {
		
		String s="";
		for (Voto v: this.listaVoti) {
			s+= v.toString()+ "\n";
		}
		
		return s;
		
	}

}
