/**
 * Clase que representa el entrenador de un equipo
 */

public class Entrenador {
    private String nombre;
    private String formacionPref;

    /**
     * Contructor de Entrenador
     * @param nombre Nombre completo del entrenador.
     * @param formacionPref Sistema táctico
     */

    public Entrenador(String nombre, String formacionPref) {
        this.nombre=nombre;
        this.formacionPref= formacionPref;
    }

    /** @return El nombre del entrenador */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    /** @return La formacion preferida del jugador */
    public String getFormacionPref() {return formacionPref;}
    public void setFormacionPreferida(String fromacionPref) {this.formacionPref=formacionPref;}

    @Override
        public String toString() {
            return "ENTRENADOR: " + nombre + "FORMACION: " + formacionPref;
        }
}
