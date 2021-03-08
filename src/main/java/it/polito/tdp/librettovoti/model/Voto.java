package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

// POJO - Plain Old Java Object
// Java Bean
// Semplice contenitore di dati -- non ha "logica"

/**
 * Memorizza il risultato di un esame
 * @author Michele
 *
 */
public class Voto {
	
	private String nomeCorso;
	private int voto;
	private LocalDate dataEsame; //data superamento esame
	
	public Voto(String nomeCorso, int voto, LocalDate dataEsame) {
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataEsame = dataEsame;
		
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(LocalDate dataEsame) {
		this.dataEsame = dataEsame;
	}

	@Override
	public String toString() {
		return "nomeCorso: " + nomeCorso + " superato con " + voto + " in data " + dataEsame;
	}
	
	
	
	

}
