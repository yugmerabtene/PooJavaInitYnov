package encapsulationPublic;

import encapsulationPrivate.CompteBancaire;

public class TestPrivateEncapsuledAttribut {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub				
			
	        CompteBancaire compte = new CompteBancaire("Jane Doe", 2000.0);
	        // La ligne suivante g�n�rera une erreur car les attributs sont priv�s (private).
	        // String titulaire = compte.titulaire;
	        // double solde = compte.solde;
	    }

	}
	
	


