public class Complexe {


    private double partieReelle;
    private double partieImaginaire;

    
    public double getPartieReelle() { return partieReelle; }
    public void setPartieReelle(double r) { this.partieReelle = r; }

    public double getPartieImaginaire() { return partieImaginaire; }
    public void setPartieImaginaire(double i) { this.partieImaginaire = i; }

    
    public Complexe() {
        this.partieReelle     = 0;
        this.partieImaginaire = 0;
    }


    public Complexe(double r, double i) {
        this.partieReelle     = r;
        this.partieImaginaire = i;
    }

    
    public Complexe plus(Complexe c) {
        return new Complexe(
            this.partieReelle     + c.partieReelle,
            this.partieImaginaire + c.partieImaginaire
        );
    }


    public Complexe moins(Complexe c) {
        return new Complexe(
            this.partieReelle     - c.partieReelle,
            this.partieImaginaire - c.partieImaginaire
        );
    }

    
    public void afficher() {
        String signe = (partieImaginaire >= 0) ? "+" : "";
        System.out.println(partieReelle + signe + partieImaginaire + "*i");
    }
}