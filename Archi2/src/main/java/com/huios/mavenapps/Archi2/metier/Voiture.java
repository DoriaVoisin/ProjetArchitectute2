package com.huios.mavenapps.Archi2.metier;

public class Voiture{ 
private int numVoitre;
private String marque;
private String concessionnaire;
private Personne proprietaire;
public int getNumVoitre() {
	return numVoitre;
}
public void setNumVoitre(int numVoitre) {
	this.numVoitre = numVoitre;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getConcessionnaire() {
	return concessionnaire;
}
public void setConcessionnaire(String concessionnaire) {
	this.concessionnaire = concessionnaire;
}
public Personne getProprietaire() {
	return proprietaire;
}
public void setProprietaire(Personne proprietaire) {
	this.proprietaire = proprietaire;
}
@Override
public String toString() {
	return "Voiture [numVoitre=" + numVoitre + ", marque=" + marque + ", concessionnaire=" + concessionnaire
			+ ", proprietaire=" + proprietaire + "]";
}




}
