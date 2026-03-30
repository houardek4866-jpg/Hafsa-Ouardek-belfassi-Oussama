public class Main4 {
    public static void main(String[] args) {

        
        Article a1 = new Article(1, "Clavier", 150.0);  
        Article a2 = new Article(2, "Souris");          
        a2.setPrixHT(80.0);
        Article a3 = new Article(a1);                   
        Article a4 = new Article();                     
        a4.setReference(4);
        a4.setDesignation("Écran");
        a4.setPrixHT(500.0);

        System.out.println("=== TVA : " + Article.getTauxTVA() + "% ===");
        a1.afficherArticle();
        a2.afficherArticle();
        a3.afficherArticle();
        a4.afficherArticle();

        
        System.out.println("\n=== Changement TVA → 14% ===");
        Article.setTauxTVA(14);
        a1.afficherArticle();
        a2.afficherArticle();
        a3.afficherArticle();
        a4.afficherArticle();
    }
}