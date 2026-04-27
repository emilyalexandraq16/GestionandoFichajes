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

        Entrenador e1= new Entrenador("Carlo Ancelotti", "4-3-3");
        Entrenador e2= new Entrenador("Xavi Hernandez", "4-3-3");

        Equipo eq1= new Equipo("Real Madrid");
        Equipo eq2= new Equipo("FC Barcelona");

        Jugador j1= new Jugador("Luka Modric", LocalDate.of(1985, 9, 9), "Centrocampista");
        Jugador j2= new Jugador("Vinicius Jr", LocalDate.of(2000, 7, 12), "Delantero");
        Jugador j3= new Jugador("Thibaut Courtois", LocalDate.of(1992, 5, 11), "Portero");
        Jugador j4= new Jugador("Robert Lewandowski", LocalDate.of(1988, 8, 21), "Delantero");
        Jugador j5= new Jugador("Pedri", LocalDate.of(2002,11, 25), "Centrocampista");

        System.out.println(e1.toString());
        System.out.println(eq1.toString());
        System.out.println(j2.toString());
        System.out.println(j4.toString());

        eq1.setEntrenador(e1);
        eq1.añadirJugador(j1);
        eq1.añadirJugador(j2);
        eq1.añadirJugador(j3);

        eq2.setEntrenador(e2);
        eq2.añadirJugador(j4);
        eq2.añadirJugador(j5);

    }
}
