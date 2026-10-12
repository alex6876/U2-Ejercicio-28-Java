public class ServicioLogin {

    public void iniciarSesion(MetodoAutenticacion metodo,
                              String credencialPrincipal,
                              String credencialSecundaria) {

        boolean resultado = metodo.autenticar(
                credencialPrincipal,
                credencialSecundaria
        );

        if (resultado) {
            System.out.println("Se ha autorizado correctamente");
        } else {
            System.out.println("Error de autenticacion");
        }
    }
}
