package encapsulationPublic;

public class Main {
    public static void main(String[] args) {
        // Cr�ation d'un objet de la classe Voiture
        Voiture maVoiture = new Voiture("Toyota");

        // Utilisation de l'attribut et de la m�thode publics
        System.out.println("Marque de la voiture : " + maVoiture.marque);
        maVoiture.demarrer();
    }
}