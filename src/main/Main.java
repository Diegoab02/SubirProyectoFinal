package main;
import tdas.*;

/**
 * Clase principal que ejecuta y prueba los patrones de diseño aplicados.
 * Los patrones de diseño que se implementan en esta clase son:
 * - Singleton
 * - Proxy
 * - Observador
 * - Decorador
 * - Plantilla de Método
 */
public class Main {

    /**
     * Método principal donde se ejecutan los patrones de diseño.
     * Este método ejecuta los patrones de diseño Singleton, Proxy, Observador, Decorador y Plantilla de Método
     * demostrando su funcionamiento a través de ejemplos prácticos.
     * 
     * @param args Argumentos de línea de comandos. Este parámetro no se utiliza en este método.
     */
    public static void main(String[] args) {
        // --- Patrón Singleton ---
        System.out.println("== Patron Singleton ==");
        
        // Obtenemos las instancias de la clase BaseDeDatosUniversitaria usando el patrón Singleton
        BaseDeDatosUniversitaria baseDeDatos1 = BaseDeDatosUniversitaria.getInstancia();
        BaseDeDatosUniversitaria baseDeDatos2 = BaseDeDatosUniversitaria.getInstancia();
        
        // Verificamos si ambas instancias son la misma (deberían serlo por el patrón Singleton)
        System.out.println("Instancia 1: " + baseDeDatos1.getConexion());
        System.out.println("Instancia 2: " + baseDeDatos2.getConexion());
        System.out.println("¿Son la misma instancia? " + (baseDeDatos1 == baseDeDatos2));
        System.out.println();

        
        // --- Patrón Proxy ---
        System.out.println("== Patron Proxy ==");
        
        // Creamos un proxy para acceder a las materias
        MateriaService materiaServiceProxy = new MateriaProxy();
        
        // Llamamos al método mostrarMaterias a través del proxy
        materiaServiceProxy.mostrarMaterias();  // El proxy controla el acceso a las materias
        System.out.println();

        
        // --- Patrón Observador ---
        System.out.println("== Patron Observador ==");
        
        // Creamos dos estudiantes que se suscribirán a las actualizaciones del PortalWeb
        Estudiante estudiante1 = new Estudiante("Juan Pérez");
        Estudiante estudiante2 = new Estudiante("Ana Gómez");
        
        // Creamos un objeto PortalWeb que notificará a los observadores cuando se actualicen las materias
        PortalWeb portalWeb = new PortalWeb();
        
        // Los estudiantes se suscriben a las actualizaciones del portal
        portalWeb.agregarObservador(estudiante1);
        portalWeb.agregarObservador(estudiante2);
        
        // Simulamos una actualización de materias
        portalWeb.actualizarMaterias();
        System.out.println();
        
        
        // --- Patrón Decorador ---
        System.out.println("== Patron Decorador ==");
        
        // Creamos un portal básico sin decoraciones
        Portal portalBasico = new PortalBasico();
        portalBasico.mostrarPortal();  // Muestra el portal básico sin decoraciones
        
        // Ahora, decoramos el portal con notificaciones
        Portal portalConNotificaciones = new PortalConNotificaciones(portalBasico);
        portalConNotificaciones.mostrarPortal();  // Muestra el portal con la decoración de notificaciones
        System.out.println();


        // --- Patrón Plantilla de Método ---
        System.out.println("== Patron Plantilla de Metodo ==");
        
        // Creamos una inscripción que sigue el patrón de plantilla para inscribirse en el portal
        InscripcionTemplate inscripcion = new InscripcionPortalWeb();
        
        // Ejecutamos el método que sigue los pasos predefinidos para la inscripción
        inscripcion.realizarInscripcion();  // Los pasos de inscripción se ejecutan de forma predeterminada
        System.out.println();
    }
}
