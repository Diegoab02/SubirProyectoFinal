package tdas;

/**
 * Implementación concreta de la clase {@link InscripcionTemplate}.
 * Esta clase define los pasos específicos del proceso de inscripción en un portal web.
 * Los pasos incluyen la autenticación del usuario, la selección de materias y la confirmación de inscripción.
 */
public class InscripcionPortalWeb extends InscripcionTemplate {
    /**
     * Autentica al usuario en el portal web.
     * Este método implementa el paso de autenticación del usuario en el proceso de inscripción.
     */
    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando usuario desde PortalWeb.");
    }
    /**
     * Permite seleccionar las materias en el portal web.
     * Este método implementa el paso de selección de materias en el proceso de inscripción.
     */
    @Override
    protected void seleccionarMaterias() {
        System.out.println("Seleccionando materias en el portal.");
    }
    /**
     * Confirma la inscripción del usuario en el sistema.
     * Este método implementa el paso de confirmación de inscripción en el proceso de inscripción.
     */
    @Override
    protected void confirmarInscripcion() {
        System.out.println("Confirmando inscripción en el sistema.");
    }
}
