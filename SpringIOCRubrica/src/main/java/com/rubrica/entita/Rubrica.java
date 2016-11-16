package com.rubrica.entita;

import java.util.List;

public class Rubrica {
	
	private String nome;
	private List<Voce> voci = null;
	
	
		
	public Voce restituisciVoce(String nome) {
		for(Voce v : voci) {
			if(v.getNome().equals(nome)){
				return v;
			}
		}
		return null;
	}
	

	public Rubrica() {}
	
	public Rubrica(String nome, List<Voce> voci) {
		this.nome = nome;
		this.voci = voci;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Voce> getVoci() {
		return voci;
	}
	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
}
