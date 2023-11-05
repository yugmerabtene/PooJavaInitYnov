package settersAndGetters;

public class Personne {	
	
    // Attributs (variables de classe)
    private String nom;
    private int age;

    // Constructeur sans param�tres
    public Personne() {
        // Vous pouvez laisser le constructeur sans param�tres vide ou d�finir des valeurs par d�faut
    }

    // M�thodes Getter pour l'attribut "nom"
    public String getNom() {
        return nom;
    }

    // M�thode Setter pour l'attribut "nom"
    public void setNom(String nom) {
        this.nom = nom;
    }

    // M�thodes Getter pour l'attribut "age"
    public int getAge() {
        return age;
    }

    // M�thode Setter pour l'attribut "age"
    public void setAge(int age) {
        this.age = age;
    }

    // M�thode
    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("�ge : " + age);
    }
}
