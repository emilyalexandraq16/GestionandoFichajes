import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;
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

    /**@return El nombre del equipo */
    public String getNombre() {return nombre;}
    public void seNombre(String nombre) {this.nombre= nombre;}

    @Override
        public String toString() {
            String nombreEntrenador= (entrenador!= null)? entrenador.getNombre() : "Sin entrenador";
            return "EQUIPO: " + nombre + "ENTRENADOR: " + nombreEntrenador + "Nº JUGADORES " + jugadores.size();
    }

    /**Imprime la informacion completa de la pantalla del equipo .*/
    public void verPlantilla() {
        System.out.println("Plantilla del " + this.nombre);
        for(int i= 0; i<jugadores.size(); i++) {
            Jugador j = jugadores.get(i);
            System.out.println(j.toString());
        }
    }

    /**
     * Gestiona el traspaso de un jugador de este equipo a otro
     * @param jug Jugador a transferir
     * @param destino Equipo que recibe al jugador transferido
     */

    public void transferirJugador(Jugador jug, Equipo destino) {
        if (this.jugadores.contains(jug) && jug.traspasoSolicitado()) {
            this.jugadores.remove(jug);
            destino.añadirJugador(jug);
            jug.cancelaTraspaso();

            System.out.println("Traspaso realizado: El jugador " + jug.getNombre() + " ahora juega en " + destino.getNombre());
        }
    }
}
