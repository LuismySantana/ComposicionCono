package ComposicionCono;


public class Circulo {
    private float x, y;
    private float radio;


    /**
     * Constructor de círculo con todos sus parámetros
     * @param cX abcisas del centro del Circulo
     * @param cY ordenadas del centro del Circulo
     * @param r radio del Círculo
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Devuelve las abcisas del centro
     * @return Float de las abcisas
     */
    public float getX() { return x; }

    /**
     * Asigna las abcisas al centro del Circulo
     * @param x Float de las abcisas
     */
    public void setX(float x) { this.x = x; }

    /**
     * Devuelve las ordenadas del centro
     * @return Float de las ordenadas
     */
    public float getY() { return y; }

    /**
     * Asigna las ordenadas al centro del Circulo
     * @param y Float de las ordenadas
     */
    public void setY(float y) { this.y = y; }

    /**
     * Devuelve el radio del Circulo
     * @return Float del radio
     */
    public float getRadio() { return radio; }

    /**
     * Asigna el radio al Circulo
     * @param radio Float del radio
     */
    public void setRadio(float radio) { this.radio = radio; }

    /**
     * Calcula el area del Circulo
     * @return Float del area del Circulo
     */
    public float area() { return (float)Math.PI*radio*radio; }

    /**
     * Imprime los valores del Circulo: coordenadas del centro (x, y), radio y area
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
