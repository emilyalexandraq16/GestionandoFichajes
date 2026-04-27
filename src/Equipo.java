import java.util.ArrayList;
/**
 * Clase que gestiona un equipo de la Liga, su entrenador y la lista de jugadores.
 */

public class Equipo {
    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;
    

    /**
     * Constructor de Equipo
     * @param nombre Nombre del equipo.
     */

    public Equipo (String nombre) {
        this.nombre= nombre;
        this.entrenador= null;
        this.jugadores= new ArrayList<Jugador>();
    }

    /** @param j El jugador que se agrega a la plantilla */

    public void añadirJugador(Jugador j) {
        this.jugadores.add(j);
    }

    /** @param entrenador El nuevo entrenador que se asigna al equipo */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador= entrenador;
    }

    @Override
        public String toString() {
            return "ENTRENADOR: " + nombre ;
        }
}
