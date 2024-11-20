package tdas;
/**
 * Implementa el patrón de diseño Singleton para gestionar la conexión a una base de datos universitaria.
 * Este patrón asegura que solo exista una instancia de la clase {@code BaseDeDatosUniversitaria} en todo el sistema.
 */
public class BaseDeDatosUniversitaria {
    /**
     * Instancia única de la clase {@code BaseDeDatosUniversitaria}.
     * Esta variable es estática para garantizar que solo se cree una instancia.
     */
    private static BaseDeDatosUniversitaria instancia;
     /**
     * Cadena que almacena la URL de la conexión a la base de datos.
     */
    private String conexion;

    /**
     * Constructor privado para evitar la creación de instancias desde fuera de la clase.
     * Se configura la conexión a la base de datos.
     */
    private BaseDeDatosUniversitaria() {
        // Configuración de conexión
        conexion = "URL_CONEXION";
    }

    /**
     * Método estático que devuelve la instancia única de la clase {@code BaseDeDatosUniversitaria}.
     * Si la instancia aún no ha sido creada, se crea una nueva.
     *
     * @return La instancia única de {@code BaseDeDatosUniversitaria}.
     */
    public static BaseDeDatosUniversitaria getInstancia() {
        if (instancia == null) {
            instancia = new BaseDeDatosUniversitaria();
        }
        return instancia;
    }

    /**
     * Obtiene la cadena de conexión de la base de datos.
     *
     * @return La URL de la conexión a la base de datos.
     */
    public String getConexion() {
        return conexion;
    }
}
