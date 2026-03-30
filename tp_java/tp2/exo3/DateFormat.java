public class DateFormat {

    private int jour;
    private int mois;
    private int annee;

    public DateFormat(int jour, int mois, int annee) {
        this.jour  = jour;
        this.mois  = mois;
        this.annee = annee;
    }

    public int getJour()  { return jour;  }
    public int getMois()  { return mois;  }
    public int getAnnee() { return annee; }
}