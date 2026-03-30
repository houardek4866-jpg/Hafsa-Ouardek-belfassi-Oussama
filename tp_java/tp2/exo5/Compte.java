public class Compte {

    
    private static int compteur = 0;  
    private int    code;
    private double solde;
    private Client proprietaire;


    public int    getCode()          { return code;         }
    public double getSolde()         { return solde;        }
    public Client getProprietaire()  { return proprietaire; }
    public void   setProprietaire(Client c) { this.proprietaire = c; }

    
    public Compte(Client client) {
        compteur++;
        this.code         = compteur;
        this.solde        = 0;
        this.proprietaire = client;
    }

    public Compte(Client client, double soldeInitial) {
        this(client);
        this.solde = soldeInitial;

    }


    
    public void crediter(double somme) {
        solde += somme;
    }

    
    public void crediter(double somme, Compte source) {
        source.debiter(somme);
        this.solde += somme;
    }


    public void debiter(double somme) {
        if (somme <= solde)
            solde -= somme;
        else
            System.out.println("⚠ Solde insuffisant ! Compte N°" + code);
    }


    public void debiter(double somme, Compte dest) {
        if (somme <= solde) {
            this.solde -= somme;
            dest.crediter(somme);
        } else {
            System.out.println("⚠ Solde insuffisant ! Compte N°" + code);
        }
    }

    
    public void afficherCompte() {
        System.out.println("┌── Compte N°" + code + " ──");
        proprietaire.afficher();
        System.out.printf("  → Solde : %.2f DH%n", solde);
    }


    public static void afficherNombreDeComptes() {
        System.out.println("Nombre total de comptes : " + compteur);
    }
}