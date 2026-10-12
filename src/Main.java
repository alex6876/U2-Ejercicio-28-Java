public class Main {

    public static void main(String[] args) {

        ServicioLogin servicio = new ServicioLogin();

        MetodoAutenticacion password = new AuthPassword();
        MetodoAutenticacion biometrica = new AuthBiometrica();
        MetodoAutenticacion token = new AuthTokenOAuth();

        System.out.println("--- Login con password ---");
        servicio.iniciarSesion(password, "admin", "1234");
        servicio.iniciarSesion(password, "admin", "0000");

        System.out.println("\n--- Login biometrico ---");
        servicio.iniciarSesion(
                biometrica, "HUELLA123", "HUELLA123"
        );
        servicio.iniciarSesion(
                biometrica, "HUELLA123", "HUELLA999"
        );

        System.out.println("\n--- Login con token OAuth ---");
        servicio.iniciarSesion(token, "TOKEN789", "");
        servicio.iniciarSesion(token, "TOKEN000", "");
    }
}
