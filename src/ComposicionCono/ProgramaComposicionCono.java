package ComposicionCono;


/**
 * Clase principal de un Programa que crea diversos conos e imprime por pantalla sus valores
 * @author Luis Miguel Bolaños Santana
 * @version 1.0
 */
public class ProgramaComposicionCono {
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }


    /**
     * Metodo main que genera un cono con un radio random entre 1 y 9, con altura
     * <br>consecutiva de 1 a 5 y color azul
     * @param args argumentos por defecto del main
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}
