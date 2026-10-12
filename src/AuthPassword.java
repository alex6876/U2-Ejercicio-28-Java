public  class AuthPassword implements MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {

        if (credencialPrincipal.equals("admin") && credencialSecundaria.equals("1234")) {
            return true;
        }else {
            return false;
        }
    }
}
