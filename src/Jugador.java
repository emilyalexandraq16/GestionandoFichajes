import java.time.LocalDate;
/** Esta clase representa un jugador de la Liga
 * Contiene información del jugador, posición y estado de traspaso
 */

public class Jugador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String posicion;
    private boolean  traspasoSolicitado;
    
        /**
         * Constructor de Jugador
         * @param nombre Nombre en la camiseta del jugador.
         * @param fechaNacimiento Fecha de nacimiento.
         * @param posicion Posicion del jugador en el campo.
         */

        public Jugador (String nombre, LocalDate fechaNacimiento, String posicion) {
            this.nombre= nombre;
            this.fechaNacimiento= fechaNacimiento;
            this.posicion=posicion;
            this.traspasoSolicitado=false;
        }

        @Override
        public String toString() {
            return "JUGADOR: " + nombre + "FECHA DE NACIMIENTO: ";
        }
}
