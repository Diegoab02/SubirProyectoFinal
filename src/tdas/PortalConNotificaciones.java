package tdas;
import main.Portal;

/**
 * Implementación concreta del patrón de diseño Decorador.
 * Este decorador añade la funcionalidad de mostrar notificaciones al portal base.
 * La clase extiende {@link PortalDecorador} para modificar el comportamiento de {@link Portal}.
 */
public class PortalConNotificaciones extends PortalDecorador {
    
    /**
     * Constructor para crear un portal con notificaciones.
     * 
     * @param portal El portal base que será decorado con notificaciones.
     */
    public PortalConNotificaciones(Portal portal) {
        super(portal);
    }

     /**
     * Muestra el portal base y agrega la funcionalidad de notificaciones.
     * Este método primero llama al método {@code mostrarPortal()} del portal base
     * y luego añade la funcionalidad de mostrar notificaciones en el portal.
     */
    @Override
    public void mostrarPortal() {
        super.mostrarPortal();
        System.out.println("Mostrando notificaciones en el portal.");
    }
}