/**
 * Clase que gestiona un equipo de la Liga, su entrenador y la lista de jugadores.
 */

public class Equipo {
    private String nombre;
    

    /**
     * Constructor de Equipo
     * @param nombre Nombre del equipo.
     */

    public Equipo (String nombre) {
        this.nombre= nombre;
    }

    @Override
        public String toString() {
            return "ENTRENADOR: " + nombre ;
        }
}
