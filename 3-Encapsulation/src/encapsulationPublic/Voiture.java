package encapsulationPublic;

public class Voiture {
    // Attribut public
    public String marque;

    // Constructeur public
    public Voiture(String marque) {
        this.marque = marque;
    }

    // M�thode publique
    public void demarrer() {
        System.out.println("La voiture de marque " + marque + " d�marre.");
    }
}