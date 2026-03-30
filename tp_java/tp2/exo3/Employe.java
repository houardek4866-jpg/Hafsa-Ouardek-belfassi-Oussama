import java.util.Calendar;
import java.util.Scanner;

public class Employe {

    private int        matricule;
    private String     nom;
    private String     prenom;
    private DateFormat dateNaissance;
    private DateFormat dateEmbauche;
    private double     salaire;

    
    public int        getMatricule()                  { return matricule; }
    public void       setMatricule(int m)             { this.matricule = m; }

    public String     getNom()                        { return nom; }
    public void       setNom(String n)                { this.nom = n; }

    public String     getPrenom()                     { return prenom; }
    public void       setPrenom(String p)             { this.prenom = p; }

    public DateFormat getDateNaissance()              { return dateNaissance; }
    public void       setDateNaissance(DateFormat d)  { this.dateNaissance = d; }

    public DateFormat getDateEmbauche()               { return dateEmbauche; }
    public void       setDateEmbauche(DateFormat d)   { this.dateEmbauche = d; }

    public double     getSalaire()                    { return salaire; }
    public void       setSalaire(double s)            { this.salaire = s; }

    
    public Employe() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matricule              : ");
        matricule = sc.nextInt();

        System.out.print("Nom                   : ");
        nom = sc.next();

        System.out.print("Prénom                 : ");
        prenom = sc.next();

        System.out.print("Date naissance (j m a) : ");
        dateNaissance = new DateFormat(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Date embauche  (j m a) : ");
        dateEmbauche = new DateFormat(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Salaire                : ");
        salaire = sc.nextDouble();
    }

    public int age() {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        int moisActuel    = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int jourActuel    = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        int age = anneeActuelle - dateNaissance.getAnnee();

        if (moisActuel < dateNaissance.getMois() ||
           (moisActuel == dateNaissance.getMois() &&
            jourActuel  < dateNaissance.getJour())) {
            age--;
        }
        return age;
    }

    
    public int anciennete() {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        return anneeActuelle - dateEmbauche.getAnnee();
    }

    
    public void augmentationDuSalaire() {
        int anc = anciennete();
        if      (anc < 5)  salaire *= 1.02;  // +2%
        else if (anc < 10) salaire *= 1.05;  // +5%
        else               salaire *= 1.10;  // +10%
    }

    
    public void afficherEmploye() {
        System.out.println("- Matricule  : " + matricule);
        System.out.println("- Nom complet: " + nom.toUpperCase() + " " + prenom);
        System.out.println("- Age        : " + age()        + " ans");
        System.out.println("- Ancienneté : " + anciennete() + " ans");
        System.out.printf ("- Salaire    : %.2f DH%n", salaire);
    }
}
