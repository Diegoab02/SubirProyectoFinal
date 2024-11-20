package tdas;
import main.Observador;        

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa el patrón de diseño Observador, permitiendo que los observadores sean notificados
 * cuando se actualicen las materias en el portal web. Los observadores pueden ser estudiantes u otros
 * objetos interesados en recibir actualizaciones sobre las materias.
 */
public class PortalWeb {
    /**
     * Lista de observadores que están suscritos para recibir notificaciones de actualizaciones.
     */
    private List<Observador> observadores = new ArrayList<>();

    /**
     * Agrega un observador a la lista de observadores. 
     * Este método permite que un objeto observador se suscriba para recibir notificaciones.
     * 
     * @param observador El objeto observador que se desea agregar a la lista.
     */
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    /**
     * Elimina un observador de la lista de observadores.
     * Este método permite que un objeto observador se desinscriba y deje de recibir notificaciones.
     * 
     * @param observador El objeto observador que se desea eliminar de la lista.
     */
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    /**
     * Notifica a todos los observadores sobre un cambio o actualización.
     * Este método recorre la lista de observadores y llama al método {@code actualizar} de cada uno
     * para informarles sobre la actualización.
     * 
     * @param mensaje El mensaje que contiene la información de la actualización.
     */
    public void notificarObservadores(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
     /**
     * Simula una actualización de las materias y notifica a todos los observadores registrados.
     * Este método puede ser invocado para simular la actualización de las materias en el portal web.
     */
    public void actualizarMaterias() {
        // Simular actualización
        notificarObservadores("La lista de materias ha sido actualizada.");
    }
}
