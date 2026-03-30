public class Client {


    private String cin;
    private String nom;
    private String prenom;
    private String tel;

    // Partie 2 : getters et setters
    public String getCin()    { return cin;    }
    public String getNom()    { return nom;    }
    public String getPrenom() { return prenom; }
    public String getTel()    { return tel;    }

    public void setCin(String c)    { this.cin    = c; }
    public void setNom(String n)    { this.nom    = n; }
    public void setPrenom(String p) { this.prenom = p; }
    public void setTel(String t)    { this.tel    = t; }
    public Client(String cin, String nom, String prenom, String tel) {
        this.cin    = cin;
        this.nom    = nom;
        this.prenom = prenom;
        this.tel    = tel;
    }

    
    public Client(String cin, String nom, String prenom) {
        this(cin, nom, prenom, "Non renseigné");
    }

    
    public void afficher() {
        System.out.println(
            "  → Client : " + cin +
            " | " + nom + " " + prenom +
            " | Tél : " + tel
        );
    }
}