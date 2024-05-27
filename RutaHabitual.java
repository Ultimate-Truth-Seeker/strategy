public class RutaHabitual implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Procesando estrategia... calculando tipo de ruta... buscando rutas usuales");
        return "Ruta habitual entre " + puntoA + "y" + puntoB;
    }
}
