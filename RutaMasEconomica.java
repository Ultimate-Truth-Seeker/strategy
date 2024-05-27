public class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Procesando estrategia... calculando tipo de ruta... buscando ruta de menor precio");
        return "Ruta más económica entre " + puntoA + "y" + puntoB;
    }
}
