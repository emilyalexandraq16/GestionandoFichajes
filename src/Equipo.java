import java.util.ArrayList;
/**
 * Clase que gestiona un equipo de la Liga, su entrenador y la lista de jugadores.
 */

public class Equipo {
    private static int contadorEq= 0; /**Contador de equipos creados */
    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores; /**Lista de jugadores */
    

    /**
     * Constructor de Equipo, inicializa la lista de jugadores vacía.
     * @param nombre Nombre del equipo.
     */
    public Equipo (String nombre) {
        this.nombre= nombre;
        this.entrenador= null;
        this.jugadores= new ArrayList<Jugador>();
        contadorEq++;
    }

    /** @param j Metodo en el que el jugador j se agrega a la plantilla */
    public void añadirJugador(Jugador j) {
        this.jugadores.add(j);
    }

    /** @param entrenador Setter para indicar el nuevo entrenador que se asigna al equipo */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador= entrenador;
    }

    /**@return Getter y setter en el que se obtiene y añade el nombre del equipo */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre= nombre;}

    /**Metodo toString para mostrar el entrenador y el numero de jugadores del Equipo. */
    @Override
        public String toString() {
            String nombreEntrenador= (entrenador!= null)? entrenador.getNombre() : "Sin entrenador";
            return "EQUIPO: " + nombre + " ENTRENADOR: " + nombreEntrenador + " Nº JUGADORES: " + jugadores.size();
    }

    /**Metodo que imprime la informacion completa de la pantalla del equipo .*/
    public void verPlantilla() {
        System.out.println("Plantilla del " + this.nombre);
        for(int i= 0; i<jugadores.size(); i++) {
            Jugador j = jugadores.get(i);
            System.out.println(j.toString());
        }
    }

    /**
     * Metodo que gestiona el traspaso de un jugador de este equipo a otro.
     * @param jug Jugador a transferir
     * @param destino Equipo que recibe al jugador transferido
     */
    public void transferirJugador(Jugador jug, Equipo destino) {
        if (this.jugadores.contains(jug) && jug.traspasoSolicitado()) {
            this.jugadores.remove(jug);
            destino.añadirJugador(jug);
            jug.cancelaTraspaso();

            System.out.println("Traspaso realizado: El jugador " + jug.getNombre() + " ahora juega en " + destino.getNombre());
        } else {
            System.out.println("Traspaso no realizado: El jugador no pertenece al equipo o no ha solicitado el traspaso.");
        }
    }

    /**@return Metodo static que indica la cantidad total de equipos. */
    public static int getContadorEq() {
        return contadorEq;
    }
}
