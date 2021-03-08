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
	/*
	public void stampaVotiUguali (int punteggio) {
		// il Libretto stampa da solo i voti
	}
	
	public String votiUguali (int punteggio) {
		// calcola una stringa che contiene i voti
		// sarà poi il chiamante a stamparli
		// --> Solo il NOME?
		// o Tutto il voto.toString()
	}*/
	
	public List<Voto> listaVotiUguali (int punteggio){
		
		// restituisce solo i voti uguali al criterio
		List <Voto> risultato = new ArrayList<>();
		for (Voto v: this.listaVoti) {
			if (v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
		
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		
		for (Voto v: this.listaVoti) {
			if (v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for (Voto v: this.listaVoti) {
			if (v.getNomeCorso().equals(nomeCorso)) {
				risultato=v;
				break;
			}
		}
		return risultato;
	}
	
	public String toString() {
		
		String s="";
		for (Voto v: this.listaVoti) {
			s+= v.toString()+ "\n";
		}
		
		return s;
		
	}
	
	

}
