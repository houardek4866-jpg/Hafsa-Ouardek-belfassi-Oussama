public class Article {

    // Partie 1 : attributs
    private int    reference;
    private String designation;
    private double prixHT;
    private static double tauxTVA = 20;  


    public int    getReference()               { return reference; }
    public void   setReference(int r)          { this.reference = r; }

    public String getDesignation()             { return designation; }
    public void   setDesignation(String d)     { this.designation = d; }

    public double getPrixHT()                  { return prixHT; }
    public void   setPrixHT(double p)          { this.prixHT = p; }

    public static double getTauxTVA()          { return tauxTVA; }
    public static void   setTauxTVA(double t)  { tauxTVA = t; }

    
    public Article() { }

    
    public Article(int ref, String des, double prixHT) {
        this.reference   = ref;
        this.designation = des;
        this.prixHT      = prixHT;
    }

    public Article(int ref, String des) {
        this.reference   = ref;
        this.designation = des;
    }

    
    public Article(Article a) {
        this.reference   = a.reference;
        this.designation = a.designation;
        this.prixHT      = a.prixHT;
    }

    
    public double calculerPrixTTC() {
        return prixHT + (prixHT * tauxTVA / 100);
    }

    
    public void afficherArticle() {
        System.out.printf(
            "Réf: %d | %-15s | PrixHT: %6.2f | TVA: %.0f%% | TTC: %6.2f%n",
            reference, designation, prixHT, tauxTVA, calculerPrixTTC()
        );
    }
}