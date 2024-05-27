public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Procesando estrategia... calculando tipo de ruta... buscando rutas de menor distancia");
        return "Ruta más corta entre " + puntoA + "y" + puntoB;
    }
}
