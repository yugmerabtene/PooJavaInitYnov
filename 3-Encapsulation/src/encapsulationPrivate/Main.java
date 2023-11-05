package encapsulationPrivate;

public class Main {
    public static void main(String[] args) {
        // Cr�ation d'un objet de la classe CompteBancaire
        CompteBancaire monCompte = new CompteBancaire("John Doe", 1000.0);

        // Acc�s aux m�thodes publiques pour effectuer des op�rations sur le compte
        monCompte.deposer(500.0);
        monCompte.retirer(200.0);

        // Acc�s en lecture aux donn�es encapsul�es � l'aide des getters
        System.out.println("Titulaire du compte : " + monCompte.getTitulaire());
        System.out.println("Solde du compte : " + monCompte.getSolde());
    }
}

