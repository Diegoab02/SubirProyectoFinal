 package tdas;
 import main.MateriaService;
   
/**
 * Implementación concreta de la interfaz {@link MateriaService}.
 * Esta clase proporciona la funcionalidad real para mostrar las materias disponibles.
 */
public class MateriaServiceReal implements MateriaService {
    /**
     * Muestra la lista de materias disponibles.
     * Este método implementa la lógica específica para mostrar las materias.
     * En esta implementación, simplemente se imprime un mensaje indicando que
     * las materias están disponibles.
     */
    @Override
    public void mostrarMaterias() {
        System.out.println("Mostrando lista de materias disponibles.");
    }
}