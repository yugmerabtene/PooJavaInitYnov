package encapsulationProtected;

class Animal {
    // Attribut prot�g�
    protected String nom;

    // Constructeur
    public Animal(String nom) {
        this.nom = nom;
    }

    // M�thode prot�g�e
    protected void faireDuBruit() {
        System.out.println(nom + " �met un son.");
    }
}




