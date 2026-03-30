public class Rectangle {

    
    private double longueur;
    private double largeur;

    public double getLongueur() { return longueur; }
    public void setLongueur(double longueur) {
        if (longueur > 0) this.longueur = longueur;
    }
    public double getLargeur() { return largeur; }
    public void setLargeur(double largeur) {
        if (largeur > 0) this.largeur = largeur;
    }

    
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    
    public double perimetre() {
        return 2 * (longueur + largeur);
    }
    public double aire() {
        return longueur * largeur;
    }


    public boolean estCarre() {
        return longueur == largeur;
    }

    public void afficherRectangle() {
        String msg = estCarre() ? "Il s'agit d'un carré"
                                : "Il ne s'agit pas d'un carré";
        System.out.println("Longueur : [" + longueur + "] - Largeur : [" + largeur +
                           "] - Périmètre : [" + perimetre() + "] - Aire : [" + aire() +
                           "] - " + msg);
    }
}