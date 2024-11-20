package tdas;

/**
 * Clase abstracta que implementa el patrón de diseño Plantilla de Método.
 * Esta clase define un algoritmo para realizar una inscripción, asegurando que el flujo del proceso
 * siga un orden específico. Los pasos individuales del proceso son definidos por las clases concretas
 * que extienden esta clase.
 */
public abstract class InscripcionTemplate {
     /**
     * Método que define la plantilla para realizar una inscripción.
     * Este método final asegura que los pasos de la inscripción se sigan en el orden correcto,
     * llamando a los métodos abstractos {@code autenticarUsuario()}, {@code seleccionarMaterias()},
     * y {@code confirmarInscripcion()} de manera secuencial.
     * 
     * Las clases concretas implementan los detalles de cada uno de estos pasos.
     */
    public final void realizarInscripcion() {
        autenticarUsuario();
        seleccionarMaterias();
        confirmarInscripcion();
    }
    /**
     * Método abstracto para autenticar al usuario.
     * Este paso se realiza en el proceso de inscripción, pero los detalles de la autenticación
     * son definidos por las clases concretas.
     */
    protected abstract void autenticarUsuario();
    /**
     * Método abstracto para seleccionar las materias a inscribir.
     * Este paso es realizado durante el proceso de inscripción, pero la selección específica de materias
     * es determinada por las clases concretas.
     */
    protected abstract void seleccionarMaterias();
    /**
     * Método abstracto para confirmar la inscripción en las materias seleccionadas.
     * Este paso finaliza el proceso de inscripción, pero la forma en que se confirma la inscripción
     * es especificada por las clases concretas.
     */
    protected abstract void confirmarInscripcion();
}
