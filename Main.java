public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaHabitual());
        gps.calcularRuta("Punto A", "Punto B");
    }
    
}
