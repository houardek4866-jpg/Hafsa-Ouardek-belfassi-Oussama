public class Main5{
    public static void main(String[] args) {

        Client c1 = new Client("AB123", "Ouardek",  "Youssef", "0612345678");
        Client c2 = new Client("CD456", "Ouardek", "Hafsa");  

        Compte cp1 = new Compte(c1, 5000);
        Compte cp2 = new Compte(c2, 2000);

        System.out.println("=== État initial ===");
        cp1.afficherCompte();
        cp2.afficherCompte();
        Compte.afficherNombreDeComptes();

        System.out.println("\n=== Virement 1500 DH : cp1 → cp2 ===");
        cp1.debiter(1500, cp2);
        cp1.afficherCompte();
        cp2.afficherCompte();

        System.out.println("\n=== Tentative débit 10000 DH sur cp1 ===");
        cp1.debiter(10000);
    }
}