package main.java.abstractFactory;

public class UsuarioFactory implements abstractFactory{
    @Override
    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioNormal();
    }
}
