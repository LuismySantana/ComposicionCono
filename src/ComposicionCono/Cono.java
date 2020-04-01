package ComposicionCono;

/**
 * Clase que genera un cono
 * @author Luis Miguel Bolaños Santana
 * @version 1.0
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;


    /**
     * Constructor de Cono con todos sus parámetros
     * @param cX abcisas del centro de la base (para Circulo)
     * @param cY ordenadas del centro de la base (para Circulo)
     * @param r radio de la base (para Circulo)
     * @param h altura del cono
     * @param color color del cono
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Devuelve la base del cono
     * @return devuelve el Circulo que forma la base
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Asigna una base al cono
     * @param base Circulo que sera la base del cono
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Devuelve la altura del cono
     * @return Float que es la altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Asigna una altura al cono
     * @param altura Float que sera la altura del cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Devuelve el color del cono
     * @return String que representa el color del cono
     */
    public String getColor() {
        return color;
    }

    /**
     * Asigna un color al cono
     * @param color String que representa un color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Imprime los valores de la base asi como la altura y color del cono
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
