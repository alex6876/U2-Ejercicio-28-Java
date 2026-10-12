public class AuthTokenOAuth implements MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        if(credencialPrincipal.equals("Token123") && credencialSecundaria.equals("Token123")){
            return true;
        }else {
            return false;
        }
    }
}
