import java.time.LocalDate;
/** Esta clase representa un jugador de la Liga
 * Contiene información del jugador, posición y estado de traspaso
 */

public class Jugador { /**Atributos de la clase Jugador */
    public static int contadorJug=0; /**Contador de jugadores creados */
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
            contadorJug++;
        }

        /** Metodo que activa la solicitud de traspaso de un jugador y muestra un mensaje informando sobre ello. */
        public void solicitaTraspaso() {
            this.traspasoSolicitado= true;
            System.out.println("El jugador " + this.nombre+  "ha solicitado un traspaso.");
        }

        /** Metodo que cancela la solicitud de traspaso del jugador */
        public void cancelaTraspaso() {
            this.traspasoSolicitado= false;
            System.out.println("El jugador " + this.nombre + "ha cancelado su traspaso.");
        }

        /**getters y setter de la clase Jugador para obtener su informacion. */

        /**@return El nombre del jugador */
        public String getNombre() {return nombre;}
        public void setNombre(String nombre) {this.nombre= nombre;}

        /**@return La fecha de nacimiento del jugador */
        public LocalDate getFechaNacimiento() {return fechaNacimiento;}
        public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento= fechaNacimiento;}

        /**@return La posicion del jugador */
        public String getPosicion() {return posicion;}
        public void setPosicion(String posicion) {this.posicion= posicion;}

        /** @return Metodo el cual obtiene true si el Jugador ha solicitado un traspaso, si no se obtiene false */
        public boolean traspasoSolicitado() {return traspasoSolicitado;}
        public void setTraspasoSolicitado (boolean traspasoSolicitado) {this.traspasoSolicitado=traspasoSolicitado;}

        /**Metodo toString() */
        @Override
        public String toString() {
            return "JUGADOR: " + nombre + " FECHA DE NACIMIENTO: " + fechaNacimiento + " POSICION: " + posicion + " TRASPASO: " + (traspasoSolicitado ? "si" : "no");
        }

        /**@return Metodo static para obtener la cantidad de jugadores instanciados. */
        public static int getContadorJug() {
            return contadorJug;
        }
}
