package objectConstructor;

public class Personne {	
	
	  // Attributs (variables de classe)
    String nom;
    int age;

    // Constructeur de notre classe
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // M�thode // Fonction
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("�ge : " + age);
    }

  
}
