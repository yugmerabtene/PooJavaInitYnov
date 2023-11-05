package encapsulationPrivate;

public class CompteBancaire {
    // Attributs priv�s
    private String titulaire;
    private double solde;

    // Constructeur
    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    // M�thode pour d�poser de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    // M�thode pour retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        }
    }

    // Getter pour obtenir le titulaire du compte
    public String getTitulaire() {
        return titulaire;
    }

    // Getter pour obtenir le solde du compte
    public double getSolde() {
        return solde;
    }
}

