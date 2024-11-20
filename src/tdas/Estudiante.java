package tdas;
import main.Observador;

/**
 * Implementación concreta de un observador en el patrón de diseño Observador.
 * Esta clase representa a un estudiante que recibe notificaciones cuando el objeto observado cambia.
 */
public class Estudiante implements Observador {
     /**
     * Nombre del estudiante que recibirá las notificaciones.
     */
    private String nombre;

    /**
     * Constructor para crear un objeto {@code Estudiante} con el nombre proporcionado.
     * 
     * @param nombre El nombre del estudiante que recibirá las notificaciones.
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que recibe y muestra una notificación cuando el objeto observado cambia.
     * Este método implementa la interfaz {@link Observador} y es llamado cuando el objeto observado
     * emite un cambio o actualización.
     * 
     * @param mensaje El mensaje que contiene la información sobre el cambio o actualización.
     */
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió la notificación: " + mensaje);
    }
}
