package tdas;
import main.MateriaService;

/**
 * Implementación del patrón de diseño Proxy para controlar el acceso al servicio de materias.
 * Esta clase actúa como un intermediario entre el cliente y la clase {@link MateriaServiceReal}.
 * El proxy controla el acceso a las materias y puede agregar funcionalidades adicionales como
 * la autorización o la gestión de recursos.
 */
public class MateriaProxy implements MateriaService {
    /**
     * Instancia de la clase {@link MateriaServiceReal}, que es creada solo cuando se requiere.
     * El proxy maneja la creación de la instancia para controlar su acceso.
     */
    private MateriaServiceReal materiaService;
    
    
    /**
     * Muestra las materias disponibles, pero antes realiza una acción adicional.
     * En este caso, se imprime un mensaje indicando que el acceso se ha registrado a través del proxy,
     * y luego delega la tarea de mostrar las materias a la instancia real {@link MateriaServiceReal}.
     */
    @Override
    public void mostrarMaterias() {
        
        // Verifica si la instancia real aún no ha sido creada, y si no es así, la crea
        if (materiaService == null) {
            materiaService = new MateriaServiceReal();
        }
        // Mensaje de control de acceso
        System.out.println("Acceso registrado en el proxy.");
        // Delegación de la tarea al servicio real
        materiaService.mostrarMaterias();
    }
}