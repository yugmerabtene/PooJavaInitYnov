package encapsulationProtected;

public class Main {
    public static void main(String[] args) {
        // Cr�ation d'un objet de la classe Chien
        Animal monChien = new Animal("Rex");

        // Utilisation des membres prot�g�s et publics
        System.out.println("Nom du chien : " + monChien.nom);
        monChien.faireDuBruit(); // Appel de la m�thode prot�g�e de la classe parente
       
    }
}