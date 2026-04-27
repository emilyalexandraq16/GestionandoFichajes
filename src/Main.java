import java.time.LocalDate;
/**
 * Clase principal que inicia la aplicacion de gestion de Liga 
 * Instancia objetos iniciales y hace pruebas
 */

public class Main {
    /**
     * Entrada principal del programa
     * @param args Argumentos de la linea de comandos
     */

    public static void main (String [] args) {

        /**Se instancian 2 entrenadores */
        Entrenador e1= new Entrenador("Carlo Ancelotti", "4-3-3");
        Entrenador e2= new Entrenador("Xavi Hernandez", "4-3-3");

        /**Se instancian 2 equipos */
        Equipo eq1= new Equipo("Real Madrid");
        Equipo eq2= new Equipo("FC Barcelona");

        /**Se instancian 5 jugadores */
        Jugador j1= new Jugador("Luka Modric", LocalDate.of(1985, 9, 9), "Centrocampista");
        Jugador j2= new Jugador("Vinicius Jr", LocalDate.of(2000, 7, 12), "Delantero");
        Jugador j3= new Jugador("Thibaut Courtois", LocalDate.of(1992, 5, 11), "Portero");
        Jugador j4= new Jugador("Robert Lewandowski", LocalDate.of(1988, 8, 21), "Delantero");
        Jugador j5= new Jugador("Pedri", LocalDate.of(2002,11, 25), "Centrocampista");

        /**Se imprime la informacion del entrenador 1, equipo 1, y jugadores 2 y 4. */
        System.out.println(e1.toString());
        System.out.println(eq1.toString());
        System.out.println(j2.toString());
        System.out.println(j4.toString());

        /**Se añade el entrenador 1 al equipo 1, y se añaden los jugadores 1, 2 y 3. */
        eq1.setEntrenador(e1);
        eq1.añadirJugador(j1);
        eq1.añadirJugador(j2);
        eq1.añadirJugador(j3);

        /**Se añade el entrenador 2 al equipo 2, y se añaden los jugadores 4 y 5. */
        eq2.setEntrenador(e2);
        eq2.añadirJugador(j4);
        eq2.añadirJugador(j5);

        /**Se imprime mensaje indicando que la plantilla se ha configurado. */
        System.out.println("Plantilla del " + eq1.getNombre() + " configurada.");

        /**El jugador 1 solicita traspaso y se imprime el estado de su traspaso. */
        j1.solicitaTraspaso();
        System.out.println("Estado actual: " + j1.traspasoSolicitado());

        /**El jugador 1 cancela su solicitud de traspaso y se imprime el estado de su traspaso. */
        j1.cancelaTraspaso();
        System.out.println("Estado actual: " + j1.traspasoSolicitado());

        /**Se imprime la informacion del equipo 1. */
        System.out.println(eq1.toString());

        /**El equipo 1 transfiere al jugador 1 al equipo 2. */
        eq1.transferirJugador(j1, eq2);

        /**Se activa la solicitud de traspaso del jugador 1. Se traspasa jugador 1 a equipo 2. */
        j1.solicitaTraspaso();
        eq1.transferirJugador(j1, eq2);

        /**Se imprime la plantilla del equipo 1 y 2. */
        eq1.verPlantilla();
        eq2.verPlantilla();

        /**Imprime el total de jugadores, entrenadores y equipos creados. */
        System.out.println("Total de jugadores creados: " + Jugador.getContadorJug());
        System.out.println("Total de entrenadores creados: " + Entrenador.getContadorEntre());
        System.out.println("Total de equipos creados: " + Equipo.getContadorEq());


    }
}
