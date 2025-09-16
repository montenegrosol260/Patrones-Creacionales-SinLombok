package main.java.abstractFactory;

public class AdminFactory implements abstractFactory{
    public InterfazUI crearUI(){
        return new AdminUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioExpress();
    }
}
