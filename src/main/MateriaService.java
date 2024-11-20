package main;
/**
 * Interfaz que define los servicios relacionados con las materias.
 * Implementada por clases que proporcionan el comportamiento para mostrar las materias disponibles.
 */
public interface MateriaService {
    /**
     * Método que muestra las materias disponibles.
     * Las clases que implementen esta interfaz deberán proporcionar una implementación
     * concreta para mostrar las materias.
     */
    void mostrarMaterias();
}
