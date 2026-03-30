public class Main3 {
    public static void main(String[] args) {

        Employe e = new Employe();  // saisie au clavier

        System.out.println("\n=== Informations employé ===");
        e.afficherEmploye();

        e.augmentationDuSalaire();

        System.out.println("\n=== Après augmentation ===");
        e.afficherEmploye();
    }
}