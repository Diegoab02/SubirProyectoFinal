package tdas;
import main.Portal;

/**
 * Clase abstracta que implementa el patrón de diseño Decorador.
 * Esta clase actúa como base para decoradores que añaden funcionalidades adicionales al portal.
 * Los decoradores extienden esta clase para modificar o extender el comportamiento de {@link Portal}.
 */
public abstract class PortalDecorador implements Portal {
    /**
     * El portal que está siendo decorado.
     * Esta variable mantiene una referencia al portal original que puede ser decorado.
     */
    protected Portal portal;

    /**
     * Constructor para crear un decorador de portal con un portal base.
     * 
     * @param portal El portal que será decorado por el decorador.
     */
    public PortalDecorador(Portal portal) {
        this.portal = portal;
    }

     /**
     * Muestra el portal original.
     * Este método delega la acción de mostrar el portal al portal base que está siendo decorado.
     */
    @Override
    public void mostrarPortal() {
        portal.mostrarPortal();
    }
}
