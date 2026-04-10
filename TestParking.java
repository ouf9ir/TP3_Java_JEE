package ma.ibnzohr.parking;

public class TestParking {

    public static void main(String[] args) {
        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("111-A-01", "Mercedes", 4);
        v[1] = new Voiture("222-B-02", "Audi", 2);
        v[2] = new Moto("333-C-03", "Kawasaki", true);
        v[3] = new Camion("444-D-04", "Scania", 18.5);

        System.out.println("=== EXÉCUTION DU PARCOURS POLYMORPHE ===");
        for (Vehicule veh : v) {
            veh.afficher();
            veh.stationner();
            System.out.println("------------------------------------");
        }

        System.out.println("\n=== AFFICHAGE DES VOITURES UNIQUEMENT ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }

        System.out.println("\n=== TEST DU DOWNCASTING (Question 5.e) ===");
        Vehicule x = new Moto("11C22", "Yamaha", true);
        
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : Impossible de transformer une Moto en Voiture.");
        }
    }
}