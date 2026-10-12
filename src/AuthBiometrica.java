public class AuthBiometrica implements MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        if (credencialPrincipal.equals("HUELLA123") && credencialSecundaria.equals("HUELLA123")) {
            return true;
        }else{
            return false;
        }
    }
}
