/**
 * Clase que representa el entrenador de un equipo
 */

public class Entrenador {
    private static int contadorEntre= 0; /**Contador de entrenadores creados */
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
        contadorEntre++;
    }

    /**Getter y setter para obtener informacion de entrenador. */

    /** @return El nombre del entrenador */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre=nombre;}

    /** @return La formacion preferida del jugador */
    public String getFormacionPref() {return formacionPref;}
    public void setFormacionPreferida(String fromacionPref) {this.formacionPref=formacionPref;}

    /**Metodo toString() para ver el entrenador y formacion. */
    @Override
        public String toString() {
            return "ENTRENADOR: " + nombre + " FORMACION: " + formacionPref;
        }

        /**@return Metodo static que devuelve la cantidad total de entrenadores. */
        public static int getContadorEntre() {
            return contadorEntre;
        }
}
