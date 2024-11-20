package tdas;
import main.Portal;

/**
 * Implementación concreta de la interfaz {@link Portal}.
 * Esta clase representa un portal básico sin decoraciones adicionales.
 */
public class PortalBasico implements Portal {
    /**
     * Muestra el portal básico.
     * Este método proporciona una implementación sencilla para mostrar el contenido básico del portal,
     * sin decoraciones adicionales.
     */
    @Override
    public void mostrarPortal() {
        System.out.println("Mostrando portal básico.");
    }
}
