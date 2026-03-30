public class Main {
    public static void main(String[] args) {

        Complexe z0 = new Complexe();        // 0+0*i
        Complexe z1 = new Complexe(3, 2);   // 3+2*i
        Complexe z2 = new Complexe(1, -4);  // 1-4*i

        System.out.print("z0 = "); z0.afficher();
        System.out.print("z1 = "); z1.afficher();
        System.out.print("z2 = "); z2.afficher();

        System.out.print("z1 + z2 = "); z1.plus(z2).afficher();
        System.out.print("z1 - z2 = "); z1.moins(z2).afficher();
    }
}
