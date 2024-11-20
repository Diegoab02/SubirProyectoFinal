package main;

/**
 * Interfaz que define el comportamiento de los objetos observadores en el patrón de diseño Observador.
 * Los objetos que implementan esta interfaz pueden recibir actualizaciones cuando el objeto observado cambie.
 */
public interface Observador {
    /**
     * Método que es llamado para actualizar el estado del observador cuando el objeto observado cambia.
     * 
     * @param mensaje El mensaje que contiene la información sobre el cambio o actualización.
     *                Los observadores pueden usar este mensaje para actualizar su estado o realizar acciones específicas.
     */
    void actualizar(String mensaje);
}
