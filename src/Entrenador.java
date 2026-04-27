/**
 * Clase que representa el entrenador de un equipo
 */

public class Entrenador {
    private String nombre;
    private String fromacionPref;

    /**
     * Contructor de Entrenador
     * @param nombre Nombre completo del entrenador.
     * @param formacionPref Sistema táctico
     */

    public Entrenador(String nombre, String formacionPref) {
        this.nombre=nombre;
        this.fromacionPref= formacionPref;
    }
}
