
public class joueur {
 int niveau;
 String nomprenom;
 float montant;
public int getNiveau() {
	return niveau;
}
public float getMontant() {
	return montant;
}
public joueur(int niveau, String nomprenom, float montant) {
	super();
	this.niveau = niveau;
	this.nomprenom = nomprenom;
	this.montant = montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public void setNiveau(int niveau) {
	this.niveau = niveau;
}
public String getNomprenom() {
	return nomprenom;
}
public void setNomprenom(String nomprenom) {
	this.nomprenom = nomprenom;
}
@Override
public String toString() {
	return "niveau=" + niveau + ", "+nomprenom + ", Montant=" + montant ;
}
}
