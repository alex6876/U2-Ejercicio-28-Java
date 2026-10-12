public interface MetodoAutenticacion {

    public abstract boolean autenticar(String credencialPrincipal,
                                       String credencialSecundaria);
}
