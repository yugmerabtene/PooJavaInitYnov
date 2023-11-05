package modifiers;

import java.io.Serializable;

public class Main {
	
	
	// Les modificateurs d'acc�s sont utilis�s en programmation pour d�finir l'acc�s et la visibilit� des classes, des attributs, des m�thodes et des constructeurs dans un programme.

	// Modificateurs d'acc�s

	// Pour les classes, vous pouvez utiliser "public" ou "par d�faut" :

	// `public` : La classe est accessible depuis n'importe quelle autre classe.


	public class MaClassePublic {
	    // Le code de la classe est accessible depuis n'importe quelle autre classe.
	}


	// "par d�faut" : La classe n'est accessible que depuis les classes du m�me package. Cela est utilis� lorsque vous ne sp�cifiez pas de modificateur d'acc�s.


	class MaClasseDefaut {
	    // Le code de la classe n'est accessible qu'� partir des classes du m�me package.
	}


	 // Pour les attributs, les m�thodes et les constructeurs, vous pouvez utiliser l'un des modificateurs suivants :

	// `public` : Le code est accessible depuis toutes les classes.


	public class MaClasseAtrributPublic {
	    public int monAttribut; // Cet attribut est accessible depuis n'importe quelle classe.
	    
	    public void maMethode() {
	        // Cette m�thode est accessible depuis n'importe quelle classe.
	    }
	}

	// `private` : Le code n'est accessible qu'� l'int�rieur de la classe d�clar�e.

	public class MaClasseAttributPrivate {
	    private int monAttribut; // Cet attribut n'est accessible qu'� l'int�rieur de cette classe.
	    
	    private void maMethode() {
	        // Cette m�thode n'est accessible qu'� l'int�rieur de cette classe.
	    }
	}

	// "par d�faut" : Le code n'est accessible qu'� l'int�rieur du m�me package. Cela est utilis� lorsque vous ne sp�cifiez pas de modificateur d'acc�s.


	class MaClasse {
	    int monAttribut; // Cet attribut n'est accessible qu'� partir des classes du m�me package.
	    
	    void maMethode() {
	        // Cette m�thode n'est accessible qu'� partir des classes du m�me package.
	    }
	}

	// `protected` : Le code est accessible dans le m�me package et par les sous//classes. Vous en apprendrez davantage sur les sous//classes et les superclasses dans le chapitre sur l'h�ritage.


	public class MaClassePublicAttributProtected {
	    protected int monAttribut; // Cet attribut est accessible dans le m�me package et par les sous//classes.
	    
	    protected void maMethode() {
	        // Cette m�thode est accessible dans le m�me package et par les sous//classes.
	    }
	}


	// Modificateurs non d'acc�s

	 // Pour les classes, vous pouvez utiliser "final" ou "abstrait" :

	// `final` : La classe ne peut pas �tre h�rit�e par d'autres classes. Vous en apprendrez davantage sur l'h�ritage dans le chapitre sur l'h�ritage.


	public final class MaClasseFinale {
	    // Cette classe ne peut pas �tre h�rit�e par d'autres classes.
	}


	// `abstrait` : La classe ne peut pas �tre utilis�e pour cr�er des objets. Pour acc�der � une classe abstraite, elle doit �tre h�rit�e d'une autre classe. Vous en apprendrez davantage sur l'h�ritage et l'abstraction dans les chapitres correspondants.


	public abstract class MaClasseAbstract {
	    // Cette classe ne peut pas �tre utilis�e pour cr�er des objets directement.
	    // Elle doit �tre h�rit�e par une autre classe qui fournira une impl�mentation.
	}


	// Pour les attributs et les m�thodes, vous pouvez utiliser l'un des modificateurs suivants :

	// `final` : Les attributs et les m�thodes ne peuvent pas �tre red�finis/modifi�s.


	public class MaClasseAttributFinale {
	    final int monAttribut = 10; // Cet attribut ne peut pas �tre modifi� une fois initialis�.
	    
	    final void maMethode() {
	        // Cette m�thode ne peut pas �tre red�finie par les sous//classes.
	    }
	}


	// `static` : Les attributs et les m�thodes appartiennent � la classe plut�t qu'� un objet.


	public class MaClasseAttributStatic {
	    static int monAttributStatique = 5; // Cet attribut appartient � la classe elle//m�me.
	    
	    static void maMethodeStatique() {
	        // Cette m�thode appartient � la classe elle//m�me.
	    }
	}


	// `transient` : Les attributs et les m�thodes sont ignor�s lors de la s�rialisation de l'objet les contenant.


	public class MaClassePublicHeritage implements Serializable {
	    transient int monAttributTransient; // Cet attribut est ignor� lors de la s�rialisation.
	    
	    // ...
	}


	// `synchronized` : Les m�thodes ne peuvent �tre acc�d�es que par un seul thread � la fois.


	public class MaClasseSynchronizedMethod {
	    synchronized void maMethodeSynchro() {
	        // Cette m�thode ne peut �tre ex�cut�e que par un seul thread � la fois.
	    }
	}


	// `volatile` : La valeur d'un attribut n'est pas mise en cache localement par le thread et est toujours lue depuis la "m�moire principale".


	public class MaClasseVolatileAttributs {
	    volatile int monAttributVolatile; // La valeur de cet attribut est toujours lue depuis la m�moire principale.
	}


	// Ces modificateurs d'acc�s et non d'acc�s sont essentiels pour contr�ler l'acc�s, l'h�ritage, la red�finition et d'autres aspects du comportement des classes et des objets en programmation orient�e objet.

}
